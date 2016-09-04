/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.shinetech.megaball.dto;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author usuario
 */
@Entity
@Table(name = "games")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Games.findAll", query = "SELECT g FROM Games g"),
    @NamedQuery(name = "Games.findById", query = "SELECT g FROM Games g WHERE g.id = :id"),
    @NamedQuery(name = "Games.findByCode", query = "SELECT g FROM Games g WHERE g.code = :code"),
    @NamedQuery(name = "Games.findByDescription", query = "SELECT g FROM Games g WHERE g.description = :description"),
    @NamedQuery(name = "Games.findByNumbers", query = "SELECT g FROM Games g WHERE g.numbers = :numbers"),
    @NamedQuery(name = "Games.findByExtraNumbers", query = "SELECT g FROM Games g WHERE g.extraNumbers = :extraNumbers"),
    @NamedQuery(name = "Games.findByLastNumber", query = "SELECT g FROM Games g WHERE g.lastNumber = :lastNumber"),
    @NamedQuery(name = "Games.findByCreatedStamp", query = "SELECT g FROM Games g WHERE g.createdStamp = :createdStamp"),
    @NamedQuery(name = "Games.findByDeletedStamp", query = "SELECT g FROM Games g WHERE g.deletedStamp = :deletedStamp")})
public class Games implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "code")
    private String code;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "description")
    private String description;
    @Basic(optional = false)
    @NotNull
    @Column(name = "numbers")
    private int numbers;
    @Basic(optional = false)
    @NotNull
    @Column(name = "extra_numbers")
    private int extraNumbers;
    @Column(name = "last_number")
    private Integer lastNumber;
    @Basic(optional = false)
    @NotNull
    @Column(name = "created_stamp")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdStamp;
    @Column(name = "deleted_stamp")
    @Temporal(TemporalType.TIMESTAMP)
    private Date deletedStamp;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "gameId")
    private Collection<Results> resultsCollection;

    public Games() {
    }

    public Games(Integer id) {
        this.id = id;
    }

    public Games(Integer id, String code, String description, int numbers, int extraNumbers, Date createdStamp) {
        this.id = id;
        this.code = code;
        this.description = description;
        this.numbers = numbers;
        this.extraNumbers = extraNumbers;
        this.createdStamp = createdStamp;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNumbers() {
        return numbers;
    }

    public void setNumbers(int numbers) {
        this.numbers = numbers;
    }

    public int getExtraNumbers() {
        return extraNumbers;
    }

    public void setExtraNumbers(int extraNumbers) {
        this.extraNumbers = extraNumbers;
    }

    public Integer getLastNumber() {
        return lastNumber;
    }

    public void setLastNumber(Integer lastNumber) {
        this.lastNumber = lastNumber;
    }

    public Date getCreatedStamp() {
        return createdStamp;
    }

    public void setCreatedStamp(Date createdStamp) {
        this.createdStamp = createdStamp;
    }

    public Date getDeletedStamp() {
        return deletedStamp;
    }

    public void setDeletedStamp(Date deletedStamp) {
        this.deletedStamp = deletedStamp;
    }

    @XmlTransient
    public Collection<Results> getResultsCollection() {
        return resultsCollection;
    }

    public void setResultsCollection(Collection<Results> resultsCollection) {
        this.resultsCollection = resultsCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Games)) {
            return false;
        }
        Games other = (Games) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.shinetech.megaball.dto.Games[ id=" + id + " ]";
    }
    
}
