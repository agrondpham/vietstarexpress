/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vietstarexpress.services.common;

import com.vietstarexpress.entities.common.PersistenceEntity;
import java.util.Calendar;
import java.util.List;
import java.util.Set;
import javax.persistence.Convert;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author Long
 */
public class Repository<T extends PersistenceEntity> {
    public EntityManagerFactory emf;
    private EntityManager em;
    public Repository() {
        emf = Composable.getIntanceEmf();
    }
    public Repository(EntityManagerFactory pEmf) {
        this.emf = pEmf;
        
    }
    public T InsertOrUpdate(T object) {
        em=emf.createEntityManager();
        em.getTransaction().begin();
        try {
            if (object.Id==0) {
                object.Created = Calendar.getInstance().getTime();
                object.Updated = Calendar.getInstance().getTime();
            } else {
                object.Updated = Calendar.getInstance().getTime();
            }
            em.persist(object);
            em.getTransaction().commit();
            em.close();
            return object;
        } catch (Exception ex) {
            em.getTransaction().rollback();
            
            return null;
        }

    }
    public List<T> GetAll(String tableName){
        em=emf.createEntityManager();
        em.getTransaction().begin();
        try {
            List<T> data=em.createQuery("SELECT e FROM "+tableName+" e").getResultList();
            em.getTransaction().commit();
            em.close();
            return data;
        } catch (Exception ex) {
            em.getTransaction().rollback();
            
            return null;
        }
    }
}
