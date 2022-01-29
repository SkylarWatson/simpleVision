package com.simplevision.core.mapper;

import com.simplevision.core.domain.Info;
import com.simplevision.core.view.PrescriptionDetails;
import com.simplevision.core.view.PrescriptionView;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrescriptionMapperTest {
    private PrescriptionMapper mapper;
    private Info info;

    private PrescriptionView prescription;
    private PrescriptionDetails od;
    private PrescriptionDetails os;

    @BeforeEach
    public void setup() {
        mapper = new PrescriptionMapper();
        info = new Info();

        prescription = new PrescriptionView();
        od = new PrescriptionDetails();
        os = new PrescriptionDetails();

        prescription.setOS(os);
        prescription.setOD(od);
    }

    @Test
    public void setId() {
        info.setId(1);

        assertEquals(1, mapper.map(info).getId());
    }

    @Test
    public void setPD() {
        info.setPD("pd");

        assertEquals("pd", mapper.map(info).getPd());
    }

    @Test
    public void setLeftAxis() {
        info.setLeftAxis("leftAxis");

        assertEquals("leftAxis", mapper.map(info).getOS().getAxis());
    }

    @Test
    public void setLeftCylinder() {
        info.setLeftCylinder("leftCylinder");

        assertEquals("leftCylinder", mapper.map(info).getOS().getCylinder());
    }

    @Test
    public void setLeftSphere() {
        info.setLeftSphere("leftSphere");

        assertEquals("leftSphere", mapper.map(info).getOS().getSphere());
    }

    @Test
    public void setRightAxis() {
        info.setRightAxis("rightAxis");

        assertEquals("rightAxis", mapper.map(info).getOD().getAxis());
    }

    @Test
    public void setRightCylinder() {
        info.setRightCylinder("rightCylinder");

        assertEquals("rightCylinder", mapper.map(info).getOD().getCylinder());
    }

    @Test
    public void setRightSphere() {
        info.setRightSphere("rightSphere");

        assertEquals("rightSphere", mapper.map(info).getOD().getSphere());
    }

    @Test
    public void mapInfo_rightSphere() {
        od.setSphere("rightSphere");

        assertEquals("rightSphere", mapper.map(prescription).getRightSphere());
    }

    @Test
    public void mapInfo_rightCylinder() {
        od.setCylinder("rightCylinder");

        assertEquals("rightCylinder", mapper.map(prescription).getRightCylinder());
    }

    @Test
    public void mapInfo_rightAxis() {
        od.setAxis("rightAxis");

        assertEquals("rightAxis", mapper.map(prescription).getRightAxis());
    }

    @Test
    public void mapInfo_leftSphere() {
        os.setSphere("leftSphere");

        assertEquals("leftSphere", mapper.map(prescription).getLeftSphere());
    }

    @Test
    public void mapInfo_leftAxis() {
        os.setAxis("leftAxis");

        assertEquals("leftAxis", mapper.map(prescription).getLeftAxis());
    }

    @Test
    public void mapInfo_leftCylinder() {
        os.setCylinder("leftCylinder");

        assertEquals("leftCylinder", mapper.map(prescription).getLeftCylinder());
    }

    @Test
    public void mapInfo_pd() {
        prescription.setPd("pd");

        assertEquals("pd", mapper.map(prescription).getPD());
    }

    @Test
    public void mapInfo_id() {
        prescription.setId(1);

        assertEquals(1, mapper.map(prescription).getId());
    }
}