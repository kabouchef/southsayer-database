package fr.personnel.southsayerdatabase.entity.oap;

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
 * Configuration Storage Entity
 */

@Data
@With
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "T_OAP_IDENTIFIANT_TARIF")
public class OAPIdenfiantTarif {

    /**
     * Identifiant
     */
    @Id
    @JoinColumn(name = "IDENTIFIANT", nullable = false, unique = true)
    private String identifiant;
    /**
     * Libellé identifiant
     */
    @JoinColumn(name = "LIBELLE_IDENTIFIANT", nullable = false)
    private String codTypePrestation;
}
