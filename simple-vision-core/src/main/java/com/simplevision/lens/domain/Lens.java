package com.simplevision.lens.domain;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "INFO")
public class Lens {
    private String lensMaterial;
    private String lensAdditions;
    private String lensStyle;
    private UUID prescriptionId;

    public UUID getPrescriptionId() {
        return prescriptionId;
    }

    public void setPrescriptionId(UUID prescriptionId) {
        this.prescriptionId = prescriptionId;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    public String getLensMaterial() {
        return lensMaterial;
    }

    public void setLensMaterial(String lensMaterial) {
        this.lensMaterial = lensMaterial;
    }

    public String getLensAdditions() {
        return lensAdditions;
    }

    public void setLensAdditions(String lensAdditions) {
        this.lensAdditions = lensAdditions;
    }

    public String getLensStyle() {
        return lensStyle;
    }

    public void setLensStyle(String lensStyle) {
        this.lensStyle = lensStyle;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
