package HuuTaiDE190451.example.services;

import HuuTaiDE190451.example.pojos.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{
    @Override
    public void save(Student student){
        System.out.println("Save student! ");
    }
}
