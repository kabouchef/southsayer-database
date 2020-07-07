package fr.personnel.southsayerdatabase.entity.rate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.With;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;


/**
 * @author Farouk KABOUCHE
 *
 * OAP Delivery Type Entity
 */

@Data
@With
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "T_OAP_TYPE_PRESTATION")
public class OAPDeliveryType {

    /**
     * Code Type Prestation
     */
    @Id
    @JoinColumn(name = "COD_TYPE_PRESTATION", nullable = false)
    private String codTypePrestation;
    /**
     * Libellé Type Prestation
     */
    @JoinColumn(name = "LIB_TYPE_PRESTATION", nullable = false)
    private String libTypePrestation;
    /**
     * Id OAP
     */
    @JoinColumn(name = "ID_OAP", nullable = false)
    private Long idOap;
}
