package fr.personnel.southsayerdatabase.entity.oap;

import lombok.*;

import javax.persistence.*;


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
@Table(name = "T_OAP_TARIF_PRESTATION")
public class OAPTarifPrestation {

    /**
     * Identifiant
     */
    @Id
    @JoinColumn(name = "IDENTIFIANT", nullable = false, unique = true)
    private String identifiant;
    /**
     * Code Type Prestation
     */
    @JoinColumn(name = "COD_TYPE_PRESTATION", nullable = false)
    private String codTypePrestation;
    /**
     * Règles Quantité
     */
    @JoinColumn(name = "REGLES_QUANTITE", nullable = false)
    private String reglesQuantité;
    /**
     * Prix Achat Unitaire HT
     */
    @JoinColumn(name = "PRIX_ACHAT_UNITAIRE_HT", nullable = false)
    private Long prixAchatUnitaireHT;
    /**
     * Prix Vente Unitaire HT
     */
    @JoinColumn(name = "PRIX_VENTE_UNITAIRE_HT", nullable = false)
    private Long prixVenteUnitaireHT;
    /**
     * Unité
     */
    @JoinColumn(name = "UNITE", nullable = false)
    private String unite;
    /**
     * Nombre de personne nécessaire
     */
    @JoinColumn(name = "NB_PERSONNE_NECESSAIRE")
    private Long nbPersonneNecessaire;
    /**
     * Temps Pose
     */
    @JoinColumn(name = "TEMP_POSE", nullable = false)
    private String tempPose;
    /**
     * Droit Remise Quantitative
     */
    @JoinColumn(name = "DROIT_REMISE_QUANTITATIVE", nullable = false)
    private String droitRemiseQuantitative;
    /**
     * Palier Remise 1
     */
    @JoinColumn(name = "PALIER_REMISE1", nullable = false)
    private Long palierRemise1;
    /**
     * Pourcentage Palier Remise 1
     */
    @JoinColumn(name = "POUR_PALIER_REMISE1", nullable = false)
    private Long pourPalierRemise1;
    /**
     * Palier Remise 2
     */
    @JoinColumn(name = "PALIER_REMISE2", nullable = false)
    private Long palierRemise2;
    /**
     * Pourcentage Palier Remise 2
     */
    @JoinColumn(name = "POUR_PALIER_REMISE2", nullable = false)
    private Long pourPalierRemise2;
    /**
     * Palier Remise 3
     */
    @JoinColumn(name = "PALIER_REMISE3", nullable = false)
    private Long palierRemise3;
    /**
     * Pourcentage Palier Remise 3
     */
    @JoinColumn(name = "POUR_PALIER_REMISE3", nullable = false)
    private Long pourPalierRemise3;
    /**
     * Modification Magasin
     */
    @JoinColumn(name = "MODIF_MAG", nullable = false)
    private String modifMag;
    /**
     * Statut
     */
    @JoinColumn(name = "STATUT", nullable = false)
    private String statut;
    /**
     * Date Debut
     */
    @JoinColumn(name = "DATE_DEBUT", nullable = false)
    private Long dateDebut;
    /**
     * Date Fin
     */
    @JoinColumn(name = "DATE_FIN")
    private Long dateFin;
    /**
     * TVA Reduite
     */
    @JoinColumn(name = "TVA_REDUITE", nullable = false)
    private Long tvaReduite;
    /**
     * TVA Intermédiaire
     */
    @JoinColumn(name = "TVA_INTER", nullable = false)
    private Long tvaInter;
    /**
     * TVA Normale
     */
    @JoinColumn(name = "TVA_NORMALE", nullable = false)
    private Long tvaNormale;

}
