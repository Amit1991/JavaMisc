package InterviewQues.wissen;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EmployeeServiceImpl implements EmployeeService {

    static Set<Employee> employees = new HashSet<>();

    @Override
    public void addEmp(int empId, String dept) {

        Set<Employee> employeeSet = new HashSet<>();
        if(employees != null)
        {
            employeeSet.addAll(employees);
        }
        employeeSet.add(new Employee(empId, dept));
        employees = employeeSet;

        System.out.println(employees);
    }

    @Override
    public void updateEmp(int empId, String dept) {

        Set<Employee> employeeSet = new HashSet<>(employees);
        employeeSet.add(new Employee(empId, dept));
        employees = employeeSet;

        System.out.println(employees);
    }

    @Override
    public void findByDept(String dept) {

        Map<String, List<Employee>> dataMap = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDept,
                            Collectors.mapping(Function.identity(), Collectors.toList())));

        List<Employee> employeeList = dataMap.get(dept);
        System.out.println("Found: " + employeeList);
    }
}
