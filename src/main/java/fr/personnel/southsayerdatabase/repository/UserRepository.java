package fr.personnel.southsayerdatabase.repository;

import fr.personnel.southsayerdatabase.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * @author Farouk KABOUCHE
 *
 * Users Repository
 */

public interface UserRepository extends CrudRepository<User, Integer> {
    Optional<User> findByIdUser(String idUser);
    void deleteUserByIdUser(String idUser);
}
