package com.example.proiectcercertare.domain.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Beneficiar {
    private int idBeneficiar;
    private String denumire;
    private String cifCui;
    private String telefon;
    private String adresaEmail;
    private String reprezentant;
    private String functieReprezentant;
    private String banca1;
    private String contBancar1;
    private String banca2;
    private String contBancar2;

    @Id
    @Column(name = "idBeneficiar")
    public int getIdBeneficiar() {
        return idBeneficiar;
    }

    public void setIdBeneficiar(int idBeneficiar) {
        this.idBeneficiar = idBeneficiar;
    }

    @Basic
    @Column(name = "Denumire")
    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    @Basic
    @Column(name = "CIF_CUI")
    public String getCifCui() {
        return cifCui;
    }

    public void setCifCui(String cifCui) {
        this.cifCui = cifCui;
    }

    @Basic
    @Column(name = "Telefon")
    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    @Basic
    @Column(name = "Adresa_email")
    public String getAdresaEmail() {
        return adresaEmail;
    }

    public void setAdresaEmail(String adresaEmail) {
        this.adresaEmail = adresaEmail;
    }

    @Basic
    @Column(name = "Reprezentant")
    public String getReprezentant() {
        return reprezentant;
    }

    public void setReprezentant(String reprezentant) {
        this.reprezentant = reprezentant;
    }

    @Basic
    @Column(name = "Functie_reprezentant")
    public String getFunctieReprezentant() {
        return functieReprezentant;
    }

    public void setFunctieReprezentant(String functieReprezentant) {
        this.functieReprezentant = functieReprezentant;
    }

    @Basic
    @Column(name = "Banca1")
    public String getBanca1() {
        return banca1;
    }

    public void setBanca1(String banca1) {
        this.banca1 = banca1;
    }

    @Basic
    @Column(name = "Cont_bancar1")
    public String getContBancar1() {
        return contBancar1;
    }

    public void setContBancar1(String contBancar1) {
        this.contBancar1 = contBancar1;
    }

    @Basic
    @Column(name = "Banca2")
    public String getBanca2() {
        return banca2;
    }

    public void setBanca2(String banca2) {
        this.banca2 = banca2;
    }

    @Basic
    @Column(name = "Cont_bancar2")
    public String getContBancar2() {
        return contBancar2;
    }

    public void setContBancar2(String contBancar2) {
        this.contBancar2 = contBancar2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Beneficiar that = (Beneficiar) o;
        return idBeneficiar == that.idBeneficiar &&
                Objects.equals(denumire, that.denumire) &&
                Objects.equals(cifCui, that.cifCui) &&
                Objects.equals(telefon, that.telefon) &&
                Objects.equals(adresaEmail, that.adresaEmail) &&
                Objects.equals(reprezentant, that.reprezentant) &&
                Objects.equals(functieReprezentant, that.functieReprezentant) &&
                Objects.equals(banca1, that.banca1) &&
                Objects.equals(contBancar1, that.contBancar1) &&
                Objects.equals(banca2, that.banca2) &&
                Objects.equals(contBancar2, that.contBancar2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idBeneficiar, denumire, cifCui, telefon, adresaEmail, reprezentant, functieReprezentant, banca1, contBancar1, banca2, contBancar2);
    }
}
