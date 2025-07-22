package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args){
        Service service=new Service(new ArrayList<>());
        service.addEmployee(new Employee(100, "Sundar", 47, "North America", 450000));

        service.addEmployee(new Employee(200, "Pichai", 25, "North America", 50000));
        service.addEmployee( new Employee(300, "Larry", 30, "Asia", 450000));
        service.addEmployee( new Employee(400, "Page", 59, "Africa", 450000));
//        System.out.println(service.getAllEmployee());
        Optional<Employee> employee= Optional.ofNullable(service.getEmployee(401));
        System.out.println(employee);
        service.delete(301);
    }

}
