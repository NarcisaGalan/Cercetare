package com.example.proiectcercertare.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
public class Cheltuiala {
    private int idCheltuiala;
    private String nrDocument;
    private Date dataDocument;
    private String tipDocument;
    private Double valoareCheltuiala;
    private Double valoareTva;
    private String moneda;
    private String explicatii;
    private String incadrareCheltuiala;
    private ContractTerti contractTertiByIdContractTerti;

    @Id
    @Column(name = "idCheltuiala")
    public int getIdCheltuiala() {
        return idCheltuiala;
    }

    public void setIdCheltuiala(int idCheltuiala) {
        this.idCheltuiala = idCheltuiala;
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
    @Column(name = "Valoare_cheltuiala")
    public Double getValoareCheltuiala() {
        return valoareCheltuiala;
    }

    public void setValoareCheltuiala(Double valoareCheltuiala) {
        this.valoareCheltuiala = valoareCheltuiala;
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
    @Column(name = "Incadrare_cheltuiala")
    public String getIncadrareCheltuiala() {
        return incadrareCheltuiala;
    }

    public void setIncadrareCheltuiala(String incadrareCheltuiala) {
        this.incadrareCheltuiala = incadrareCheltuiala;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cheltuiala that = (Cheltuiala) o;
        return idCheltuiala == that.idCheltuiala &&
                Objects.equals(nrDocument, that.nrDocument) &&
                Objects.equals(dataDocument, that.dataDocument) &&
                Objects.equals(tipDocument, that.tipDocument) &&
                Objects.equals(valoareCheltuiala, that.valoareCheltuiala) &&
                Objects.equals(valoareTva, that.valoareTva) &&
                Objects.equals(moneda, that.moneda) &&
                Objects.equals(explicatii, that.explicatii) &&
                Objects.equals(incadrareCheltuiala, that.incadrareCheltuiala);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCheltuiala, nrDocument, dataDocument, tipDocument, valoareCheltuiala, valoareTva, moneda, explicatii, incadrareCheltuiala);
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
