package com.simplevision.lens.service;

import com.simplevision.core.service.InfoService;
import com.simplevision.core.view.LensView;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class LensServiceTest {
    @Autowired private LensService service;

    @Test
    public void findLensById() {
        LensView lens = new LensView();
        lens.setStyle("trifocal");

        long id = service.create(lens).getId();

        assertEquals("trifocal", service.findLensById(id).getStyle());
    }
}
