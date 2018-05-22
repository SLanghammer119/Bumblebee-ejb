/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bumblebee.ejbean;

import com.bumblebee.model.Shoppingitems;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Teilnehmer2
 */
@Stateless
public class ShoppingitemsFacade extends AbstractFacade<Shoppingitems> {

    @PersistenceContext(unitName = "Onlineshop_Bumblebee-webPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ShoppingitemsFacade() {
        super(Shoppingitems.class);
    }
    
}
