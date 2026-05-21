package huutaide190451.example.jpa_mapping.Service;

import huutaide190451.example.jpa_mapping.Entity.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    Student create(Student student);
    Optional<Student> getById(Long id);
    List<Student> getAll();
    Student update(Student student);
    void deleteById(Long id);
}
