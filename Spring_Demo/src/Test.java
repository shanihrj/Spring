
//using filesystemxmlapplication contex using J2EE container
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext act=new FileSystemXmlApplicationContext("G:/spring/bean.xml");
	
	Object obj=act.getBean("e");
	Employee e=(Employee)obj;
	System.out.println(e);
}
}
