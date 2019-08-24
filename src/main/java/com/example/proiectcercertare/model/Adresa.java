package com.example.proiectcercertare.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Adresa {
    private int idAdresa;
    private String tara;
    private String judet;
    private String localitate;
    private String strada;
    private String detaliiAdresaNr;

    @Id
    @Column(name = "idAdresa")
    public int getIdAdresa() {
        return idAdresa;
    }

    public void setIdAdresa(int idAdresa) {
        this.idAdresa = idAdresa;
    }

    @Basic
    @Column(name = "Tara")
    public String getTara() {
        return tara;
    }

    public void setTara(String tara) {
        this.tara = tara;
    }

    @Basic
    @Column(name = "Judet")
    public String getJudet() {
        return judet;
    }

    public void setJudet(String judet) {
        this.judet = judet;
    }

    @Basic
    @Column(name = "Localitate")
    public String getLocalitate() {
        return localitate;
    }

    public void setLocalitate(String localitate) {
        this.localitate = localitate;
    }

    @Basic
    @Column(name = "Strada")
    public String getStrada() {
        return strada;
    }

    public void setStrada(String strada) {
        this.strada = strada;
    }

    @Basic
    @Column(name = "Detalii_adresa_nr")
    public String getDetaliiAdresaNr() {
        return detaliiAdresaNr;
    }

    public void setDetaliiAdresaNr(String detaliiAdresaNr) {
        this.detaliiAdresaNr = detaliiAdresaNr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Adresa adresa = (Adresa) o;
        return idAdresa == adresa.idAdresa &&
                Objects.equals(tara, adresa.tara) &&
                Objects.equals(judet, adresa.judet) &&
                Objects.equals(localitate, adresa.localitate) &&
                Objects.equals(strada, adresa.strada) &&
                Objects.equals(detaliiAdresaNr, adresa.detaliiAdresaNr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAdresa, tara, judet, localitate, strada, detaliiAdresaNr);
    }
}
