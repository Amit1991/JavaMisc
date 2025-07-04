package general;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.*;
import java.util.Objects;
import java.util.logging.Logger;

@Data @NoArgsConstructor @AllArgsConstructor
class BadEmployee implements Serializable {
    private int badId;
    private String badName;
    private int badAge;
    private double badSalary;
}

@Data @AllArgsConstructor @NoArgsConstructor
class Employee implements Externalizable, Serializable {

    private int id;
    private String name;
    private int age;
    private double salary;
    private transient long cibilScore;
    private int unserializedVariable;

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeInt(id);
        out.writeUTF(name);
        out.writeInt(age);
        out.writeDouble(salary);
        out.writeLong(cibilScore);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException {
        id = in.readInt();
        name = in.readUTF();
        age = in.readInt();
        salary = in.readDouble();
        cibilScore = in.readLong();
    }
}

public class ExternalizationExample {

    public static void main(String[] args) throws IOException {

        FileOutputStream fio = null;
        ObjectOutputStream oos = null;
        FileInputStream fi = null;
        ObjectInputStream si = null;

        Logger logger = Logger.getLogger(ExternalizationExample.class.getName());

        try 
        {
            Employee employee = new Employee(1, "अमित", 35, 20.56, 782, 576);
            fio = new FileOutputStream("employee.txt");
            oos = new ObjectOutputStream(fio);
            oos.writeObject(employee);

            BadEmployee badEmployee = new BadEmployee(11, "अमित kumar", 38, 1.56);
            fio = new FileOutputStream("badEmployee.txt");
            oos = new ObjectOutputStream(fio);
            oos.writeObject(badEmployee);
            
            fi = new FileInputStream("employee.txt");
            si = new ObjectInputStream(fi);
            Employee e = (Employee) si.readObject();

            fi = new FileInputStream("badEmployee.txt");
            si = new ObjectInputStream(fi);
            BadEmployee be = (BadEmployee) si.readObject();

            System.out.println(e);
            System.out.println(be);
        } catch (Exception e) {
            logger.severe(e.getMessage());
        } finally {

            try
            {
                Objects.requireNonNull(oos).flush();
                Objects.requireNonNull(fio).close();
                Objects.requireNonNull(si).close();
                Objects.requireNonNull(fi).close();
            } catch (Exception ioe) {
                logger.severe(ioe.getMessage());
            }
        }
    }
}
