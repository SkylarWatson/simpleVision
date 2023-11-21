package com.simplevision.core.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public interface IPrescription {
    String getLeftSphere();
    String getLeftCylinder();
    String getLeftAxis();
    String getRightSphere();
    String getRightCylinder();
    String getRightAxis();
    String getPD();
    @Id long getId();

    void setLeftSphere(String leftSphere);
    void setLeftCylinder(String leftCylinder);
    void setLeftAxis(String leftAxis);
    void setRightAxis(String rightAxis);
    void setRightSphere(String rightSphere);
    void setRightCylinder(String rightCylinder);
    void setPD(String pd);
    void setId(long id);
}
