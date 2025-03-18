package aop.aspects;
import org.aspectj.lang.annotation.*;


import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class SecurityAspect {

    @Before("aop.aspects.MyPointCuts.allAddMethods()")
    public void beforeAddSecurityAdvice() {
        System.out.println("beforeGetSecurityAdvice: check rights to get book/magazine");
        System.out.println("--------------------------------------");
    }
}
