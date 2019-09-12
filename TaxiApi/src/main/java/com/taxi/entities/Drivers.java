package com.taxi.entities;

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
//@Table(name = "drivers")
//@XmlRootElement
//@NamedQueries({
//    @NamedQuery(name = "Drivers.findAll", query = "SELECT d FROM Drivers d")
//    , @NamedQuery(name = "Drivers.findByDrId", query = "SELECT d FROM Drivers d WHERE d.drId = :drId")
//    , @NamedQuery(name = "Drivers.findByDrName", query = "SELECT d FROM Drivers d WHERE d.drName = :drName")
//    , @NamedQuery(name = "Drivers.findByDrVehicleRegistration", query = "SELECT d FROM Drivers d WHERE d.drVehicleRegistration = :drVehicleRegistration")
//    , @NamedQuery(name = "Drivers.findByDrAge", query = "SELECT d FROM Drivers d WHERE d.drAge = :drAge")
//    , @NamedQuery(name = "Drivers.findByDrStatus", query = "SELECT d FROM Drivers d WHERE d.drStatus = :drStatus")
//    , @NamedQuery(name = "Drivers.findByDrEmail", query = "SELECT d FROM Drivers d WHERE d.drEmail = :drEmail")
//    , @NamedQuery(name = "Drivers.findByDrMobileNumber", query = "SELECT d FROM Drivers d WHERE d.drMobileNumber = :drMobileNumber")
//    , @NamedQuery(name = "Drivers.findByDrLocation", query = "SELECT d FROM Drivers d WHERE d.drLocation = :drLocation")})
//public class Drivers implements Serializable {
//
//    private static final long serialVersionUID = 1L;
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Basic(optional = false)
//    @Column(name = "dr_id")
//    private Integer drId;
//    @Column(name = "dr_name")
//    private String drName;
//    @Column(name = "dr_vehicle_registration")
//    private String drVehicleRegistration;
//    @Column(name = "dr_age")
//    private Integer drAge;
//    @Column(name = "dr_status")
//    private String drStatus;
//    @Column(name = "dr_email")
//    private String drEmail;
//    @Column(name = "dr_mobile_number")
//    private String drMobileNumber;
//    @Column(name = "dr_location")
//    private String drLocation;
//
//    public Drivers() {
//    }
//
//    public Drivers(Integer drId) {
//        this.drId = drId;
//    }
//
//    public Integer getDrId() {
//        return drId;
//    }
//
//    public void setDrId(Integer drId) {
//        this.drId = drId;
//    }
//
//    public String getDrName() {
//        return drName;
//    }
//
//    public void setDrName(String drName) {
//        this.drName = drName;
//    }
//
//    public String getDrVehicleRegistration() {
//        return drVehicleRegistration;
//    }
//
//    public void setDrVehicleRegistration(String drVehicleRegistration) {
//        this.drVehicleRegistration = drVehicleRegistration;
//    }
//
//    public Integer getDrAge() {
//        return drAge;
//    }
//
//    public void setDrAge(Integer drAge) {
//        this.drAge = drAge;
//    }
//
//    public String getDrStatus() {
//        return drStatus;
//    }
//
//    public void setDrStatus(String drStatus) {
//        this.drStatus = drStatus;
//    }
//
//    public String getDrEmail() {
//        return drEmail;
//    }
//
//    public void setDrEmail(String drEmail) {
//        this.drEmail = drEmail;
//    }
//
//    public String getDrMobileNumber() {
//        return drMobileNumber;
//    }
//
//    public void setDrMobileNumber(String drMobileNumber) {
//        this.drMobileNumber = drMobileNumber;
//    }
//
//    public String getDrLocation() {
//        return drLocation;
//    }
//
//    public void setDrLocation(String drLocation) {
//        this.drLocation = drLocation;
//    }
//
//    @Override
//    public int hashCode() {
//        int hash = 0;
//        hash += (drId != null ? drId.hashCode() : 0);
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object object) {
//        // TODO: Warning - this method won't work in the case the id fields are not set
//        if (!(object instanceof Drivers)) {
//            return false;
//        }
//        Drivers other = (Drivers) object;
//        if ((this.drId == null && other.drId != null) || (this.drId != null && !this.drId.equals(other.drId))) {
//            return false;
//        }
//        return true;
//    }
//
//    @Override
//    public String toString() {
//        return "com.entities.Drivers[ drId=" + drId + " ]";
//    }
//    
//}
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
@Table(name = "drivers", catalog = "taxi", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Drivers.findAll", query = "SELECT d FROM Drivers d")
    , @NamedQuery(name = "Drivers.findByDrId", query = "SELECT d FROM Drivers d WHERE d.drId = :drId")
    , @NamedQuery(name = "Drivers.findByDrName", query = "SELECT d FROM Drivers d WHERE d.drName = :drName")
    , @NamedQuery(name = "Drivers.findByDrVehicleRegistration", query = "SELECT d FROM Drivers d WHERE d.drVehicleRegistration = :drVehicleRegistration")
    , @NamedQuery(name = "Drivers.findByDrAge", query = "SELECT d FROM Drivers d WHERE d.drAge = :drAge")
    , @NamedQuery(name = "Drivers.findByDrStatus", query = "SELECT d FROM Drivers d WHERE d.drStatus = :drStatus")
    , @NamedQuery(name = "Drivers.findByDrEmail", query = "SELECT d FROM Drivers d WHERE d.drEmail = :drEmail")
    , @NamedQuery(name = "Drivers.findByDrMobileNumber", query = "SELECT d FROM Drivers d WHERE d.drMobileNumber = :drMobileNumber")
    , @NamedQuery(name = "Drivers.findByDrLocation", query = "SELECT d FROM Drivers d WHERE d.drLocation = :drLocation")
    , @NamedQuery(name = "Drivers.findByLng", query = "SELECT d FROM Drivers d WHERE d.lng = :lng")
    , @NamedQuery(name = "Drivers.findByLat", query = "SELECT d FROM Drivers d WHERE d.lat = :lat")})
