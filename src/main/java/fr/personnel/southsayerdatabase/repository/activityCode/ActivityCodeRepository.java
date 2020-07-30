package fr.personnel.southsayerdatabase.repository.activitycode;

import fr.personnel.southsayerdatabase.entity.activitycode.ActivityCode;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

/**
 * @author Farouk KABOUCHE
 * Activity Code Repository
 * @version 1.0
 */

public interface ActivityCodeRepository extends CrudRepository<ActivityCode, Integer> {
    Optional<List<ActivityCode>> findByCodActivite(String codActivite);

    Optional<List<ActivityCode>> findByLib1Like(String lib1);

    Optional<List<ActivityCode>> findByIdRayon(Long idRayon);

    Optional<List<ActivityCode>> findByRayon(String rayon);

    Optional<List<ActivityCode>> findByIdOap(String idOAP);

    void deleteByCodActivite(String codActivite);

}
