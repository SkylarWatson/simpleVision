package com.simplevision.prescription.view;

import java.util.UUID;

public class PrescriptionView {
    PrescriptionDetails OD;
    PrescriptionDetails OS;
    String pd;
    UUID id;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
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
