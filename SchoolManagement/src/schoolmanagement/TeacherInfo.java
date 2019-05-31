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
@Table(name = "teacher_info", catalog = "schoolmanagement", schema = "")
@NamedQueries({
    @NamedQuery(name = "TeacherInfo.findAll", query = "SELECT t FROM TeacherInfo t")
    , @NamedQuery(name = "TeacherInfo.findByTid", query = "SELECT t FROM TeacherInfo t WHERE t.tid = :tid")
    , @NamedQuery(name = "TeacherInfo.findByFirstname", query = "SELECT t FROM TeacherInfo t WHERE t.firstname = :firstname")
    , @NamedQuery(name = "TeacherInfo.findByLastname", query = "SELECT t FROM TeacherInfo t WHERE t.lastname = :lastname")
    , @NamedQuery(name = "TeacherInfo.findByPosition", query = "SELECT t FROM TeacherInfo t WHERE t.position = :position")
    , @NamedQuery(name = "TeacherInfo.findByBirthday", query = "SELECT t FROM TeacherInfo t WHERE t.birthday = :birthday")
    , @NamedQuery(name = "TeacherInfo.findByMobile", query = "SELECT t FROM TeacherInfo t WHERE t.mobile = :mobile")
    , @NamedQuery(name = "TeacherInfo.findBySex", query = "SELECT t FROM TeacherInfo t WHERE t.sex = :sex")
    , @NamedQuery(name = "TeacherInfo.findByPerAddress", query = "SELECT t FROM TeacherInfo t WHERE t.perAddress = :perAddress")
    , @NamedQuery(name = "TeacherInfo.findByParAddress", query = "SELECT t FROM TeacherInfo t WHERE t.parAddress = :parAddress")})
public class TeacherInfo implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "T_id")
    private String tid;
    @Basic(optional = false)
    @Column(name = "First_name")
    private String firstname;
    @Basic(optional = false)
    @Column(name = "Last_name")
    private String lastname;
    @Basic(optional = false)
    @Column(name = "Position")
    private String position;
    @Basic(optional = false)
    @Column(name = "Birthday")
    private String birthday;
    @Basic(optional = false)
    @Column(name = "Mobile")
    private String mobile;
    @Basic(optional = false)
    @Column(name = "Sex")
    private String sex;
    @Basic(optional = false)
    @Column(name = "Per_Address")
    private String perAddress;
    @Basic(optional = false)
    @Column(name = "Par_Address")
    private String parAddress;

    public TeacherInfo() {
    }

    public TeacherInfo(String tid) {
        this.tid = tid;
    }

    public TeacherInfo(String tid, String firstname, String lastname, String position, String birthday, String mobile, String sex, String perAddress, String parAddress) {
        this.tid = tid;
        this.firstname = firstname;
        this.lastname = lastname;
        this.position = position;
        this.birthday = birthday;
        this.mobile = mobile;
        this.sex = sex;
        this.perAddress = perAddress;
        this.parAddress = parAddress;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        String oldTid = this.tid;
        this.tid = tid;
        changeSupport.firePropertyChange("tid", oldTid, tid);
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        String oldFirstname = this.firstname;
        this.firstname = firstname;
        changeSupport.firePropertyChange("firstname", oldFirstname, firstname);
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        String oldLastname = this.lastname;
        this.lastname = lastname;
        changeSupport.firePropertyChange("lastname", oldLastname, lastname);
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        String oldPosition = this.position;
        this.position = position;
        changeSupport.firePropertyChange("position", oldPosition, position);
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        String oldBirthday = this.birthday;
        this.birthday = birthday;
        changeSupport.firePropertyChange("birthday", oldBirthday, birthday);
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        String oldMobile = this.mobile;
        this.mobile = mobile;
        changeSupport.firePropertyChange("mobile", oldMobile, mobile);
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        String oldSex = this.sex;
        this.sex = sex;
        changeSupport.firePropertyChange("sex", oldSex, sex);
    }

    public String getPerAddress() {
        return perAddress;
    }

    public void setPerAddress(String perAddress) {
        String oldPerAddress = this.perAddress;
        this.perAddress = perAddress;
        changeSupport.firePropertyChange("perAddress", oldPerAddress, perAddress);
    }

    public String getParAddress() {
        return parAddress;
    }

    public void setParAddress(String parAddress) {
        String oldParAddress = this.parAddress;
        this.parAddress = parAddress;
        changeSupport.firePropertyChange("parAddress", oldParAddress, parAddress);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tid != null ? tid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TeacherInfo)) {
            return false;
        }
        TeacherInfo other = (TeacherInfo) object;
        if ((this.tid == null && other.tid != null) || (this.tid != null && !this.tid.equals(other.tid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "schoolmanagement.TeacherInfo[ tid=" + tid + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
