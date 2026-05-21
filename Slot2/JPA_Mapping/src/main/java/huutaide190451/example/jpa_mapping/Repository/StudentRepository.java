package huutaide190451.example.jpa_mapping.Repository;

import huutaide190451.example.jpa_mapping.Entity.Student;
import java.util.List;
import java.util.Optional;

public interface StudentRepository {
    Student save(Student student);
    Optional<Student> findById(Long id);
    List<Student> findAll();
    Student update(Student student);
    void deleteById(Long id);
}