package model;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author Elattar Saad
 */
@Entity
public class Artist implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String realName;
    private String fameName;
    private String birthDate;
    private String category;
    private String linkToAvatar;

    public Artist() {
    }

    public Artist(String realName, String fameName, String birthDate, String category, String linkToAvatar) {
        this.realName = realName;
        this.fameName = fameName;
        this.birthDate = birthDate;
        this.category = category;
        this.linkToAvatar = linkToAvatar;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getFameName() {
        return fameName;
    }

    public void setFameName(String fameName) {
        this.fameName = fameName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getLinkToAvatar() {
        return linkToAvatar;
    }

    public void setLinkToAvatar(String linkToAvatar) {
        this.linkToAvatar = linkToAvatar;
    }

    @Override
    public String toString() {
        return "Artist{" +
                "id=" + id +
                ", realName='" + realName + '\'' +
                ", fameName='" + fameName + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", category='" + category + '\'' +
                ", linkToAvatar='" + linkToAvatar + '\'' +
                '}';
    }
}
