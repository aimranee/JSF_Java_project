/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;
import abstractFacade.AbstractFacade;
import entities.Employee;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class EmployeeService extends AbstractFacade<Employee> {

    public EmployeeService(Class<Employee> entityClass) {
        super(entityClass);
    }
    
}
