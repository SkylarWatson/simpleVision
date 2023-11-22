package com.simplevision.lens.controller;

import com.simplevision.lens.view.LensView;
import com.simplevision.lens.service.LensService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class LensControllerTest {
    @InjectMocks private LensController controller;
    @Mock private LensService service;

    @Test
    public void createLens() {
        LensView lens = new LensView();

        controller.create(lens);

        verify(service).create(lens);
    }

    @Test
    public void findLensById() {
        LensView lens = new LensView();

        when(service.findLensById(anyLong())).thenReturn(lens);

        assertEquals(lens, controller.findLensById(1));
    }
}
