import databaseConfig.DatabaseConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import repository.PersonRepository;

public class Main {
    public static void main(String[] args) {
        try(final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DatabaseConfig.class)) {
            PersonRepository personRepository = context.getBean(PersonRepository.class);
            personRepository.getPeople().forEach(System.out::println);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
