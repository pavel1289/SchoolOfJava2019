package main;

import beans.TransactionRepository;
import beans.TransactionService;
import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context =
                     new AnnotationConfigApplicationContext(ProjectConfig.class)) {
            /*TransactionRepository transactionRepository =
                    context.getBean("transactionRepository2", TransactionRepository.class);
            TransactionRepository transactionRepository2 =
                    context.getBean("transactionRepository2", TransactionRepository.class);

            transactionRepository2.setNume("Singleton");
            System.out.println(transactionRepository);
            System.out.println(transactionRepository2); */

            TransactionService transactionService = context.getBean(TransactionService.class);
            System.out.println(transactionService);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
