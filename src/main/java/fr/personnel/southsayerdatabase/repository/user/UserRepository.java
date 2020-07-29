package fr.personnel.southsayerdatabase.repository.user;

import fr.personnel.southsayerdatabase.entity.user.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

/**
 * @author Farouk KABOUCHE
 * Users Repository
 * @version 1.0
 */

public interface UserRepository extends CrudRepository<User, Integer> {
    Optional<User> findByIdUser(String idUser);
    void deleteByIdUser(String idUser);
}
