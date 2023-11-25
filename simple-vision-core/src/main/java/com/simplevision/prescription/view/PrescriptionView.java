package com.simplevision.prescription.view;

public class PrescriptionView {
    PrescriptionDetails OD;
    PrescriptionDetails OS;
    String pd;
    long patientId;

    public long getPatientId() {
        return patientId;
    }

    public void setPatientId(long patientId) {
        this.patientId = patientId;
    }

    public String getPd() {
        return pd;
    }

    public void setPd(String pd) {
        this.pd = pd;
    }

    public PrescriptionDetails getOD() {
        return OD;
    }

    public void setOD(PrescriptionDetails OD) {
        this.OD = OD;
    }

    public PrescriptionDetails getOS() {
        return OS;
    }

    public void setOS(PrescriptionDetails OS) {
        this.OS = OS;
    }
}
