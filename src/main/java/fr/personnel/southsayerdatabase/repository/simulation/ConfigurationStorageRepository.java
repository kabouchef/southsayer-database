package fr.personnel.southsayerdatabase.repository.simulation;

import fr.personnel.southsayerdatabase.entity.simulation.ConfigurationStorage;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

/**
 * @author Farouk KABOUCHE
 *
 * Configuration Storage Repository
 */

public interface ConfigurationStorageRepository extends CrudRepository<ConfigurationStorage, Integer> {
    Optional<ConfigurationStorage> findByConfId(String confId);
    List<ConfigurationStorage> findByConfCategIdAndConfIdLike(String confCategId, String confId);
    List<ConfigurationStorage> findByConfCategIdLikeAndConfIdLike(String confCategId, String confId);
    int countByConfCategIdLikeAndConfIdLike(String confCategId, String confId);

}
