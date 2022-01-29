package com.simplevision.core.mapper;

import com.simplevision.core.domain.Info;
import com.simplevision.core.view.PrescriptionDetails;
import com.simplevision.core.view.PrescriptionView;
import org.springframework.stereotype.Component;

@Component
public class PrescriptionMapper {
    public PrescriptionView map(Info info) {
        PrescriptionView prescriptionView = new PrescriptionView();
        prescriptionView.setId(info.getId());
        prescriptionView.setPd(info.getPD());
        prescriptionView.setOS(mapOS(info));
        prescriptionView.setOD(mapOD(info));

        return prescriptionView;
    }

    private PrescriptionDetails mapOS(Info info) {
        PrescriptionDetails os = new PrescriptionDetails();
        os.setAxis(info.getLeftAxis());
        os.setCylinder(info.getLeftCylinder());
        os.setSphere(info.getLeftSphere());
        return os;
    }

    private PrescriptionDetails mapOD(Info info) {
        PrescriptionDetails od = new PrescriptionDetails();
        od.setAxis(info.getRightAxis());
        od.setCylinder(info.getRightCylinder());
        od.setSphere(info.getRightSphere());
        return od;
    }

    public Info map(PrescriptionView prescriptionView) {
        Info info = new Info();
        info.setRightSphere(prescriptionView.getOD().getSphere());
        info.setRightCylinder(prescriptionView.getOD().getCylinder());
        info.setRightAxis(prescriptionView.getOD().getAxis());
        info.setLeftSphere(prescriptionView.getOS().getSphere());
        info.setLeftCylinder(prescriptionView.getOS().getCylinder());
        info.setLeftAxis(prescriptionView.getOS().getAxis());
        info.setId(prescriptionView.getId());
        info.setPD(prescriptionView.getPd());
        return info;
    }
}