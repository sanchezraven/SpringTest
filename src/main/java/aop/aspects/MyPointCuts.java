package aop.aspects;
import org.aspectj.lang.annotation.*;

public class MyPointCuts {

    @Pointcut("execution(* abc*(..))")
    public void allAddMethods() {}
}
