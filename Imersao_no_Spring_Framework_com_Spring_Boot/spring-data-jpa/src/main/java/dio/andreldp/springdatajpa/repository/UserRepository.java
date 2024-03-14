package dio.andreldp.springdatajpa.repository;

import dio.andreldp.springdatajpa.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User,Integer> {
}
