package com.simplevision.lens.domain;

import javax.persistence.*;

@Entity
@Table(name = "INFO")
public class Lens {
    private String lensMaterial;
    private String lensAdditions;
    private String lensStyle;

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
