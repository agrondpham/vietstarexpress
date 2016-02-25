/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vietstarexpress.services.common;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Long
 */
public class Composable {
    private static EntityManagerFactory emf=null;
    public static EntityManagerFactory getIntanceEmf(){
        if(emf==null){
            emf=Persistence.createEntityManagerFactory("VietstarExpressPU");
        }
        return emf;
    }
}
