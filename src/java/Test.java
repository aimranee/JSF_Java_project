
import domain.EmployeeService;
import domain.ServiceService;
import entities.Employee;
import entities.Service;
import java.util.Date;

public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ServiceService seviceService = new ServiceService(null);
        EmployeeService employeService = new EmployeeService(null);
        
        Service service = new Service();
        Employee employee = new Employee();
        
        service.setCode("IT");
        service.setLibelle("Informatique");
        seviceService.create(service);
        
        
        
        employee.setNom("Essakhi");        
        employee.setPrenom("Aimrane");
        employee.setDateNaissance(new Date());
        employee.setPhoto("photo");
        employee.setService(service);
        employeService.create(employee);   
        
        System.out.println("Bien enregistrer");

    }
}
