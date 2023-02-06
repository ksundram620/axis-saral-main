package com.axis.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.*;

import java.util.Objects;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer"})
public class Manager {
    @Id
    @Column(name = "Manager_Id", nullable = false)
    private String managerId;
    @Column(name = "Manager_Name", nullable = false)
    private String managerName;
    @Column(name = "Manager_Designation", nullable = false)
    private String designation;
    @Column(name = "Email_id", nullable = false)
    private String emailId;
    @Column(name = "Mobile_No", nullable = false)
    private Long mobileNo;
    @Column(name = "Password", nullable = false)
    private String password;

    @Column(name = "Manager_Profile", nullable=false)
    public String profile;

    public Manager() {
    }

    public Manager(String managerId, String managerName, String designation, String emailId, Long mobileNo, String password, String profile) {
        this.managerId = managerId;
        this.managerName = managerName;
        this.designation = designation;
        this.emailId = emailId;
        this.mobileNo = mobileNo;
        this.password = password;
        this.profile = profile;
    }

    public String getManagerId() {
        return managerId;
    }

    public void setManagerId(String managerId) {
        this.managerId = managerId;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public Long getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(Long mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }


    @Override
    public String toString() {
        return "Manager{" +
                "managerId='" + managerId + '\'' +
                ", managerName='" + managerName + '\'' +
                ", designation='" + designation + '\'' +
                ", emailId='" + emailId + '\'' +
                ", mobileNo=" + mobileNo +
                ", password='" + password + '\'' +
                ", profile='" + profile + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Manager)) return false;
        Manager manager = (Manager) o;
        return getManagerId().equals(manager.getManagerId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getManagerId());
    }
}
