package in.sp.main;

import in.sp.beans.Employees;
import in.sp.beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        String config_loc = "in/sp/resources/applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(config_loc);

        Student stu = ((Student) context.getBean("stdId"));
        stu.display();
        System.out.println(" ");
        Employees employees = (Employees) context.getBean("EmployeeId");
        employees.Display();
    }
}
