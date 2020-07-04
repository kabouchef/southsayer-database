package fr.personnel.southsayerdatabase.repository.storage;

import fr.personnel.southsayerdatabase.entity.storage.ConfigurationStorage;
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
    List<ConfigurationStorage> findByConfCategId(String confCategId);
    List<ConfigurationStorage> findByConfCategIdLike(String confCategId);
    List<ConfigurationStorage> findByConfCategIdAndXmlConfLike(String confCategId, String xmlConf);
}
