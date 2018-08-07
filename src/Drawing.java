import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class Drawing {
    public static void main(String[] args) {
        //without using spring
        //Triangle triangle = new Triangle();
        //triangle.draw();

        //with spring
        //note how we are not doing a 'new Triangle();'
        BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
        Triangle triangle = (Triangle) factory.getBean("triangle");//the xml id
        triangle.draw();
    }
}
