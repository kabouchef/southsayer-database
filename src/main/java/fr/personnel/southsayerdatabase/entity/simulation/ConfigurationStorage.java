package fr.personnel.southsayerdatabase.entity.simulation;

import lombok.*;

import javax.persistence.*;
import java.sql.Clob;

/**
 * @author Farouk KABOUCHE
 * T_CONF_STORAGE Entity
 * @version 1.0
 */

@Data
@With
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "T_CONF_STORAGE")
public class ConfigurationStorage {

    /**
     * Configuration Id
     */
    @Id
    @JoinColumn(name = "CONF_ID", nullable = false, unique = true)
    private String confId;
    /**
     * User Id
     */
    @JoinColumn(name = "USER_ID", nullable = false)
    private String userId;
    /**
     * Xml Configuration
     */
    @JoinColumn(name = "XML_CONF", nullable = false)
    private Clob xmlConf;
    /**
     * Deleted
     */
    @JoinColumn(name = "DELETED", nullable = false)
    private String deleted;
    /**
     * Configuration Type Id
     */
    @JoinColumn(name = "CONF_TYPE_ID", nullable = false)
    private String confTypeId;
    /**
     * Configuration Category Id
     */
    @JoinColumn(name = "CONF_CATEG_ID", nullable = false)
    private String confCategId;
    /**
     * Editor Id
     */
    @JoinColumn(name = "EDITOR_ID")
    private String editorId;

}
