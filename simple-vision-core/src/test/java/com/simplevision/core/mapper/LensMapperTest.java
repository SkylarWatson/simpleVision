package com.simplevision.core.mapper;

import com.simplevision.core.domain.Info;
import com.simplevision.core.view.LensView;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LensMapperTest {
    private LensMapper mapper;
    private LensView lensView;
    private Info info;

    @BeforeEach
    public void setup() {
        mapper = new LensMapper();
        lensView = new LensView();
        info = new Info();
    }

    @Test
    public void mapToInfo_lensType() {
        lensView.setMaterial("trivex");

        assertEquals("trivex", mapper.map(lensView).getLensMaterial());
    }

    @Test
    public void mapToInfo_visionType() {
        lensView.setStyle("bifocals");

        assertEquals("bifocals", mapper.map(lensView).getLensStyle());
    }

    @Test
    public void mapToInfo_coating() {
        lensView.setAdditions("reflective");

        assertEquals("reflective", mapper.map(lensView).getLensAdditions());
    }

    @Test
    public void mapToLens_lensType() {
        info.setLensMaterial("trivex");

        assertEquals("trivex", mapper.map(info).getMaterial());
    }

    @Test
    public void mapToLens_visionType() {
        info.setLensStyle("bifocals");

        assertEquals("bifocals", mapper.map(info).getStyle());
    }

    @Test
    public void mapToLens_coating() {
        info.setLensAdditions("reflective");

        assertEquals("reflective", mapper.map(info).getAdditions());
    }
}