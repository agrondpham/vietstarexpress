/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vietstarexpress.services;

import com.vietstarexpress.entities.Country;
import com.vietstarexpress.entities.Province;
import com.vietstarexpress.services.common.BaseService;
import com.vietstarexpress.services.common.Repository;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Long
 */
public class CountryService extends BaseService<Country>{
    public Repository<Province> provinceRep;
    
    public CountryService() {
        provinceRep=new Repository<Province>(this.repository.emf);
    }
    public CountryService(EntityManagerFactory emf) {
        this.repository.emf=emf;
        provinceRep=new Repository<Province>(this.repository.emf);
    }
    public Province InsertAndUpdateProvince(Province p){
        return provinceRep.InsertOrUpdate(p);
    }
    public List<Province> GetAllProvince(){
        String className=Province.class.toString();
        return provinceRep.GetAll(className.substring(className.lastIndexOf('.') + 1));
    }
}
