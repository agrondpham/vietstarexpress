/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vietstarexpress.entities;

import com.vietstarexpress.entities.common.PersistenceEntity;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Long
 */
@Entity
@Table(name = "Account")
public class Account extends PersistenceEntity implements Serializable {

    private String Username;
    private String Password;
    private String Email;
    private String Address;
    @ManyToOne(fetch = FetchType.LAZY)
    public AccountType Type;

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public AccountType getType() {
        return Type;
    }

    public void setType(AccountType Type) {
        this.Type = Type;
    }
}
