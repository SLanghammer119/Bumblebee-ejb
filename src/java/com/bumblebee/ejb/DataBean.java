/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bumblebee.ejb;

import com.bumblebee.ctrl.DataBeanRemote;
import com.bumblebee.model.Customer;
import java.io.Serializable;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Stefanie Langhammer
 */
@Stateless(mappedName = "ejb/dataBean")
public class DataBean implements DataBeanRemote, Serializable {
    @PersistenceContext
    private EntityManager em;

    public DataBean() {
    }
    

    @Override
    public Customer getCustomer(String email) {
        Query q = em.createNamedQuery("Customers.findByEmail", Customer.class);
        q.setParameter("email", email);
        return (Customer) q.getSingleResult();
    }
    
    

   
}
