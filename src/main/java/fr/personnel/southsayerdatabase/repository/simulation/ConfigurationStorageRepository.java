package fr.personnel.southsayerdatabase.repository.simulation;

import fr.personnel.southsayerdatabase.entity.simulation.ConfigurationStorage;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

/**
 * @author Farouk KABOUCHE
 * Configuration Storage Repository
 * @version 1.0
 */

public interface ConfigurationStorageRepository extends CrudRepository<ConfigurationStorage, Integer> {

    Optional<ConfigurationStorage> findByConfId(String confId);

    ConfigurationStorage findByConfIdLike (String confId);

    Optional<List<ConfigurationStorage>> findByConfCategIdLike(String confId);

    List<ConfigurationStorage> findByConfCategIdLikeAndConfIdLike(String confCategId, String confId);

    int countByConfCategIdLikeAndConfIdLike(String confCategId, String confId);

}
