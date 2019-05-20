import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(AppConfiguration.class)
public class Main {

    public void test() {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfiguration.class);
        ctx.refresh();
        Student st = ctx.getBean(Student.class);
        st.display();
        st.displayAge(20);
        st.setName("Pavel");
        st.setFacultate("FMI");
        System.out.println(st.getName() + " try");
        System.out.println(st.getFacultate() + " try");
        //TODO exemples
    }
    public static void main(String[] args) {
       new Main().test();
    }
}
