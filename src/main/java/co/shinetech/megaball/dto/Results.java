/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.shinetech.megaball.dto;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author usuario
 */
@Entity
@Table(name = "results")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Results.findAll", query = "SELECT r FROM Results r"),
    @NamedQuery(name = "Results.findById", query = "SELECT r FROM Results r WHERE r.id = :id"),
    @NamedQuery(name = "Results.findByDate", query = "SELECT r FROM Results r WHERE r.date = :date"),
    @NamedQuery(name = "Results.findByNumYear", query = "SELECT r FROM Results r WHERE r.numYear = :numYear"),
    @NamedQuery(name = "Results.findByTotal", query = "SELECT r FROM Results r WHERE r.total = :total"),
    @NamedQuery(name = "Results.findByTermination", query = "SELECT r FROM Results r WHERE r.termination = :termination"),
    @NamedQuery(name = "Results.findByNumbers", query = "SELECT r FROM Results r WHERE r.numbers = :numbers"),
    @NamedQuery(name = "Results.findByStars", query = "SELECT r FROM Results r WHERE r.stars = :stars"),
    @NamedQuery(name = "Results.findByNumbersPairOdd", query = "SELECT r FROM Results r WHERE r.numbersPairOdd = :numbersPairOdd"),
    @NamedQuery(name = "Results.findByStarsPairOdd", query = "SELECT r FROM Results r WHERE r.starsPairOdd = :starsPairOdd"),
    @NamedQuery(name = "Results.findByDecimalNumbers", query = "SELECT r FROM Results r WHERE r.decimalNumbers = :decimalNumbers"),
    @NamedQuery(name = "Results.findByDecimalStars", query = "SELECT r FROM Results r WHERE r.decimalStars = :decimalStars"),
    @NamedQuery(name = "Results.findByDistanceNumbers", query = "SELECT r FROM Results r WHERE r.distanceNumbers = :distanceNumbers"),
    @NamedQuery(name = "Results.findByCreatedStamp", query = "SELECT r FROM Results r WHERE r.createdStamp = :createdStamp"),
    @NamedQuery(name = "Results.findByDeletedStamp", query = "SELECT r FROM Results r WHERE r.deletedStamp = :deletedStamp")})
public class Results implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date")
    @Temporal(TemporalType.DATE)
    private Date date;
    @Column(name = "num_year")
    private Integer numYear;
    @Column(name = "total")
    private Integer total;
    @Size(max = 256)
    @Column(name = "termination")
    private String termination;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "numbers")
    private String numbers;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "stars")
    private String stars;
    @Size(max = 256)
    @Column(name = "numbers_pair_odd")
    private String numbersPairOdd;
    @Size(max = 256)
    @Column(name = "stars_pair_odd")
    private String starsPairOdd;
    @Size(max = 256)
    @Column(name = "decimal_numbers")
    private String decimalNumbers;
    @Size(max = 256)
    @Column(name = "decimal_stars")
    private String decimalStars;
    @Size(max = 256)
    @Column(name = "distance_numbers")
    private String distanceNumbers;
    @Basic(optional = false)
    @NotNull
    @Column(name = "created_stamp")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdStamp;
    @Column(name = "deleted_stamp")
    @Temporal(TemporalType.TIMESTAMP)
    private Date deletedStamp;
    @JoinColumn(name = "game_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Games gameId;

    public Results() {
    }

    public Results(Integer id) {
        this.id = id;
    }

    public Results(Integer id, Date date, String numbers, String stars, Date createdStamp) {
        this.id = id;
        this.date = date;
        this.numbers = numbers;
        this.stars = stars;
        this.createdStamp = createdStamp;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getNumYear() {
        return numYear;
    }

    public void setNumYear(Integer numYear) {
        this.numYear = numYear;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public String getTermination() {
        return termination;
    }

    public void setTermination(String termination) {
        this.termination = termination;
    }

    public String getNumbers() {
        return numbers;
    }

    public void setNumbers(String numbers) {
        this.numbers = numbers;
    }

    public String getStars() {
        return stars;
    }

    public void setStars(String stars) {
        this.stars = stars;
    }

    public String getNumbersPairOdd() {
        return numbersPairOdd;
    }

    public void setNumbersPairOdd(String numbersPairOdd) {
        this.numbersPairOdd = numbersPairOdd;
    }

    public String getStarsPairOdd() {
        return starsPairOdd;
    }

    public void setStarsPairOdd(String starsPairOdd) {
        this.starsPairOdd = starsPairOdd;
    }

    public String getDecimalNumbers() {
        return decimalNumbers;
    }

    public void setDecimalNumbers(String decimalNumbers) {
        this.decimalNumbers = decimalNumbers;
    }

    public String getDecimalStars() {
        return decimalStars;
    }

    public void setDecimalStars(String decimalStars) {
        this.decimalStars = decimalStars;
    }

    public String getDistanceNumbers() {
        return distanceNumbers;
    }

    public void setDistanceNumbers(String distanceNumbers) {
        this.distanceNumbers = distanceNumbers;
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

    public Games getGameId() {
        return gameId;
    }

    public void setGameId(Games gameId) {
        this.gameId = gameId;
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
        if (!(object instanceof Results)) {
            return false;
        }
        Results other = (Results) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.shinetech.megaball.dto.Results[ id=" + id + " ]";
    }
    
}
