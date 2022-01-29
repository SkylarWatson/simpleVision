package com.simplevision.core.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Info {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    private String name;
    private String address;
    private String leftSphere;
    private String leftCylinder;
    private String leftAxis;
    private String rightSphere;
    private String rightCylinder;
    private String rightAxis;
    private String PD;
    private String lensMaterial;
    private String lensAdditions;
    private String lensStyle;
    private String email;
    private String phoneNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLeftSphere() {
        return leftSphere;
    }

    public void setLeftSphere(String leftSphere) {
        this.leftSphere = leftSphere;
    }

    public String getLeftCylinder() {
        return leftCylinder;
    }

    public void setLeftCylinder(String leftCylinder) {
        this.leftCylinder = leftCylinder;
    }

    public String getLeftAxis() {
        return leftAxis;
    }

    public void setLeftAxis(String leftAxis) {
        this.leftAxis = leftAxis;
    }

    public String getRightSphere() {
        return rightSphere;
    }

    public void setRightSphere(String rightSphere) {
        this.rightSphere = rightSphere;
    }

    public String getRightCylinder() {
        return rightCylinder;
    }

    public void setRightCylinder(String rightCylinder) {
        this.rightCylinder = rightCylinder;
    }

    public String getRightAxis() {
        return rightAxis;
    }

    public void setRightAxis(String rightAxis) {
        this.rightAxis = rightAxis;
    }

    public String getPD() {
        return PD;
    }

    public void setPD(String PD) {
        this.PD = PD;
    }

    public String getLensMaterial() {
        return lensMaterial;
    }

    public void setLensMaterial(String lensMaterial) {
        this.lensMaterial = lensMaterial;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLensAdditions() {
        return lensAdditions;
    }

    public void setLensAdditions(String lensCoating) {
        this.lensAdditions = lensCoating;
    }

    public String getLensStyle() {
        return lensStyle;
    }

    public void setLensStyle(String visionType) {
        this.lensStyle = visionType;
    }
}

