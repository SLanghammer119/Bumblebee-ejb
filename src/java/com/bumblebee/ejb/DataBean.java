/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bumblebee.ejb;

import com.bumblebee.ctrl.DataBeanRemote;
import java.io.Serializable;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Stefanie Langhammer
 */
@Stateless(mappedName = "ejb/dataBean")
public class DataBean implements DataBeanRemote, Serializable {
    @PersistenceContext
    private EntityManager em;

   
}
