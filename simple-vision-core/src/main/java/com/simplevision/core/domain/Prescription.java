package com.simplevision.core.domain;

import javax.persistence.*;

@Entity
@Table(name = "INFO")
public class Prescription implements IPrescription {
    private String leftSphere;
    private String leftCylinder;
    private String leftAxis;
    private String rightSphere;
    private String rightCylinder;
    private String rightAxis;
    private String pd;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Override
    public String getLeftSphere() {
        return leftSphere;
    }

    @Override
    public void setLeftSphere(String leftSphere) {
        this.leftSphere = leftSphere;
    }

    @Override
    public String getLeftCylinder() {
        return leftCylinder;
    }

    @Override
    public void setLeftCylinder(String leftCylinder) {
        this.leftCylinder = leftCylinder;
    }

    @Override
    public String getLeftAxis() {
        return leftAxis;
    }

    @Override
    public void setLeftAxis(String leftAxis) {
        this.leftAxis = leftAxis;
    }

    @Override
    public String getRightSphere() {
        return rightSphere;
    }

    @Override
    public void setRightSphere(String rightSphere) {
        this.rightSphere = rightSphere;
    }

    @Override
    public String getRightCylinder() {
        return rightCylinder;
    }

    @Override
    public void setRightCylinder(String rightCylinder) {
        this.rightCylinder = rightCylinder;
    }

    @Override
    public String getRightAxis() {
        return rightAxis;
    }

    @Override
    public void setRightAxis(String rightAxis) {
        this.rightAxis = rightAxis;
    }

    public String getPD() {
        return pd;
    }

    public void setPD(String pd) {
        this.pd = pd;
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }
}
