package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
 //   @Before("execution(public  void getBook())")
 //   public void beforeGetBookAdvice(){
 //       System.out.println("beforeGetBookAdvice: trying get book");
 //   }

    @Pointcut("execution(* aop.UniLibrary.get*())")
    private void allGetMethodsUniLibrary(){}

    @Pointcut("execution(* aop.UniLibrary.return*())")
    private void allReturnMethodsUniLibrary(){}

    @Pointcut("allGetMethodsUniLibrary() || allReturnMethodsUniLibrary()")
    private void allGetAndMethodsFromUnitLibrary(){}


    @Before("allGetMethodsUniLibrary()")
    public void beforeGetLoggingAdvice(){
        System.out.println("beforeGetLoggingAdvice: writing log 1");

    }

    @Before("allReturnMethodsUniLibrary()")
    public void beforeReturnLoggingAdvice(){
        System.out.println("beforeReturnLoggingAdvice: writing log 2");

    }

    @Before("allGetAndMethodsFromUnitLibrary()")
    public void beforeGetAndReturnLoggingAdvice(){
        System.out.println("beforeGetAndReturnLoggingAdvice: writing log 1");

    }
}
