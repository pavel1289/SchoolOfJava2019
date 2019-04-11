package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import repositories.TransactionRepository;
import service.TransactionService;

@Configuration
@ComponentScan(basePackages = {"repositories", "service"})
public class ProjectConfig {
    @Bean
    public TransactionRepository transactionRepository() {
        TransactionRepository transactionRepository = new TransactionRepository();
        transactionRepository.setName("Transaction 1");
        return transactionRepository;
    }
}
