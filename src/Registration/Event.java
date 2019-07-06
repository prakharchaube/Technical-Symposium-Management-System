/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Registration;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author prakh
 */
@Entity
@Table(name = "event", catalog = "dbms project", schema = "")
@NamedQueries({
    @NamedQuery(name = "Event.findAll", query = "SELECT e FROM Event e")
    , @NamedQuery(name = "Event.findByEventID", query = "SELECT e FROM Event e WHERE e.eventID = :eventID")
    , @NamedQuery(name = "Event.findByEventName", query = "SELECT e FROM Event e WHERE e.eventName = :eventName")
    , @NamedQuery(name = "Event.findByCoordinator", query = "SELECT e FROM Event e WHERE e.coordinator = :coordinator")
    , @NamedQuery(name = "Event.findByPrice", query = "SELECT e FROM Event e WHERE e.price = :price")
    , @NamedQuery(name = "Event.findByRegistrations", query = "SELECT e FROM Event e WHERE e.registrations = :registrations")})
public class Event implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "EventID")
    private Integer eventID;
    @Basic(optional = false)
    @Column(name = "EventName")
    private String eventName;
    @Basic(optional = false)
    @Column(name = "Co-ordinator")
    private String coordinator;
    @Basic(optional = false)
    @Lob
    @Column(name = "Logistics")
    private String logistics;
    @Basic(optional = false)
    @Lob
    @Column(name = "Hospitality")
    private String hospitality;
    @Basic(optional = false)
    @Column(name = "Price")
    private int price;
    @Basic(optional = false)
    @Column(name = "Registrations")
    private int registrations;

    public Event() {
    }

    public Event(Integer eventID) {
        this.eventID = eventID;
    }

    public Event(Integer eventID, String eventName, String coordinator, String logistics, String hospitality, int price, int registrations) {
        this.eventID = eventID;
        this.eventName = eventName;
        this.coordinator = coordinator;
        this.logistics = logistics;
        this.hospitality = hospitality;
        this.price = price;
        this.registrations = registrations;
    }

    public Integer getEventID() {
        return eventID;
    }

    public void setEventID(Integer eventID) {
        Integer oldEventID = this.eventID;
        this.eventID = eventID;
        changeSupport.firePropertyChange("eventID", oldEventID, eventID);
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        String oldEventName = this.eventName;
        this.eventName = eventName;
        changeSupport.firePropertyChange("eventName", oldEventName, eventName);
    }

    public String getCoordinator() {
        return coordinator;
    }

    public void setCoordinator(String coordinator) {
        String oldCoordinator = this.coordinator;
        this.coordinator = coordinator;
        changeSupport.firePropertyChange("coordinator", oldCoordinator, coordinator);
    }

    public String getLogistics() {
        return logistics;
    }

    public void setLogistics(String logistics) {
        String oldLogistics = this.logistics;
        this.logistics = logistics;
        changeSupport.firePropertyChange("logistics", oldLogistics, logistics);
    }

    public String getHospitality() {
        return hospitality;
    }

    public void setHospitality(String hospitality) {
        String oldHospitality = this.hospitality;
        this.hospitality = hospitality;
        changeSupport.firePropertyChange("hospitality", oldHospitality, hospitality);
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        int oldPrice = this.price;
        this.price = price;
        changeSupport.firePropertyChange("price", oldPrice, price);
    }

    public int getRegistrations() {
        return registrations;
    }

    public void setRegistrations(int registrations) {
        int oldRegistrations = this.registrations;
        this.registrations = registrations;
        changeSupport.firePropertyChange("registrations", oldRegistrations, registrations);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (eventID != null ? eventID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Event)) {
            return false;
        }
        Event other = (Event) object;
        if ((this.eventID == null && other.eventID != null) || (this.eventID != null && !this.eventID.equals(other.eventID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Query.Event[ eventID=" + eventID + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
