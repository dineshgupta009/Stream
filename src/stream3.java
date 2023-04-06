package src;

import java.time.Duration;
import java.time.LocalTime;
import java.util.*;
import java.util.stream.Collectors;

public class stream3 {
    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<Employee>();

        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));

        // get employee The Highest  salary
        Optional<Employee> emp = employeeList.stream()
                .collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));

        System.out.println(emp.get());

        //get employee name  whose salary is second highest
       String str =  employeeList.stream().filter(s->s.salary >1 ).map(n-> n.name).sorted()
                .skip(1).findFirst().get();
        System.out.println("----------------------");
        System.out.println("Second Highest Salaried Person : " + str);


    }
}
