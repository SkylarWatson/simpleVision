package com.simplevision.prescription.domain;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "PRESCRIPTION")
public class Prescription {
    private String leftSphere;
    private String leftCylinder;
    private String leftAxis;
    private String rightSphere;
    private String rightCylinder;
    private String rightAxis;
    private String pd;

    @Id
    @GeneratedValue
    private UUID id;

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
        return pd;
    }

    public void setPD(String pd) {
        this.pd = pd;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
