import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * User: heihaier@xfuweng.com
 * Date: 2017/3/14
 * Time: 18:42
 */
public class Application {

    public static void main(String[] args) throws IOException {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-*.xml");
        context.start();
        System.in.read();
    }
}
