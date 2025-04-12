package aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AroundAspect {

    @Around("execution(public String returnBook())")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("aroundReturnBookLoggingAdvice: in Library trying return book");

        Object targetMethodResult = null;
//        long begin = System.currentTimeMillis();
        try {
            targetMethodResult = proceedingJoinPoint.proceed();
        } catch (Exception e) {
            System.out.println("aroundReturnBookLoggingAdvice: took a exception" + e);
            throw e;
        }

//        long end = System.currentTimeMillis();

        System.out.println("aroundReturnBookLoggingAdvice: in Library successfully return book");
//        System.out.println("targetMethodResult took " + (end-begin) + " ms");
        return targetMethodResult;
    }
}
