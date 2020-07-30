package fr.personnel.southsayerdatabase.repository.rate;

import fr.personnel.southsayerdatabase.entity.rate.OAPDeliveryType;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

/**
 * @author Farouk KABOUCHE
 * OAP Delivery Type Repository
 * @version 1.0
 */

public interface OAPDeliveryTypeRepository extends CrudRepository<OAPDeliveryType, Integer> {
    Optional<List<OAPDeliveryType>> findByCodTypePrestationLike(String codTypePrestation);
    Optional<List<OAPDeliveryType>> findByLibTypePrestationLike(String libelleTypePrestation);
    Optional<List<OAPDeliveryType>> findByIdOap(Long idOAP);

    void deleteByCodTypePrestation(String codTypePrestation);

}
