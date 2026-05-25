package HuuTaiDE190451.example.configs;

import HuuTaiDE190451.example.aspects.LoggingAspect;
import HuuTaiDE190451.example.pojos.Student;
import HuuTaiDE190451.example.services.StudentService;
import HuuTaiDE190451.example.services.StudentServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class AppConfig {

    @Bean
    public StudentService myService(){ return new StudentServiceImpl();

    }

    @Bean
    public LoggingAspect LoggingAspect(){ return new LoggingAspect();}
}
