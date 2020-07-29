package fr.personnel.southsayerdatabase.entity.rate;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;


/**
 * @author Farouk KABOUCHE
 * OAP Delivery Rate Wording Entity
 * @version 1.0
 */

@Data
@AllArgsConstructor
@Entity
@Table(name = "T_OAP_IDENTIFIANT_TARIF")
@SecondaryTable(name = "T_OAP_TARIF_PRESTATION", pkJoinColumns = @PrimaryKeyJoinColumn(name = "IDENTIFIANT"))
@SecondaryTable(name = "T_OAP_DETAIL_PRESTATION", pkJoinColumns = @PrimaryKeyJoinColumn(name = "IDENTIFIANT"))
public class OAPDeliveryRateDetails {

    /**
     * Identifiant
     */
    @Id
    @Column(name = "IDENTIFIANT", nullable = false, unique = true)
    private String identifiant;
    /**
     * Libellé identifiant
     */
    @Column(name = "LIBELLE_IDENTIFIANT", nullable = false)
    private String libelleIdentifiant;


    // FROM T_OAP_TARIF_PRESTATION

    /**
     * Code Type Prestation
     */
    @Column(name = "COD_TYPE_PRESTATION", nullable = false, table="T_OAP_TARIF_PRESTATION")
    private String codTypePrestation;
    /**
     * Règles Quantité
     */
    @Column(name = "REGLES_QUANTITE", table="T_OAP_TARIF_PRESTATION")
    private String reglesQuantite;
    /**
     * Prix Achat Unitaire HT
     */
    @Column(name = "PRIX_ACHAT_UNITAIRE_HT", table="T_OAP_TARIF_PRESTATION")
    private Long prixAchatUnitaireHt;
    /**
     * Prix Vente Unitaire HT
     */
    @Column(name = "PRIX_VENTE_UNITAIRE_HT", table="T_OAP_TARIF_PRESTATION")
    private Long prixVenteUnitaireHt;
    /**
     * Unité
     */
    @Column(name = "UNITE", table="T_OAP_TARIF_PRESTATION")
    private String unite;
    /**
     * Nombre de personne nécessaire
     */
    @Column(name = "NB_PERSONNE_NECESSAIRE", table="T_OAP_TARIF_PRESTATION")
    private Long nbPersonneNecessaire;
    /**
     * Temps Pose
     */
    @Column(name = "TEMP_POSE", table="T_OAP_TARIF_PRESTATION")
    private String tempPose;
    /**
     * Droit Remise Quantitative
     */
    @Column(name = "DROIT_REMISE_QUANTITATIVE", table="T_OAP_TARIF_PRESTATION")
    private Long droitRemiseQuantitative;
    /**
     * Palier Remise 1
     */
    @Column(name = "PALIER_REMISE1", table="T_OAP_TARIF_PRESTATION")
    private Long palierRemise1;
    /**
     * Pourcentage Palier Remise 1
     */
    @Column(name = "POUR_PALIER_REMISE1", table="T_OAP_TARIF_PRESTATION")
    private Long pourPalierRemise1;
    /**
     * Palier Remise 2
     */
    @Column(name = "PALIER_REMISE2", table="T_OAP_TARIF_PRESTATION")
    private Long palierRemise2;
    /**
     * Pourcentage Palier Remise 2
     */
    @Column(name = "POUR_PALIER_REMISE2", table="T_OAP_TARIF_PRESTATION")
    private Long pourPalierRemise2;
    /**
     * Palier Remise 3
     */
    @Column(name = "PALIER_REMISE3", table="T_OAP_TARIF_PRESTATION")
    private Long palierRemise3;
    /**
     * Pourcentage Palier Remise 3
     */
    @Column(name = "POUR_PALIER_REMISE3", table="T_OAP_TARIF_PRESTATION")
    private Long pourPalierRemise3;
    /**
     * Modification Magasin
     */
    @Column(name = "MODIF_MAG", table="T_OAP_TARIF_PRESTATION")
    private String modifMag;
    /**
     * Statut
     */
    @Column(name = "STATUT", nullable = false, table="T_OAP_TARIF_PRESTATION")
    private String statut;
    /**
     * Date Debut
     */
    @Column(name = "DATE_DEBUT", table="T_OAP_TARIF_PRESTATION")
    private Long dateDebut;
    /**
     * Date Fin
     */
    @Column(name = "DATE_FIN", table="T_OAP_TARIF_PRESTATION")
    private Long dateFin;
    /**
     * TVA Reduite
     */
    @Column(name = "TVA_REDUITE", nullable = false, table="T_OAP_TARIF_PRESTATION")
    private Long tvaReduite;
    /**
     * TVA Intermédiaire
     */
    @Column(name = "TVA_INTER", nullable = false, table="T_OAP_TARIF_PRESTATION")
    private Long tvaInter;
    /**
     * TVA Normale
     */
    @Column(name = "TVA_NORMALE", nullable = false, table="T_OAP_TARIF_PRESTATION")
    private Long tvaNormale;


    // FROM T_OAP_DETAIL_PRESTATION

    /**
     * Designation
     */
    @Column(name = "DESIGNATION", nullable = false, table="T_OAP_DETAIL_PRESTATION")
    private String designation;
    /**
     * Prestation de
     */
    @Column(name = "PRESTATION_DE", nullable = false, table="T_OAP_DETAIL_PRESTATION")
    private String prestationDe;

    /**
     * Statut DP
     */
    @Column(name = "STATUT", nullable = false, table="T_OAP_DETAIL_PRESTATION")
    private String statutDp;
    /**
     * Langue
     */
    @Column(name = "LANGUE", nullable = false, table="T_OAP_DETAIL_PRESTATION")
    private String langue;
    /**
     * Ordre
     */
    @Column(name = "ORDRE", nullable = false, table="T_OAP_DETAIL_PRESTATION")
    private Long ordre;

}
