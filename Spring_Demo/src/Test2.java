
//Creating object of java using core container class path resourse
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test2 {
public static void main(String[] args) {
	Resource r =new ClassPathResource("bean.xml");
	BeanFactory bean=new XmlBeanFactory(r);
	Object obj=bean.getBean("e");
	Employee e=(Employee)obj;
	System.out.println(e);
}
}
