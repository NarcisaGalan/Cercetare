package com.example.proiectcercertare.domain.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "cerere_imprumut", schema = "cercetare")
public class CerereImprumut {
    private int idCerereImprumut;
    private Integer numar;
    private Date data;
    private Integer anul;
    private String etapa;
    private Double valoareaTotala;
    private Double salarii;
    private Double achizitii;
    private Double deplasari;
    private Double taxe;
    private Date dataReturnarii;
    private String aprobata;

    @Id
    @Column(name = "idCerere_imprumut")
    public int getIdCerereImprumut() {
        return idCerereImprumut;
    }

    public void setIdCerereImprumut(int idCerereImprumut) {
        this.idCerereImprumut = idCerereImprumut;
    }

    @Basic
    @Column(name = "Numar")
    public Integer getNumar() {
        return numar;
    }

    public void setNumar(Integer numar) {
        this.numar = numar;
    }

    @Basic
    @Column(name = "Data")
    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Basic
    @Column(name = "Anul")
    public Integer getAnul() {
        return anul;
    }

    public void setAnul(Integer anul) {
        this.anul = anul;
    }

    @Basic
    @Column(name = "Etapa")
    public String getEtapa() {
        return etapa;
    }

    public void setEtapa(String etapa) {
        this.etapa = etapa;
    }

    @Basic
    @Column(name = "Valoarea_totala")
    public Double getValoareaTotala() {
        return valoareaTotala;
    }

    public void setValoareaTotala(Double valoareaTotala) {
        this.valoareaTotala = valoareaTotala;
    }

    @Basic
    @Column(name = "Salarii")
    public Double getSalarii() {
        return salarii;
    }

    public void setSalarii(Double salarii) {
        this.salarii = salarii;
    }

    @Basic
    @Column(name = "Achizitii")
    public Double getAchizitii() {
        return achizitii;
    }

    public void setAchizitii(Double achizitii) {
        this.achizitii = achizitii;
    }

    @Basic
    @Column(name = "Deplasari")
    public Double getDeplasari() {
        return deplasari;
    }

    public void setDeplasari(Double deplasari) {
        this.deplasari = deplasari;
    }

    @Basic
    @Column(name = "Taxe")
    public Double getTaxe() {
        return taxe;
    }

    public void setTaxe(Double taxe) {
        this.taxe = taxe;
    }

    @Basic
    @Column(name = "Data_returnarii")
    public Date getDataReturnarii() {
        return dataReturnarii;
    }

    public void setDataReturnarii(Date dataReturnarii) {
        this.dataReturnarii = dataReturnarii;
    }

    @Basic
    @Column(name = "Aprobata")
    public String getAprobata() {
        return aprobata;
    }

    public void setAprobata(String aprobata) {
        this.aprobata = aprobata;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CerereImprumut that = (CerereImprumut) o;
        return idCerereImprumut == that.idCerereImprumut &&
                Objects.equals(numar, that.numar) &&
                Objects.equals(data, that.data) &&
                Objects.equals(anul, that.anul) &&
                Objects.equals(etapa, that.etapa) &&
                Objects.equals(valoareaTotala, that.valoareaTotala) &&
                Objects.equals(salarii, that.salarii) &&
                Objects.equals(achizitii, that.achizitii) &&
                Objects.equals(deplasari, that.deplasari) &&
                Objects.equals(taxe, that.taxe) &&
                Objects.equals(dataReturnarii, that.dataReturnarii) &&
                Objects.equals(aprobata, that.aprobata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCerereImprumut, numar, data, anul, etapa, valoareaTotala, salarii, achizitii, deplasari, taxe, dataReturnarii, aprobata);
    }
}
