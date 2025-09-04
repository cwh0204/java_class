package step1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import step2.ProjectConfig;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
		Parrot p = context.getBean("parrot02",Parrot.class);
		
		System.out.println(p.getName());
		System.out.println("sadasdsadasd");
	}
}
