import com.heihaier.dubbo.demo.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * User: heihaier@xfuweng.com
 * Date: 2017/3/15
 * Time: 12:17
 */
public class ConsumerApplication {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-*.xml");
        context.start();
        DemoService demoService = (DemoService) context.getBean("demoService");
        String result = demoService.say("heihaier");
        System.out.println(result);
    }
}