public class Drivers implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "dr_id")
    private Integer drId;
    @Column(name = "dr_name")
    private String drName;
    @Column(name = "dr_vehicle_registration")
    private String drVehicleRegistration;
    @Column(name = "dr_age")
    private Integer drAge;
    @Column(name = "dr_status")
    private String drStatus;
    @Column(name = "dr_email")
    private String drEmail;
    @Column(name = "dr_mobile_number")
    private String drMobileNumber;
    @Column(name = "dr_location")
    private String drLocation;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "lng")
    private Float lng;
    @Column(name = "lat")
    private Float lat;

    public Drivers() {
    }

    public Drivers(Integer drId) {
        this.drId = drId;
    }

    public Integer getDrId() {
        return drId;
    }

    public void setDrId(Integer drId) {
        this.drId = drId;
    }

    public String getDrName() {
        return drName;
    }

    public void setDrName(String drName) {
        this.drName = drName;
    }

    public String getDrVehicleRegistration() {
        return drVehicleRegistration;
    }

    public void setDrVehicleRegistration(String drVehicleRegistration) {
        this.drVehicleRegistration = drVehicleRegistration;
    }

    public Integer getDrAge() {
        return drAge;
    }

    public void setDrAge(Integer drAge) {
        this.drAge = drAge;
    }

    public String getDrStatus() {
        return drStatus;
    }

    public void setDrStatus(String drStatus) {
        this.drStatus = drStatus;
    }

    public String getDrEmail() {
        return drEmail;
    }

    public void setDrEmail(String drEmail) {
        this.drEmail = drEmail;
    }

    public String getDrMobileNumber() {
        return drMobileNumber;
    }

    public void setDrMobileNumber(String drMobileNumber) {
        this.drMobileNumber = drMobileNumber;
    }

    public String getDrLocation() {
        return drLocation;
    }

    public void setDrLocation(String drLocation) {
        this.drLocation = drLocation;
    }

    public Float getLng() {
        return lng;
    }

    public void setLng(Float lng) {
        this.lng = lng;
    }

    public Float getLat() {
        return lat;
    }

    public void setLat(Float lat) {
        this.lat = lat;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (drId != null ? drId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Drivers)) {
            return false;
        }
        Drivers other = (Drivers) object;
        if ((this.drId == null && other.drId != null) || (this.drId != null && !this.drId.equals(other.drId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entities.Drivers[ drId=" + drId + " ]";
    }
    
}


