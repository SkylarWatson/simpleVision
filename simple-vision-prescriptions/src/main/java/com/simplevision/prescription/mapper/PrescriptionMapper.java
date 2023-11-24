package com.simplevision.prescription.mapper;

import com.simplevision.prescription.domain.Prescription;
import com.simplevision.prescription.view.PrescriptionDetails;
import com.simplevision.prescription.view.PrescriptionView;
import org.springframework.stereotype.Component;

@Component
public class PrescriptionMapper {
    public PrescriptionView map(Prescription prescription) {
        PrescriptionView prescriptionView = new PrescriptionView();
        prescriptionView.setId(prescription.getId());
        prescriptionView.setPd(prescription.getPD());
        prescriptionView.setOS(mapOS(prescription));
        prescriptionView.setOD(mapOD(prescription));

        return prescriptionView;
    }

    private PrescriptionDetails mapOS(Prescription prescription) {
        PrescriptionDetails os = new PrescriptionDetails();
        os.setAxis(prescription.getLeftAxis());
        os.setCylinder(prescription.getLeftCylinder());
        os.setSphere(prescription.getLeftSphere());
        return os;
    }

    private PrescriptionDetails mapOD(Prescription prescription) {
        PrescriptionDetails od = new PrescriptionDetails();
        od.setAxis(prescription.getRightAxis());
        od.setCylinder(prescription.getRightCylinder());
        od.setSphere(prescription.getRightSphere());
        return od;
    }

    public Prescription map(PrescriptionView prescriptionView) {
        Prescription prescription = new Prescription();
        prescription.setRightSphere(prescriptionView.getOD().getSphere());
        prescription.setRightCylinder(prescriptionView.getOD().getCylinder());
        prescription.setRightAxis(prescriptionView.getOD().getAxis());
        prescription.setLeftSphere(prescriptionView.getOS().getSphere());
        prescription.setLeftCylinder(prescriptionView.getOS().getCylinder());
        prescription.setLeftAxis(prescriptionView.getOS().getAxis());
        prescription.setId(prescriptionView.getId());
        prescription.setPD(prescriptionView.getPd());
        return prescription;
    }
}