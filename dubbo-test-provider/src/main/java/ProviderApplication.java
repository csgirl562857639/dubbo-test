import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * User: heihaier@xfuweng.com
 * Date: 2017/3/15
 * Time: 12:23
 */
public class ProviderApplication {

    public static void main(String[] args) throws IOException {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-*.xml");
        context.start();
        System.in.read();
    }
}
