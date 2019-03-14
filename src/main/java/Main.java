import implementation.A;
import implementation.AB;
import implementation.B;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;

public class Main {

    public static void main(String[] args) {

//        A a = new A();
//        a.setName("Tom");
//        a.setAge(30);
//        a.printData();

        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
//        A a = context.getBean("pierwszy_bean", A.class);
//        a.printData();
//        A a2 = context.getBean("drugi_bean", A.class);
//        a2.printData();
//
//        B b = context.getBean("trzeci_bean", B.class);
//        b.printData();

        AB ab = context.getBean("AB_bean", AB.class);
        ab.getA().printData();
        ab.getB().printData();


    }
}
