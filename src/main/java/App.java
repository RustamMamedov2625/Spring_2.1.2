import model.Cat;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld helloWorld =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(helloWorld.getMessage());

        Cat cat1 = (Cat) applicationContext.getBean("cat");
        Cat cat2 = (Cat) applicationContext.getBean("cat");

        System.out.println(cat1.getSound());
        System.out.println(cat2.getSound());

        System.out.println("HelloWorld beans are the same: " + (helloWorld == helloWorld));
        System.out.println("Cat beans are the same: " + (cat1 == cat2));
    }
}