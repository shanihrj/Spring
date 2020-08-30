import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class Test4 {
public static void main(String[] args) {
	Resource r =new FileSystemResource("G:/spring/bean.xml");
	BeanFactory bean=new XmlBeanFactory(r);
	Object obj=bean.getBean("e");
	Employee e=(Employee) obj;
	System.out.println(e);
}
}
