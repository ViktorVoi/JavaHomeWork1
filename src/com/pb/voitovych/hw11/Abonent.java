package com.pb.voitovych.hw11;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Abonent {

    private String pib ;
    private LocalDate dateBirth ;
    private String phones ; // -- here may be other subclass!
    private String address ;
    private LocalDateTime dtEdit ;

    public Abonent() {
    }

    public Abonent(String pib, LocalDate dateBirth, String phones, String address, LocalDateTime dtEdit) {
        this.pib = pib;
        this.dateBirth = dateBirth;
        this.phones = phones;
        this.address = address;
        this.dtEdit = dtEdit;
    }

    public String getPib() {
        return pib;
    }

    public void setPib(String pib) {
        this.pib = pib;
    }

    public LocalDate getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(LocalDate dateBirth) {
        this.dateBirth = dateBirth;
    }

    public String getPhones() {
        return phones;
    }

    public void setPhones(String phones) {
        this.phones = phones;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDateTime getDtEdit() {
        return dtEdit;
    }

    public void setDtEdit(LocalDateTime dtEdit) {
        this.dtEdit = dtEdit;
    }
}
