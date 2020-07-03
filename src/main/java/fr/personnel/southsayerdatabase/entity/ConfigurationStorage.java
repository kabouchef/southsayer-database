package fr.personnel.southsayerdatabase.entity;

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
    private String xmlConf;
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
