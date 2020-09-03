/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicomfacauca.app.controlador;

import com.unicomfacauca.app.controlador.exceptions.NonexistentEntityException;
import com.unicomfacauca.app.modelo.Estudiante;
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
 * @author aleja
 */
public class EstudianteJpaController implements Serializable {

    public EstudianteJpaController() {
        
        this.emf = Persistence.createEntityManagerFactory("ChildrenColorsAppPU");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void crear(Estudiante estudiante) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(estudiante);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void editar(Estudiante estudiante) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            estudiante = em.merge(estudiante);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = estudiante.getId();
                if (buscarEstudiantePorId(id) == null) {
                    //throw new NonexistentEntityException("The estudiante with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void eliminar(Integer id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Estudiante estudiante;
            try {
                estudiante = em.getReference(Estudiante.class, id);
                estudiante.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The estudiante with id " + id + " no longer exists.", enfe);
            }
            em.remove(estudiante);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Estudiante> buscarEstudiantes() {
        return buscarEstudiantes(true, -1, -1);
    }

    public List<Estudiante> buscarEstudiantes(int maxResults, int firstResult) {
        return buscarEstudiantes(false, maxResults, firstResult);
    }

    private List<Estudiante> buscarEstudiantes(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Estudiante.class));
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

    public Estudiante buscarEstudiantePorId(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Estudiante.class, id);
        } finally {
            em.close();
        }
    }
    
    public Estudiante buscarEstudiantePorUsuarioYClave(String usuario, String clave){
        EntityManager em = getEntityManager();
        try {
            Query q = em.createNamedQuery("Estudiante.findByUsernameAndClave");
            q.setParameter("username", usuario);
            q.setParameter("clave", clave);
            final List<Estudiante> lista = q.getResultList();
            if(lista.isEmpty()){
                System.out.println("No se encontró registros con esos parametros usuario: "+usuario+"   , clave: "+clave);
                return null;
            }else{
                return lista.get(0);
            }            
        } finally {
            em.close();
        }
    }

}
