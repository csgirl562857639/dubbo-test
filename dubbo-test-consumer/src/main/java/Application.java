import com.dubbo.demo.Consumer.DemoAction;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.TimeUnit;

/**
 * User: heihaier@xfuweng.com
 * Date: 2017/3/14
 * Time: 19:06
 */
public class Application {

    public static void main(String[] args) throws InterruptedException {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-*.xml");
        context.start();
//        DemoService demoService = (DemoService) context.getBean("demoService");
//        String result = demoService.say("heihaier");
//        System.out.println(result);

        DemoAction demoAction = (DemoAction) context.getBean("demoAction");
        while (true) {
            System.out.println(demoAction.test());
            TimeUnit.SECONDS.sleep(2);
        }
    }
}
