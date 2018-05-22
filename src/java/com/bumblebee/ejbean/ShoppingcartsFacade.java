/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bumblebee.ejbean;

import com.bumblebee.model.Shoppingcarts;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Teilnehmer2
 */
@Stateless
public class ShoppingcartsFacade extends AbstractFacade<Shoppingcarts> {

    @PersistenceContext(unitName = "Onlineshop_Bumblebee-webPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ShoppingcartsFacade() {
        super(Shoppingcarts.class);
    }
    
}
