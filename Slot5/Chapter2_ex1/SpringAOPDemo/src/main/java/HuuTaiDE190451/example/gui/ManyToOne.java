package HuuTaiDE190451.example.gui;

import HuuTaiDE190451.example.configs.AppConfig;
import HuuTaiDE190451.example.pojos.Student;
import HuuTaiDE190451.example.services.StudentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ManyToOne {

    public static void main(String[] args) {


        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        StudentService myService =
                context.getBean(StudentService.class);

        Student st = new Student("Tai", "Nguyen", 10);

        myService.save(st);
    }
}
