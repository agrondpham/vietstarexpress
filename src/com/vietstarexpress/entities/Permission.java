/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vietstarexpress.entities;

import com.vietstarexpress.entities.common.PersistenceEntity;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author Long
 */
@Entity
@Table(name = "Permission")
public class Permission extends PersistenceEntity{
    private String Area;
    private Boolean IsAllowed;
    private AccountType AccountType;

    public String getArea() {
        return Area;
    }

    public void setArea(String Area) {
        this.Area = Area;
    }

    public Boolean getIsAllowed() {
        return IsAllowed;
    }

    public void setIsAllowed(Boolean IsAllowed) {
        this.IsAllowed = IsAllowed;
    }

    public AccountType getAccountType() {
        return AccountType;
    }

    public void setAccountType(AccountType AccountType) {
        this.AccountType = AccountType;
    }
    
}
