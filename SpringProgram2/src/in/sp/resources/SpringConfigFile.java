package in.sp.resources;

import in.sp.beans.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfigFile {

    @Bean(name = "stdId")
    public Student studentBean() {
        Student stu = new Student();
        stu.setName("Durvesh Wagh");
        stu.setRollNo(101);
        stu.setEmail("durvesh@example.com");
        return stu;
    }
}
