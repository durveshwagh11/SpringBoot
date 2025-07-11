package in.sp.main;

import in.sp.beans.Student;
import in.sp.resources.SpringConfigFile;  // Make sure this is a valid @Configuration class
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);

        Student stu = (Student) context.getBean("stdId");
        stu.display();
        System.out.println(" ");
    }
}
