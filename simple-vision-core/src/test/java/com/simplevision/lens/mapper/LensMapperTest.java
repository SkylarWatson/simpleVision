package com.simplevision.lens.mapper;

import com.simplevision.core.domain.Lens;
import com.simplevision.core.view.LensView;
import com.simplevision.lens.mapper.LensMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LensMapperTest {
    private LensMapper mapper;
    private LensView lensView;
    private Lens lens;

    @BeforeEach
    public void setup() {
        mapper = new LensMapper();
        lensView = new LensView();
        lens = new Lens();
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
        lens.setLensMaterial("trivex");

        assertEquals("trivex", mapper.map(lens).getMaterial());
    }

    @Test
    public void mapToLens_visionType() {
        lens.setLensStyle("bifocals");

        assertEquals("bifocals", mapper.map(lens).getStyle());
    }

    @Test
    public void mapToLens_coating() {
        lens.setLensAdditions("reflective");

        assertEquals("reflective", mapper.map(lens).getAdditions());
    }
}