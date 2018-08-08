import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Drawing {
    public static void main(String[] args) {
        //without using spring
        //Triangle triangle = new Triangle();
        //triangle.draw();

        //with spring
        //note how we are not doing a 'new Triangle();'
        //will be more useful with more complicated objects
        //BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");//do not have to make filesystemresource
        Triangle triangle = (Triangle) context.getBean("triangle");//the xml id
        triangle.draw();
    }
}
