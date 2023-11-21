package com.simplevision.core.domain;

public interface IPrescription {
    String getLeftSphere();
    String getLeftCylinder();
    String getLeftAxis();
    String getRightSphere();
    String getRightCylinder();
    String getRightAxis();
    String getPD();
    long getId();
}
