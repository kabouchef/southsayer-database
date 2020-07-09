package fr.personnel.southsayerdatabase.repository.activityCode;

import fr.personnel.southsayerdatabase.entity.activityCode.ActivityCode;
import fr.personnel.southsayerdatabase.entity.simulation.ConfigurationStorage;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

/**
 * @author Farouk KABOUCHE
 *
 * Activity Code Repository
 */

public interface ActivityCodeRepository extends CrudRepository<ActivityCode, Integer> {
    Optional<List<ActivityCode>> findByCodActivite(String codActivite);

    Optional<List<ActivityCode>> findByLib1Like(String lib1);

    Optional<List<ActivityCode>> findByIdRayon(Long idRayon);

    Optional<List<ActivityCode>> findByRayon(String rayon);

    void deleteByCodActivite(String codActivite);

}