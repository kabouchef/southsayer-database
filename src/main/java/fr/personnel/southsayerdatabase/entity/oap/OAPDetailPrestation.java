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
@Table(name = "T_OAP_DETAIL_PRESTATION")
public class OAPDetailPrestation {

    /**
     * Identifiant
     */
    @Id
    @JoinColumn(name = "IDENTIFIANT", nullable = false, unique = true)
    private String identifiant;
    /**
     * Designation
     */
    @JoinColumn(name = "DESIGNATION", nullable = false)
    private String designation;
    /**
     * Code type prestation
     */
    @JoinColumn(name = "COD_TYPE_PRESTATION", nullable = false)
    private String codTypePrestation;
    /**
     * Prestation de
     */
    @JoinColumn(name = "PRESTATION_DE", nullable = false)
    private String prestationDe;
    /**
     * Statut
     */
    @JoinColumn(name = "STATUT", nullable = false)
    private String statut;
    /**
     * Langue
     */
    @JoinColumn(name = "LANGUE", nullable = false)
    private String langue;
    /**
     * Ordre
     */
    @JoinColumn(name = "ORDRE", nullable = false)
    private String ordre;
}
