package com.simplevision.lens.mapper;

import com.simplevision.lens.domain.Lens;
import com.simplevision.lens.view.LensView;
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

    public LensView map(Lens lens) {
        LensView lensView = new LensView();
        lensView.setMaterial(lens.getLensMaterial());
        lensView.setStyle(lens.getLensStyle());
        lensView.setAdditions(lens.getLensAdditions());
        return lensView;
    }
}
