package huutaide190451.example.jpa_mapping.Repository;

import huutaide190451.example.jpa_mapping.DAO.StudentDAO;
import huutaide190451.example.jpa_mapping.Entity.Student;

import java.util.List;
import java.util.Optional;

public class StudentRepositoryImpl implements StudentRepository {

    private final StudentDAO studentDAO;

    public StudentRepositoryImpl(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }

    @Override
    public Student save(Student student) {
        studentDAO.save(student);
        return student;
    }

    @Override
    public Optional<Student> findById(Long id) {
        return Optional.ofNullable(studentDAO.findById(id));
    }

    @Override
    public List<Student> findAll() {
        return studentDAO.findAll();
    }

    @Override
    public Student update(Student student) {
        studentDAO.update(student);
        return student;
    }

    @Override
    public void deleteById(Long id) {
        studentDAO.delete(id);
    }
}

