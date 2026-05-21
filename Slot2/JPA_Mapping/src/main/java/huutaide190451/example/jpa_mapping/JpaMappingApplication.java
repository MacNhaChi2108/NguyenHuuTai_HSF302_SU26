package huutaide190451.example.jpa_mapping;

import huutaide190451.example.jpa_mapping.DAO.StudentDAO;
import huutaide190451.example.jpa_mapping.Entity.Student;
import huutaide190451.example.jpa_mapping.Repository.StudentRepository;
import huutaide190451.example.jpa_mapping.Repository.StudentRepositoryImpl;
import huutaide190451.example.jpa_mapping.Service.StudentService;
import huutaide190451.example.jpa_mapping.Service.StudentServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaMappingApplication {
    public static void main(String[] args) {
        SpringApplication.run(JpaMappingApplication.class, args);

        StudentRepository studentRepository = new StudentRepositoryImpl(new StudentDAO());
        StudentService studentService = new StudentServiceImpl(studentRepository);

        Student s = new Student();
        s.setEmail("huutai2122@gmail.com");
        s.setPassword("123456");
        s.setFirstName("Tai");
        s.setLastName("NH27");
        s.setMarks(85);

        Student created = studentService.create(s);
        System.out.println("CREATE OK -> id: " + created.getId());
    }

}
