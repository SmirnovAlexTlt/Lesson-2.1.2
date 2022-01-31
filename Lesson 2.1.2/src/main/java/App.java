import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld bean1 = (HelloWorld) applicationContext.getBean("helloworld");
        Cat catBean1 = (Cat) applicationContext.getBean("Cat");
        Cat catBean2 = (Cat) applicationContext.getBean("Cat");

        boolean compare = bean == bean1;
        boolean compare1 = catBean1 == catBean2;
        System.out.println(compare);
        System.out.println(compare1);
    }

}