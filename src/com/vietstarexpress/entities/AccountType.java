/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vietstarexpress.entities;

import com.vietstarexpress.entities.common.PersistenceEntity;
import java.io.Serializable;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Long
 */
@Entity
@Table(name = "Account_Type")
public class AccountType extends PersistenceEntity implements Serializable {

    private String Name;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "Type")
    private Set<Account> Accounts;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public Set<Account> getAccounts() {
        return Accounts;
    }

    public void setAccounts(Set<Account> Accounts) {
        this.Accounts = Accounts;
    }
}
