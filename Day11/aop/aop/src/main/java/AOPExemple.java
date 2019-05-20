import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class AOPExemple {
    @Pointcut("execution(* Student.display())")
    public void methodNameBeforeMethod() {}

    @Pointcut("execution(* Student.*(..))")
    public void printAfterEveryMethod() {}
/*
    @Before(value = "methodNameBeforeMethod()")
    public void printNameBefore2(JoinPoint jp) {
        System.out.println("Name of the method before the method2: " + jp.getSignature());
    }

    @Before(value = "methodNameBeforeMethod()")
    public void printNameBefore(JoinPoint jp) {
        System.out.println("Name of the method before the method: " + jp.getSignature());
    }

    @Before("execution(* Student.display())")
    public void printNameDirectBefore(JoinPoint jp) {
        System.out.println("Name before direct before: " + jp.getSignature());
    }

    @Before("execution(* Student.display())")
    public void printNameDirectBefore2(JoinPoint jp) {
        System.out.println("Name before direct before2: " + jp.getSignature());
    }

    @After(value = "printAfterEveryMethod()")
    public void printAfterMethods(JoinPoint jp) {
        System.out.println("Print after every method " + jp.getSignature().getName());
    }*/

    @Around("execution(* Student.*(..))")
    public void printAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        System.out.println("Before " + proceedingJoinPoint.getSignature());
        Object o = proceedingJoinPoint.proceed();
        if (o == null)
            System.out.println("NULLLLLLL");
        System.out.println("After " + proceedingJoinPoint.getSignature());
    }
}
