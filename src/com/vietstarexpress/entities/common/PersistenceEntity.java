/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vietstarexpress.entities.common;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;

/**
 *
 * @author Long
 */
@MappedSuperclass
abstract public class PersistenceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long Id;
    public Date Updated;
    public Date Created;

    public long getId() {
        return Id;
    }

    public Date getUpdated() {
        return Updated;
    }

    public void setUpdated(Date Updated) {
        this.Updated = Updated;
    }

    public Date getCreated() {
        return Created;
    }

    public void setCreated(Date Created) {
        this.Created = Created;
    }

}
