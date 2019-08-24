package com.example.proiectcercertare.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Angajat {
    private int idAngajat;
    private String nume;
    private String codDepartament;
    private String codFacultate;

    @Id
    @Column(name = "idAngajat")
    public int getIdAngajat() {
        return idAngajat;
    }

    public void setIdAngajat(int idAngajat) {
        this.idAngajat = idAngajat;
    }

    @Basic
    @Column(name = "Nume")
    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Basic
    @Column(name = "Cod_departament")
    public String getCodDepartament() {
        return codDepartament;
    }

    public void setCodDepartament(String codDepartament) {
        this.codDepartament = codDepartament;
    }

    @Basic
    @Column(name = "Cod_facultate")
    public String getCodFacultate() {
        return codFacultate;
    }

    public void setCodFacultate(String codFacultate) {
        this.codFacultate = codFacultate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Angajat angajat = (Angajat) o;
        return idAngajat == angajat.idAngajat &&
                Objects.equals(nume, angajat.nume) &&
                Objects.equals(codDepartament, angajat.codDepartament) &&
                Objects.equals(codFacultate, angajat.codFacultate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAngajat, nume, codDepartament, codFacultate);
    }
}
