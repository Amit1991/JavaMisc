package InterviewQues.wissen;

public interface EmployeeService {

    void addEmp(int empId, String dept);
    void updateEmp(int empId, String dept);
    void findByDept(String dept);
}
