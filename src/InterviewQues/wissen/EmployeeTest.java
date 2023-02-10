package InterviewQues.wissen;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmployeeTest {

    public static void main(String[] args) {

        EmployeeServiceImpl e = new EmployeeServiceImpl();
        e.addEmp(1, "HR");
        e.addEmp(2, "HR");
        e.addEmp(1, "IT");
        e.addEmp(3, "MGMT");

        e.updateEmp(1, "QA");

        e.findByDept("HR");
    }

    @Test
    public void testAddEmployee() {

        int beforeSize = EmployeeServiceImpl.employees.size();
        new EmployeeServiceImpl().addEmp(1,"HR");

        Assertions.assertEquals(beforeSize+1, EmployeeServiceImpl.employees.size());
    }
}
