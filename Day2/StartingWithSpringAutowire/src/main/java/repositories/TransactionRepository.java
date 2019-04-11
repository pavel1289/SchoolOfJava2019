package repositories;

import org.springframework.stereotype.Repository;

@Repository
public class TransactionRepository {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "TransactionRepository{" +
                "name='" + name + '\'' +
                '}';
    }
}
