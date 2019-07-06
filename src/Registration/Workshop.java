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
@Table(name = "workshop", catalog = "dbms project", schema = "")
@NamedQueries({
    @NamedQuery(name = "Workshop.findAll", query = "SELECT w FROM Workshop w")
    , @NamedQuery(name = "Workshop.findByWorkshopID", query = "SELECT w FROM Workshop w WHERE w.workshopID = :workshopID")
    , @NamedQuery(name = "Workshop.findByWorkshopName", query = "SELECT w FROM Workshop w WHERE w.workshopName = :workshopName")
    , @NamedQuery(name = "Workshop.findByCoordinator", query = "SELECT w FROM Workshop w WHERE w.coordinator = :coordinator")
    , @NamedQuery(name = "Workshop.findByResource", query = "SELECT w FROM Workshop w WHERE w.resource = :resource")
    , @NamedQuery(name = "Workshop.findByPrice", query = "SELECT w FROM Workshop w WHERE w.price = :price")
    , @NamedQuery(name = "Workshop.findByRegistrations", query = "SELECT w FROM Workshop w WHERE w.registrations = :registrations")})
public class Workshop implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "WorkshopID")
    private Integer workshopID;
    @Basic(optional = false)
    @Column(name = "WorkshopName")
    private int workshopName;
    @Basic(optional = false)
    @Column(name = "Co-ordinator")
    private String coordinator;
    @Basic(optional = false)
    @Column(name = "Resource")
    private String resource;
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

    public Workshop() {
    }

    public Workshop(Integer workshopID) {
        this.workshopID = workshopID;
    }

    public Workshop(Integer workshopID, int workshopName, String coordinator, String resource, String logistics, String hospitality, int price, int registrations) {
        this.workshopID = workshopID;
        this.workshopName = workshopName;
        this.coordinator = coordinator;
        this.resource = resource;
        this.logistics = logistics;
        this.hospitality = hospitality;
        this.price = price;
        this.registrations = registrations;
    }

    public Integer getWorkshopID() {
        return workshopID;
    }

    public void setWorkshopID(Integer workshopID) {
        Integer oldWorkshopID = this.workshopID;
        this.workshopID = workshopID;
        changeSupport.firePropertyChange("workshopID", oldWorkshopID, workshopID);
    }

    public int getWorkshopName() {
        return workshopName;
    }

    public void setWorkshopName(int workshopName) {
        int oldWorkshopName = this.workshopName;
        this.workshopName = workshopName;
        changeSupport.firePropertyChange("workshopName", oldWorkshopName, workshopName);
    }

    public String getCoordinator() {
        return coordinator;
    }

    public void setCoordinator(String coordinator) {
        String oldCoordinator = this.coordinator;
        this.coordinator = coordinator;
        changeSupport.firePropertyChange("coordinator", oldCoordinator, coordinator);
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        String oldResource = this.resource;
        this.resource = resource;
        changeSupport.firePropertyChange("resource", oldResource, resource);
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
        hash += (workshopID != null ? workshopID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Workshop)) {
            return false;
        }
        Workshop other = (Workshop) object;
        if ((this.workshopID == null && other.workshopID != null) || (this.workshopID != null && !this.workshopID.equals(other.workshopID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Query.Workshop[ workshopID=" + workshopID + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
