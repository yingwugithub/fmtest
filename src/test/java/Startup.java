import fmtest.RadioTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * Created by dfn on 15/9/28.
 */
public class Startup {


    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:fmtest/spring-config-dao.xml");

        RadioTest radioTest = ctx.getBean("radioTest", RadioTest.class);
        System.out.println(radioTest);
    }
}
