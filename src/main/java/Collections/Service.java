package Collections;

import java.util.List;
import java.util.Optional;

public class Service {

    private List<Employee> employeeList;

    public Service(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }
    public List<Employee> getAllEmployee(){
        return employeeList.stream().toList();
    }
    public void delete(int id) {
        Optional.ofNullable(getEmployee(id))
                .ifPresent(emp -> employeeList.remove(emp));
        // Print remaining employees
        for (Employee e : employeeList) {
            System.out.println(e);
        }
    }
    public Employee getEmployee(int id){
        List<Employee>employeeList=getAllEmployee();

        return employeeList.stream()
                .filter(emp->emp.getId()==id)
                .findFirst()
                .orElse(null);
    }


}
