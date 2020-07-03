package fr.personnel.southsayerdatabase.repository;

import fr.personnel.southsayerdatabase.entity.ConfigurationStorage;
import org.springframework.data.repository.CrudRepository;

import java.sql.Clob;
import java.util.List;
import java.util.Optional;

/**
 * @author Farouk KABOUCHE
 * <p>
 * Configuration Storage Repository
 */

public interface ConfigurationStorageRepository extends CrudRepository<ConfigurationStorage, Integer> {
    Optional<ConfigurationStorage> findByConfId(String confId);
    List<ConfigurationStorage> findByConfCategId(String confCategId);
    List<ConfigurationStorage> findByConfCategIdAndXmlConfLike(String confCategId, String xmlConf);
}
