package dio.andreldp.springdatajpa;

import dio.andreldp.springdatajpa.model.User;
import dio.andreldp.springdatajpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartApp implements CommandLineRunner {

    @Autowired
    private UserRepository repository;
    @Override
    public void run(String... args) throws Exception {

        User user = new User();
        user.setName("Andre luis domingos");
        user.setPassword("andreluis123");
        user.setUsername("andrerj2000");


        repository.save(user);

        for (User user1: repository.findAll()){
            System.out.println(user1);
        }

    }
}
