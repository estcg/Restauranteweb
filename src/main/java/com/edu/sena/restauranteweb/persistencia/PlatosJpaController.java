/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edu.sena.restauranteweb.persistencia;

import com.edu.sena.restauranteweb.logica.Platos;
import com.edu.sena.restauranteweb.persistencia.exceptions.NonexistentEntityException;
import com.edu.sena.restauranteweb.persistencia.exceptions.PreexistingEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author Programer
 */
public class PlatosJpaController implements Serializable {

    public PlatosJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
       public PlatosJpaController() {
        this.emf = Persistence.createEntityManagerFactory("XYZ_PU");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    
    
    
    public void create(Platos platos) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(platos);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findPlatos(platos.getCodigo()) != null) {
                throw new PreexistingEntityException("Platos " + platos + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Platos platos) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            platos = em.merge(platos);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = platos.getCodigo();
                if (findPlatos(id) == null) {
                    throw new NonexistentEntityException("The platos  with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Platos platos;
            try {
                platos = em.getReference(Platos.class, id);
                platos.getCodigo();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The platos with id " + id + " no longer exists.", enfe);
            }
            em.remove(platos);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Platos> findPlatosEntities() {
        return findPlatosEntities(true, -1, -1);
    }

    public List<Platos> findPlatosEntities(int maxResults, int firstResult) {
        return findPlatosEntities(false, maxResults, firstResult);
    }

    private List<Platos> findPlatosEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Platos.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Platos findPlatos(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Platos.class, id);
        } finally {
            em.close();
        }
    }

    public int getPlatosCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Platos> rt = cq.from(Platos.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
