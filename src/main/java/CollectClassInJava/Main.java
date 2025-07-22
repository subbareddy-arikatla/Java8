package CollectClassInJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){
        List<Employee> employeeList=new ArrayList<>();
        employeeList.add(new Employee(100, "Sundar", 47, "North America", 450000));
        employeeList.add(new Employee(200, "Pichai", 25, "North America", 50000));
        employeeList.add(new Employee(300, "Larry", 30, "Asia", 450000));
        employeeList.add(new Employee(400, "Page", 59, "Africa", 450000));
        List<String>names=employeeList.stream()
                .map(Employee::getName)
                .collect(Collectors.toList());
//        System.out.println(names);

        Set<Integer> idno=employeeList.stream()
                .map(Employee::getId)
                .collect(Collectors.toSet());
        List<String>regionNames=employeeList.stream()
                .map(Employee::getRegion)
                .collect(Collectors.toUnmodifiableList());

//        Set<String>regionNameded=employeeList.stream()
//                .map(Employee::getRegion)
//                .collect(Collectors.toUnmodifiableSet());
//        employeeList.stream().map(Employee::getName).collect(Collectors.groupingBy(Employee::))


    }
}
