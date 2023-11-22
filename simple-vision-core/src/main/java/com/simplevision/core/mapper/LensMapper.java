package com.simplevision.core.mapper;

import com.simplevision.core.domain.ILens;
import com.simplevision.core.domain.Info;
import com.simplevision.core.view.LensView;
import org.springframework.stereotype.Component;

@Component
public class LensMapper {
    public ILens map(LensView lens) {
        ILens info = new Info();
        info.setLensMaterial(lens.getMaterial());
        info.setLensStyle(lens.getStyle());
        info.setLensAdditions(lens.getAdditions());
        return info;
    }

    public LensView map(ILens lens) {
        LensView lensView = new LensView();
        lensView.setMaterial(lens.getLensMaterial());
        lensView.setStyle(lens.getLensStyle());
        lensView.setAdditions(lens.getLensAdditions());
        return lensView;
    }
}
