/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vietstarexpress.services.common;


import com.vietstarexpress.entities.common.PersistenceEntity;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Long
 * @param <T>
 */
public class BaseService<T extends PersistenceEntity>  {

    public final Repository<T> repository;

    public BaseService() {
        repository=new Repository<T>();
    }

    public T InsertOrUpdate(T object){
        return repository.InsertOrUpdate(object);
    }
}
