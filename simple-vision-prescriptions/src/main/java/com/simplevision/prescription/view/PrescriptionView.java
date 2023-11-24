package com.simplevision.prescription.view;

public class PrescriptionView {
    PrescriptionDetails OD;
    PrescriptionDetails OS;
    String pd;
    long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
