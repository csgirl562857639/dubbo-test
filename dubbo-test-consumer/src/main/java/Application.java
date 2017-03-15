import com.dubbo.demo.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * User: heihaier@xfuweng.com
 * Date: 2017/3/14
 * Time: 19:06
 */
public class Application {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-*.xml");
        context.start();
        DemoService demoService = (DemoService) context.getBean("demoService");
        String result = demoService.say("heihaier");
        System.out.println(result);
    }
}
