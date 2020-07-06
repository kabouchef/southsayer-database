package fr.personnel.southsayerdatabase.repository.rate;

import fr.personnel.southsayerdatabase.entity.rate.OAPDeliveryRateDetails;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

/**
 * @author Farouk KABOUCHE
 * <p>
 * OAP Delivery Rate Details Repository
 */

public interface OAPDeliveryRateDetailsRepository extends CrudRepository<OAPDeliveryRateDetails, Integer> {
    Optional<List<OAPDeliveryRateDetails>> findByIdentifiantLike(String id);

    Optional<List<OAPDeliveryRateDetails>> findByIdentifiantLikeAndDesignationLike(String id, String designation);

    Optional<List<OAPDeliveryRateDetails>> findByIdentifiantLikeAndLibelleIdentifiantLike(String id, String libelleId);

    void deleteByIdentifiant(String identifiant);
}
