package InterviewQues.wissen;

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
}
