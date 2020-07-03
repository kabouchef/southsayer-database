package fr.personnel.southsayerdatabase.entity;

import lombok.*;

import javax.persistence.*;

/**
 * @author Farouk KABOUCHE
 *
 * Users Entity
 */

@Data
@With
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "T_USER")
public class User {

    /**
     * Id User
     */
    @Id
    @JoinColumn(name = "ID_USER", nullable = false, unique = true)
    private String idUser;
    /**
     * LastName
     */
    @JoinColumn(name = "NOM_USER", nullable = false)
    private String nomUser;
    /**
     * FirstName
     */
    @JoinColumn(name = "PRENOM_USER", nullable = false)
    private String prenomUser;
    /**
     * Profil
     */
    @JoinColumn(name = "PROFIL", nullable = false)
    private String profil;

}
