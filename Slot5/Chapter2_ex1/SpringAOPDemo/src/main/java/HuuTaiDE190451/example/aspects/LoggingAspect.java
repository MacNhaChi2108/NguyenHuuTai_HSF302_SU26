package HuuTaiDE190451.example.aspects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

    private static final Logger logger =
            LogManager.getLogger(LoggingAspect.class);

    public LoggingAspect() {
        // PropertyConfigurator.configure("src/main/resources/log4j.properties");
    }

    @Before("execution(* HuuTaiDE190451.example.services.StudentServiceImpl.save(..))")
    public void logBefore() {

        logger.debug("LoggingAspect: Before method Save Student()");
        System.out.println("LoggingAspect: Before method Save Student()");
    }

    @After("execution(* HuuTaiDE190451.example.services.StudentServiceImpl.save(..))")
    public void logAfter() {

        logger.debug("LoggingAspect: After method Save Student()");
        System.out.println("LoggingAspect: After method Save Student()");
    }
}
