package myexample.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		YourFriend yourFriend = context.getBean(YourFriend.class);
		PrintSimple ps = context.getBean(PrintSimple.class);
		ps.printLittleThing("This is only a test");
		System.out.println(ps.toString());
		yourFriend.printToString();
		context.close();;
	}

}
