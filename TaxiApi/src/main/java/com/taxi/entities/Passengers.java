package com.taxi.entities;
//
//import java.io.Serializable;
//import javax.persistence.Basic;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.NamedQueries;
//import javax.persistence.NamedQuery;
//import javax.persistence.Table;
//import javax.xml.bind.annotation.XmlRootElement;
//
///**
// *
// * @author appdev
// */
//@Entity
//@Table(name = "passengers")
//@XmlRootElement
//@NamedQueries({
//    @NamedQuery(name = "Passengers.findAll", query = "SELECT p FROM Passengers p")
//    , @NamedQuery(name = "Passengers.findByPsId", query = "SELECT p FROM Passengers p WHERE p.psId = :psId")
//    , @NamedQuery(name = "Passengers.findByPsName", query = "SELECT p FROM Passengers p WHERE p.psName = :psName")
//    , @NamedQuery(name = "Passengers.findByPsMobileNumber", query = "SELECT p FROM Passengers p WHERE p.psMobileNumber = :psMobileNumber")
//    , @NamedQuery(name = "Passengers.findByPsEmail", query = "SELECT p FROM Passengers p WHERE p.psEmail = :psEmail")
//    , @NamedQuery(name = "Passengers.findByPsStatus", query = "SELECT p FROM Passengers p WHERE p.psStatus = :psStatus")
//    , @NamedQuery(name = "Passengers.findByPsLocation", query = "SELECT p FROM Passengers p WHERE p.psLocation = :psLocation")})
//public class Passengers implements Serializable {
//
//    private static final long serialVersionUID = 1L;
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Basic(optional = false)
//    @Column(name = "ps_id")
//    private Integer psId;
//    @Column(name = "ps_name")
//    private String psName;
//    @Column(name = "ps_mobile_number")
//    private String psMobileNumber;
//    @Column(name = "ps_email")
//    private String psEmail;
//    @Column(name = "ps_status")
//    private String psStatus;
//    @Column(name = "ps_location")
//    private String psLocation;
//
//    public Passengers() {
//    }
//
//    public Passengers(Integer psId) {
//        this.psId = psId;
//    }
//
//    public Integer getPsId() {
//        return psId;
//    }
//
//    public void setPsId(Integer psId) {
//        this.psId = psId;
//    }
//
//    public String getPsName() {
//        return psName;
//    }
//
//    public void setPsName(String psName) {
//        this.psName = psName;
//    }
//
//    public String getPsMobileNumber() {
//        return psMobileNumber;
//    }
//
//    public void setPsMobileNumber(String psMobileNumber) {
//        this.psMobileNumber = psMobileNumber;
//    }
//
//    public String getPsEmail() {
//        return psEmail;
//    }
//
//    public void setPsEmail(String psEmail) {
//        this.psEmail = psEmail;
//    }
//
//    public String getPsStatus() {
//        return psStatus;
//    }
//
//    public void setPsStatus(String psStatus) {
//        this.psStatus = psStatus;
//    }
//
//    public String getPsLocation() {
//        return psLocation;
//    }
//
//    public void setPsLocation(String psLocation) {
//        this.psLocation = psLocation;
//    }
//
//    @Override
//    public int hashCode() {
//        int hash = 0;
//        hash += (psId != null ? psId.hashCode() : 0);
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object object) {
//        // TODO: Warning - this method won't work in the case the id fields are not set
//        if (!(object instanceof Passengers)) {
//            return false;
//        }
//        Passengers other = (Passengers) object;
//        if ((this.psId == null && other.psId != null) || (this.psId != null && !this.psId.equals(other.psId))) {
//            return false;
//        }
//        return true;
//    }
//
//    @Override
//    public String toString() {
//        return "com.entities.Passengers[ psId=" + psId + " ]";
//    }
//    
//}
//
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author appdev
 */
@Entity
@Table(name = "passengers", catalog = "taxi", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Passengers.findAll", query = "SELECT p FROM Passengers p")
    , @NamedQuery(name = "Passengers.findByPsId", query = "SELECT p FROM Passengers p WHERE p.psId = :psId")
    , @NamedQuery(name = "Passengers.findByPsName", query = "SELECT p FROM Passengers p WHERE p.psName = :psName")
    , @NamedQuery(name = "Passengers.findByPsMobileNumber", query = "SELECT p FROM Passengers p WHERE p.psMobileNumber = :psMobileNumber")
    , @NamedQuery(name = "Passengers.findByPsEmail", query = "SELECT p FROM Passengers p WHERE p.psEmail = :psEmail")
    , @NamedQuery(name = "Passengers.findByPsStatus", query = "SELECT p FROM Passengers p WHERE p.psStatus = :psStatus")
    , @NamedQuery(name = "Passengers.findByPsLocation", query = "SELECT p FROM Passengers p WHERE p.psLocation = :psLocation")
    , @NamedQuery(name = "Passengers.findBySomeLongitude", query = "SELECT p FROM Passengers p WHERE p.someLongitude = :someLongitude")
    , @NamedQuery(name = "Passengers.findBySomeLatitude", query = "SELECT p FROM Passengers p WHERE p.someLatitude = :someLatitude")})
public class Passengers implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ps_id")
    private Integer psId;
    @Column(name = "ps_name")
    private String psName;
    @Column(name = "ps_mobile_number")
    private String psMobileNumber;
    @Column(name = "ps_email")
    private String psEmail;
    @Column(name = "ps_status")
    private String psStatus;
    @Column(name = "ps_location")
    private String psLocation;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "some_longitude")
    private Float someLongitude;
    @Column(name = "some_latitude")
    private Float someLatitude;

    public Passengers() {
    }

    public Passengers(Integer psId) {
        this.psId = psId;
    }

    public Integer getPsId() {
        return psId;
    }

    public void setPsId(Integer psId) {
        this.psId = psId;
    }

    public String getPsName() {
        return psName;
    }

    public void setPsName(String psName) {
        this.psName = psName;
    }

    public String getPsMobileNumber() {
        return psMobileNumber;
    }

    public void setPsMobileNumber(String psMobileNumber) {
        this.psMobileNumber = psMobileNumber;
    }

    public String getPsEmail() {
        return psEmail;
    }

    public void setPsEmail(String psEmail) {
        this.psEmail = psEmail;
    }

    public String getPsStatus() {
        return psStatus;
    }

    public void setPsStatus(String psStatus) {
        this.psStatus = psStatus;
    }

    public String getPsLocation() {
        return psLocation;
    }

    public void setPsLocation(String psLocation) {
        this.psLocation = psLocation;
    }

    public Float getSomeLongitude() {
        return someLongitude;
    }

    public void setSomeLongitude(Float someLongitude) {
        this.someLongitude = someLongitude;
    }

    public Float getSomeLatitude() {
        return someLatitude;
    }

    public void setSomeLatitude(Float someLatitude) {
        this.someLatitude = someLatitude;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (psId != null ? psId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Passengers)) {
            return false;
        }
        Passengers other = (Passengers) object;
        if ((this.psId == null && other.psId != null) || (this.psId != null && !this.psId.equals(other.psId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entities.Passengers[ psId=" + psId + " ]";
    }
    
}

