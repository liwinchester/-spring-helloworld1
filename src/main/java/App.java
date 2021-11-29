import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        boolean hello = bean == bean1;
        System.out.println(hello);

        Cat beanCat=
                (Cat) applicationContext.getBean("cat");
        Cat beanCat1=
                (Cat) applicationContext.getBean("cat");
        boolean nameCat = beanCat == beanCat1;
        System.out.println(nameCat);
    }
}