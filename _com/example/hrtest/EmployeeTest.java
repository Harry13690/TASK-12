package _com.example.hrtest;
import com.example.hr.Employee;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee e = new Employee("harry", 31, 9999.99);

        e.printName();
        e.printSalary();
    }
}
