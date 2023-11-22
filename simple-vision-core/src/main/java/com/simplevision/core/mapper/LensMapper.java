package com.simplevision.core.mapper;

import com.simplevision.core.domain.ILens;
import com.simplevision.core.domain.Lens;
import com.simplevision.core.view.LensView;
import org.springframework.stereotype.Component;

@Component
public class LensMapper {
    public Lens map(LensView lensView) {
        Lens lens = new Lens();
        lens.setLensMaterial(lensView.getMaterial());
        lens.setLensStyle(lensView.getStyle());
        lens.setLensAdditions(lensView.getAdditions());
        return lens;
    }

    public LensView map(ILens lens) {
        LensView lensView = new LensView();
        lensView.setMaterial(lens.getLensMaterial());
        lensView.setStyle(lens.getLensStyle());
        lensView.setAdditions(lens.getLensAdditions());
        return lensView;
    }
}
