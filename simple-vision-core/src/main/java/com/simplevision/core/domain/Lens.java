package com.simplevision.core.domain;

import javax.persistence.*;

@Entity
@Table(name = "INFO")
public class Lens implements ILens {
    private String lensMaterial;
    private String lensAdditions;
    private String lensStyle;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Override
    public String getLensMaterial() {
        return lensMaterial;
    }

    @Override
    public void setLensMaterial(String lensMaterial) {
        this.lensMaterial = lensMaterial;
    }

    @Override
    public String getLensAdditions() {
        return lensAdditions;
    }

    @Override
    public void setLensAdditions(String lensAdditions) {
        this.lensAdditions = lensAdditions;
    }

    @Override
    public String getLensStyle() {
        return lensStyle;
    }

    @Override
    public void setLensStyle(String lensStyle) {
        this.lensStyle = lensStyle;
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
