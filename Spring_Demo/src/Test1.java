
//using classpathxmlapplicationcontext using J2EE Container
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test1 {
public static void main(String[] args) {
	ApplicationContext act=new ClassPathXmlApplicationContext("bean.xml");
	
	Object obj=act.getBean("e");
	Employee e=(Employee)obj;
	System.out.println(e);
}
}
