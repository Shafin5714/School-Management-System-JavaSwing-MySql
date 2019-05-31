/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolmanagement;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Shafin
 */
@Entity
@Table(name = "employee_info", catalog = "schoolmanagement", schema = "")
@NamedQueries({
    @NamedQuery(name = "EmployeeInfo.findAll", query = "SELECT e FROM EmployeeInfo e")
    , @NamedQuery(name = "EmployeeInfo.findById", query = "SELECT e FROM EmployeeInfo e WHERE e.id = :id")
    , @NamedQuery(name = "EmployeeInfo.findByFirstName", query = "SELECT e FROM EmployeeInfo e WHERE e.firstName = :firstName")
    , @NamedQuery(name = "EmployeeInfo.findByLastName", query = "SELECT e FROM EmployeeInfo e WHERE e.lastName = :lastName")
    , @NamedQuery(name = "EmployeeInfo.findByPosition", query = "SELECT e FROM EmployeeInfo e WHERE e.position = :position")
    , @NamedQuery(name = "EmployeeInfo.findByMobile", query = "SELECT e FROM EmployeeInfo e WHERE e.mobile = :mobile")
    , @NamedQuery(name = "EmployeeInfo.findByGander", query = "SELECT e FROM EmployeeInfo e WHERE e.gander = :gander")
    , @NamedQuery(name = "EmployeeInfo.findByParmanenetAddress", query = "SELECT e FROM EmployeeInfo e WHERE e.parmanenetAddress = :parmanenetAddress")
    , @NamedQuery(name = "EmployeeInfo.findByPresentAddress", query = "SELECT e FROM EmployeeInfo e WHERE e.presentAddress = :presentAddress")})
public class EmployeeInfo implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private String id;
    @Basic(optional = false)
    @Column(name = "First_Name")
    private String firstName;
    @Basic(optional = false)
    @Column(name = "Last_Name")
    private String lastName;
    @Basic(optional = false)
    @Column(name = "Position")
    private String position;
    @Basic(optional = false)
    @Column(name = "Mobile")
    private String mobile;
    @Basic(optional = false)
    @Column(name = "Gander")
    private String gander;
    @Basic(optional = false)
    @Column(name = "Parmanenet_Address")
    private String parmanenetAddress;
    @Basic(optional = false)
    @Column(name = "Present_Address")
    private String presentAddress;

    public EmployeeInfo() {
    }

    public EmployeeInfo(String id) {
        this.id = id;
    }

    public EmployeeInfo(String id, String firstName, String lastName, String position, String mobile, String gander, String parmanenetAddress, String presentAddress) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.mobile = mobile;
        this.gander = gander;
        this.parmanenetAddress = parmanenetAddress;
        this.presentAddress = presentAddress;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        String oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        String oldFirstName = this.firstName;
        this.firstName = firstName;
        changeSupport.firePropertyChange("firstName", oldFirstName, firstName);
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        String oldLastName = this.lastName;
        this.lastName = lastName;
        changeSupport.firePropertyChange("lastName", oldLastName, lastName);
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        String oldPosition = this.position;
        this.position = position;
        changeSupport.firePropertyChange("position", oldPosition, position);
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        String oldMobile = this.mobile;
        this.mobile = mobile;
        changeSupport.firePropertyChange("mobile", oldMobile, mobile);
    }

    public String getGander() {
        return gander;
    }

    public void setGander(String gander) {
        String oldGander = this.gander;
        this.gander = gander;
        changeSupport.firePropertyChange("gander", oldGander, gander);
    }

    public String getParmanenetAddress() {
        return parmanenetAddress;
    }

    public void setParmanenetAddress(String parmanenetAddress) {
        String oldParmanenetAddress = this.parmanenetAddress;
        this.parmanenetAddress = parmanenetAddress;
        changeSupport.firePropertyChange("parmanenetAddress", oldParmanenetAddress, parmanenetAddress);
    }

    public String getPresentAddress() {
        return presentAddress;
    }

    public void setPresentAddress(String presentAddress) {
        String oldPresentAddress = this.presentAddress;
        this.presentAddress = presentAddress;
        changeSupport.firePropertyChange("presentAddress", oldPresentAddress, presentAddress);
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
        if (!(object instanceof EmployeeInfo)) {
            return false;
        }
        EmployeeInfo other = (EmployeeInfo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "schoolmanagement.EmployeeInfo[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
