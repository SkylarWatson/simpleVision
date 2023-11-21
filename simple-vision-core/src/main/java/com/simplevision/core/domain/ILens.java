package com.simplevision.core.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public interface ILens {
    String getLensMaterial();
    String getLensAdditions();
    String getLensStyle();
    @Id long getId();

    void setLensMaterial(String lensMaterial);
    void setLensAdditions(String lensAdditions);
    void setLensStyle(String lensStyle);
    void setId(long id);
}
