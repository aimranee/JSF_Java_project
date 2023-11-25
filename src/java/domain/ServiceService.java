/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import abstractFacade.AbstractFacade;
import entities.Service;

/**
 *
 * @author aimrane
 */
public class ServiceService extends AbstractFacade<Service> {

    public ServiceService(Class<Service> entityClass) {
        super(entityClass);
    }
    
}
