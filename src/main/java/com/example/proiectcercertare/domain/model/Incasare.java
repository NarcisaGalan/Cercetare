package com.example.proiectcercertare.domain.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
public class Incasare {
    private int idIncasare;
    private String nrDocument;
    private Date dataDocument;
    private String tipDocument;
    private Double valoareIncasata;
    private Double valoareTva;
    private String moneda;
    private String explicatii;
    private String incadrareIncasare;
    private ContractTerti contractTertiByIdContractTerti;

    @Id
    @Column(name = "idIncasare")
    public int getIdIncasare() {
        return idIncasare;
    }

    public void setIdIncasare(int idIncasare) {
        this.idIncasare = idIncasare;
    }

    @Basic
    @Column(name = "Nr_document")
    public String getNrDocument() {
        return nrDocument;
    }

    public void setNrDocument(String nrDocument) {
        this.nrDocument = nrDocument;
    }

    @Basic
    @Column(name = "Data_document")
    public Date getDataDocument() {
        return dataDocument;
    }

    public void setDataDocument(Date dataDocument) {
        this.dataDocument = dataDocument;
    }

    @Basic
    @Column(name = "Tip_document")
    public String getTipDocument() {
        return tipDocument;
    }

    public void setTipDocument(String tipDocument) {
        this.tipDocument = tipDocument;
    }

    @Basic
    @Column(name = "Valoare_incasata")
    public Double getValoareIncasata() {
        return valoareIncasata;
    }

    public void setValoareIncasata(Double valoareIncasata) {
        this.valoareIncasata = valoareIncasata;
    }

    @Basic
    @Column(name = "Valoare_TVA")
    public Double getValoareTva() {
        return valoareTva;
    }

    public void setValoareTva(Double valoareTva) {
        this.valoareTva = valoareTva;
    }

    @Basic
    @Column(name = "Moneda")
    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    @Basic
    @Column(name = "Explicatii")
    public String getExplicatii() {
        return explicatii;
    }

    public void setExplicatii(String explicatii) {
        this.explicatii = explicatii;
    }

    @Basic
    @Column(name = "Incadrare_incasare")
    public String getIncadrareIncasare() {
        return incadrareIncasare;
    }

    public void setIncadrareIncasare(String incadrareIncasare) {
        this.incadrareIncasare = incadrareIncasare;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Incasare incasare = (Incasare) o;
        return idIncasare == incasare.idIncasare &&
                Objects.equals(nrDocument, incasare.nrDocument) &&
                Objects.equals(dataDocument, incasare.dataDocument) &&
                Objects.equals(tipDocument, incasare.tipDocument) &&
                Objects.equals(valoareIncasata, incasare.valoareIncasata) &&
                Objects.equals(valoareTva, incasare.valoareTva) &&
                Objects.equals(moneda, incasare.moneda) &&
                Objects.equals(explicatii, incasare.explicatii) &&
                Objects.equals(incadrareIncasare, incasare.incadrareIncasare);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idIncasare, nrDocument, dataDocument, tipDocument, valoareIncasata, valoareTva, moneda, explicatii, incadrareIncasare);
    }

    @ManyToOne
    @JoinColumn(name = "idContract_Terti", referencedColumnName = "idcontract_terti")
    public ContractTerti getContractTertiByIdContractTerti() {
        return contractTertiByIdContractTerti;
    }

    public void setContractTertiByIdContractTerti(ContractTerti contractTertiByIdContractTerti) {
        this.contractTertiByIdContractTerti = contractTertiByIdContractTerti;
    }
}
