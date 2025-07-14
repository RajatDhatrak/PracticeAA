package COM;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Controller {
public static void main(String[] args) {
  	ApplicationContext apc= new ClassPathXmlApplicationContext("Beans.xml");
  Student student = apc.getBean("stu",Student.class);
  System.out.println(student);
	
	}
}
