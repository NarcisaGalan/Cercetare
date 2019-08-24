package com.example.proiectcercertare.domain.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class StatFunctiiPK implements Serializable {
    private int idContractTerti;
    private int idAngajat;

    @Column(name = "idContract_Terti")
    @Id
    public int getIdContractTerti() {
        return idContractTerti;
    }

    public void setIdContractTerti(int idContractTerti) {
        this.idContractTerti = idContractTerti;
    }

    @Column(name = "idAngajat")
    @Id
    public int getIdAngajat() {
        return idAngajat;
    }

    public void setIdAngajat(int idAngajat) {
        this.idAngajat = idAngajat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StatFunctiiPK that = (StatFunctiiPK) o;
        return idContractTerti == that.idContractTerti &&
                idAngajat == that.idAngajat;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idContractTerti, idAngajat);
    }
}
