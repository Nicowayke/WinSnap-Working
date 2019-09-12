package com.taxi.entities;

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
@Table(name = "trips")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Trips.findAll", query = "SELECT t FROM Trips t")
    , @NamedQuery(name = "Trips.findByTripId", query = "SELECT t FROM Trips t WHERE t.tripId = :tripId")
    , @NamedQuery(name = "Trips.findByTripStatus", query = "SELECT t FROM Trips t WHERE t.tripStatus = :tripStatus")
    , @NamedQuery(name = "Trips.findByTripDrId", query = "SELECT t FROM Trips t WHERE t.tripDrId = :tripDrId")
    , @NamedQuery(name = "Trips.findByTripPsId", query = "SELECT t FROM Trips t WHERE t.tripPsId = :tripPsId")})
public class Trips implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "trip_id")
    private Integer tripId;
    @Basic(optional = false)
    @Column(name = "trip_status")
    private String tripStatus;
    @Basic(optional = false)
    @Column(name = "trip_dr_id")
    private int tripDrId;
    @Basic(optional = false)
    @Column(name = "trip_ps_id")
    private int tripPsId;

    public Trips() {
    }

    public Trips(Integer tripId) {
        this.tripId = tripId;
    }

    public Trips(Integer tripId, String tripStatus, int tripDrId, int tripPsId) {
        this.tripId = tripId;
        this.tripStatus = tripStatus;
        this.tripDrId = tripDrId;
        this.tripPsId = tripPsId;
    }

    public Integer getTripId() {
        return tripId;
    }

    public void setTripId(Integer tripId) {
        this.tripId = tripId;
    }

    public String getTripStatus() {
        return tripStatus;
    }

    public void setTripStatus(String tripStatus) {
        this.tripStatus = tripStatus;
    }

    public int getTripDrId() {
        return tripDrId;
    }

    public void setTripDrId(int tripDrId) {
        this.tripDrId = tripDrId;
    }

    public int getTripPsId() {
        return tripPsId;
    }

    public void setTripPsId(int tripPsId) {
        this.tripPsId = tripPsId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tripId != null ? tripId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Trips)) {
            return false;
        }
        Trips other = (Trips) object;
        if ((this.tripId == null && other.tripId != null) || (this.tripId != null && !this.tripId.equals(other.tripId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entities.Trips[ tripId=" + tripId + " ]";
    }
    
}

