package com.simplevision.core.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public interface IPatient {
    String getName();
    String getAddress();
    String getEmail();
    String getPhoneNumber();
    @Id long getId();

    void setName(String name);
    void setAddress(String address);
    void setEmail(String email);
    void setPhoneNumber(String phoneNumber);
    void setId(long id);
}
