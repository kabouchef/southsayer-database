package fr.personnel.southsayerdatabase.entity.activitycode;

import lombok.Data;

import javax.persistence.*;


/**
 * @author Farouk KABOUCHE
 *
 * OAP Code Activite Entity
 */

@Data
@Entity
@Table(name = "T_OAP_CODE_ACTIVITE")
@SecondaryTable(name = "T_OAP_CODE_ACTIVITE_OAP", pkJoinColumns = @PrimaryKeyJoinColumn(name = "COD_ACTIVITE"))
public class ActivityCode {

    /**
     * COD_ACTIVITE
     */
    @Id
    @Column(name = "COD_ACTIVITE", nullable = false)
    private String codActivite;

    /**
     * LIB1
     */
    @Column(name = "LIB1", nullable = false)
    private String lib1;
    /**
     * ID_RAYON
     */
    @Column(name = "ID_RAYON", nullable = false)
    private Long idRayon;
    /**
     * RAYON
     */
    @Column(name = "RAYON", nullable = false)
    private String rayon;

    /**
     * ID_OAP
     */
    @Column(name = "ID_OAP", nullable = false, table="T_OAP_CODE_ACTIVITE_OAP")
    private String idOap;

}
