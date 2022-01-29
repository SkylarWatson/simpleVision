package com.simplevision.core.mapper;

import com.simplevision.core.domain.Info;
import com.simplevision.core.view.LensView;
import org.springframework.stereotype.Component;

@Component
public class LensMapper {
    public Info map(LensView lens) {
        Info info = new Info();
        info.setLensMaterial(lens.getMaterial());
        info.setLensStyle(lens.getStyle());
        info.setLensAdditions(lens.getAdditions());
        return info;
    }

    public LensView map(Info info) {
        LensView lensView = new LensView();
        lensView.setMaterial(info.getLensMaterial());
        lensView.setStyle(info.getLensStyle());
        lensView.setAdditions(info.getLensAdditions());
        return lensView;
    }
}
