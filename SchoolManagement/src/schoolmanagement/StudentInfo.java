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
@Table(name = "student_info", catalog = "schoolmanagement", schema = "")
@NamedQueries({
    @NamedQuery(name = "StudentInfo.findAll", query = "SELECT s FROM StudentInfo s")
    , @NamedQuery(name = "StudentInfo.findByRoll", query = "SELECT s FROM StudentInfo s WHERE s.roll = :roll")
    , @NamedQuery(name = "StudentInfo.findByFirstName", query = "SELECT s FROM StudentInfo s WHERE s.firstName = :firstName")
    , @NamedQuery(name = "StudentInfo.findByLastName", query = "SELECT s FROM StudentInfo s WHERE s.lastName = :lastName")
    , @NamedQuery(name = "StudentInfo.findByClass1", query = "SELECT s FROM StudentInfo s WHERE s.class1 = :class1")
    , @NamedQuery(name = "StudentInfo.findByYear", query = "SELECT s FROM StudentInfo s WHERE s.year = :year")
    , @NamedQuery(name = "StudentInfo.findByBirthday", query = "SELECT s FROM StudentInfo s WHERE s.birthday = :birthday")
    , @NamedQuery(name = "StudentInfo.findByMoblile", query = "SELECT s FROM StudentInfo s WHERE s.moblile = :moblile")
    , @NamedQuery(name = "StudentInfo.findByGender", query = "SELECT s FROM StudentInfo s WHERE s.gender = :gender")
    , @NamedQuery(name = "StudentInfo.findByParmanentAddress", query = "SELECT s FROM StudentInfo s WHERE s.parmanentAddress = :parmanentAddress")
    , @NamedQuery(name = "StudentInfo.findByPresentAddress", query = "SELECT s FROM StudentInfo s WHERE s.presentAddress = :presentAddress")})
public class StudentInfo implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Roll")
    private String roll;
    @Basic(optional = false)
    @Column(name = "First_Name")
    private String firstName;
    @Basic(optional = false)
    @Column(name = "Last_Name")
    private String lastName;
    @Basic(optional = false)
    @Column(name = "class")
    private String class1;
    @Basic(optional = false)
    @Column(name = "Year")
    private String year;
    @Basic(optional = false)
    @Column(name = "Birthday")
    private String birthday;
    @Basic(optional = false)
    @Column(name = "Moblile")
    private String moblile;
    @Basic(optional = false)
    @Column(name = "Gender")
    private String gender;
    @Basic(optional = false)
    @Column(name = "Parmanent_Address")
    private String parmanentAddress;
    @Basic(optional = false)
    @Column(name = "Present_Address")
    private String presentAddress;

    public StudentInfo() {
    }

    public StudentInfo(String roll) {
        this.roll = roll;
    }

    public StudentInfo(String roll, String firstName, String lastName, String class1, String year, String birthday, String moblile, String gender, String parmanentAddress, String presentAddress) {
        this.roll = roll;
        this.firstName = firstName;
        this.lastName = lastName;
        this.class1 = class1;
        this.year = year;
        this.birthday = birthday;
        this.moblile = moblile;
        this.gender = gender;
        this.parmanentAddress = parmanentAddress;
        this.presentAddress = presentAddress;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        String oldRoll = this.roll;
        this.roll = roll;
        changeSupport.firePropertyChange("roll", oldRoll, roll);
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

    public String getClass1() {
        return class1;
    }

    public void setClass1(String class1) {
        String oldClass1 = this.class1;
        this.class1 = class1;
        changeSupport.firePropertyChange("class1", oldClass1, class1);
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        String oldYear = this.year;
        this.year = year;
        changeSupport.firePropertyChange("year", oldYear, year);
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        String oldBirthday = this.birthday;
        this.birthday = birthday;
        changeSupport.firePropertyChange("birthday", oldBirthday, birthday);
    }

    public String getMoblile() {
        return moblile;
    }

    public void setMoblile(String moblile) {
        String oldMoblile = this.moblile;
        this.moblile = moblile;
        changeSupport.firePropertyChange("moblile", oldMoblile, moblile);
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        String oldGender = this.gender;
        this.gender = gender;
        changeSupport.firePropertyChange("gender", oldGender, gender);
    }

    public String getParmanentAddress() {
        return parmanentAddress;
    }

    public void setParmanentAddress(String parmanentAddress) {
        String oldParmanentAddress = this.parmanentAddress;
        this.parmanentAddress = parmanentAddress;
        changeSupport.firePropertyChange("parmanentAddress", oldParmanentAddress, parmanentAddress);
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
        hash += (roll != null ? roll.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StudentInfo)) {
            return false;
        }
        StudentInfo other = (StudentInfo) object;
        if ((this.roll == null && other.roll != null) || (this.roll != null && !this.roll.equals(other.roll))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "schoolmanagement.StudentInfo[ roll=" + roll + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
