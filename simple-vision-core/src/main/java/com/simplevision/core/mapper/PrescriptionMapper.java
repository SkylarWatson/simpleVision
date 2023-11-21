package com.simplevision.core.mapper;

import com.simplevision.core.domain.IPrescription;
import com.simplevision.core.domain.Info;
import com.simplevision.core.view.PrescriptionDetails;
import com.simplevision.core.view.PrescriptionView;
import org.springframework.stereotype.Component;

@Component
public class PrescriptionMapper {
    public PrescriptionView map(IPrescription prescription) {
        PrescriptionView prescriptionView = new PrescriptionView();
        prescriptionView.setId(prescription.getId());
        prescriptionView.setPd(prescription.getPD());
        prescriptionView.setOS(mapOS(prescription));
        prescriptionView.setOD(mapOD(prescription));

        return prescriptionView;
    }

    private PrescriptionDetails mapOS(IPrescription prescription) {
        PrescriptionDetails os = new PrescriptionDetails();
        os.setAxis(prescription.getLeftAxis());
        os.setCylinder(prescription.getLeftCylinder());
        os.setSphere(prescription.getLeftSphere());
        return os;
    }

    private PrescriptionDetails mapOD(IPrescription prescription) {
        PrescriptionDetails od = new PrescriptionDetails();
        od.setAxis(prescription.getRightAxis());
        od.setCylinder(prescription.getRightCylinder());
        od.setSphere(prescription.getRightSphere());
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