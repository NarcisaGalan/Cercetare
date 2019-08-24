package com.example.proiectcercertare.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "contract_terti", schema = "cercetare")
public class ContractTerti {
    private int idcontractTerti;
    private Integer numar;
    private Date data;
    private String tip;
    private Date contractTerticol;
    private String titluProiect;
    private String reprezentantBeneficiar;
    private String functie;
    private Double valoare;
    private String moneda;
    private Date dataIncheierii;
    private Integer nrPagini;
    private Integer nrExemplare;
    private Integer nrExemplareBeneficiar;
    private Date dataInceput;
    private Date dataSfarsit;
    private String coordonatorPartener;
    private Double regie;
    private Double tva;
    private Angajat angajatByIdDirector;
    private Angajat angajatByIdReprezentant;
    private Beneficiar beneficiarByIdBeneficiar;

    @Id
    @Column(name = "idcontract_terti")
    public int getIdcontractTerti() {
        return idcontractTerti;
    }

    public void setIdcontractTerti(int idcontractTerti) {
        this.idcontractTerti = idcontractTerti;
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
    @Column(name = "Tip")
    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    @Basic
    @Column(name = "Contract_Terticol")
    public Date getContractTerticol() {
        return contractTerticol;
    }

    public void setContractTerticol(Date contractTerticol) {
        this.contractTerticol = contractTerticol;
    }

    @Basic
    @Column(name = "Titlu_Proiect")
    public String getTitluProiect() {
        return titluProiect;
    }

    public void setTitluProiect(String titluProiect) {
        this.titluProiect = titluProiect;
    }

    @Basic
    @Column(name = "Reprezentant_Beneficiar")
    public String getReprezentantBeneficiar() {
        return reprezentantBeneficiar;
    }

    public void setReprezentantBeneficiar(String reprezentantBeneficiar) {
        this.reprezentantBeneficiar = reprezentantBeneficiar;
    }

    @Basic
    @Column(name = "Functie")
    public String getFunctie() {
        return functie;
    }

    public void setFunctie(String functie) {
        this.functie = functie;
    }

    @Basic
    @Column(name = "Valoare")
    public Double getValoare() {
        return valoare;
    }

    public void setValoare(Double valoare) {
        this.valoare = valoare;
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
    @Column(name = "Data_incheierii")
    public Date getDataIncheierii() {
        return dataIncheierii;
    }

    public void setDataIncheierii(Date dataIncheierii) {
        this.dataIncheierii = dataIncheierii;
    }

    @Basic
    @Column(name = "Nr_pagini")
    public Integer getNrPagini() {
        return nrPagini;
    }

    public void setNrPagini(Integer nrPagini) {
        this.nrPagini = nrPagini;
    }

    @Basic
    @Column(name = "Nr_exemplare")
    public Integer getNrExemplare() {
        return nrExemplare;
    }

    public void setNrExemplare(Integer nrExemplare) {
        this.nrExemplare = nrExemplare;
    }

    @Basic
    @Column(name = "Nr_exemplare_beneficiar")
    public Integer getNrExemplareBeneficiar() {
        return nrExemplareBeneficiar;
    }

    public void setNrExemplareBeneficiar(Integer nrExemplareBeneficiar) {
        this.nrExemplareBeneficiar = nrExemplareBeneficiar;
    }

    @Basic
    @Column(name = "Data_inceput")
    public Date getDataInceput() {
        return dataInceput;
    }

    public void setDataInceput(Date dataInceput) {
        this.dataInceput = dataInceput;
    }

    @Basic
    @Column(name = "Data_sfarsit")
    public Date getDataSfarsit() {
        return dataSfarsit;
    }

    public void setDataSfarsit(Date dataSfarsit) {
        this.dataSfarsit = dataSfarsit;
    }

    @Basic
    @Column(name = "Coordonator_partener")
    public String getCoordonatorPartener() {
        return coordonatorPartener;
    }

    public void setCoordonatorPartener(String coordonatorPartener) {
        this.coordonatorPartener = coordonatorPartener;
    }

    @Basic
    @Column(name = "Regie")
    public Double getRegie() {
        return regie;
    }

    public void setRegie(Double regie) {
        this.regie = regie;
    }

    @Basic
    @Column(name = "TVA")
    public Double getTva() {
        return tva;
    }

    public void setTva(Double tva) {
        this.tva = tva;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContractTerti that = (ContractTerti) o;
        return idcontractTerti == that.idcontractTerti &&
                Objects.equals(numar, that.numar) &&
                Objects.equals(data, that.data) &&
                Objects.equals(tip, that.tip) &&
                Objects.equals(contractTerticol, that.contractTerticol) &&
                Objects.equals(titluProiect, that.titluProiect) &&
                Objects.equals(reprezentantBeneficiar, that.reprezentantBeneficiar) &&
                Objects.equals(functie, that.functie) &&
                Objects.equals(valoare, that.valoare) &&
                Objects.equals(moneda, that.moneda) &&
                Objects.equals(dataIncheierii, that.dataIncheierii) &&
                Objects.equals(nrPagini, that.nrPagini) &&
                Objects.equals(nrExemplare, that.nrExemplare) &&
                Objects.equals(nrExemplareBeneficiar, that.nrExemplareBeneficiar) &&
                Objects.equals(dataInceput, that.dataInceput) &&
                Objects.equals(dataSfarsit, that.dataSfarsit) &&
                Objects.equals(coordonatorPartener, that.coordonatorPartener) &&
                Objects.equals(regie, that.regie) &&
                Objects.equals(tva, that.tva);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idcontractTerti, numar, data, tip, contractTerticol, titluProiect, reprezentantBeneficiar, functie, valoare, moneda, dataIncheierii, nrPagini, nrExemplare, nrExemplareBeneficiar, dataInceput, dataSfarsit, coordonatorPartener, regie, tva);
    }

    @ManyToOne
    @JoinColumn(name = "idDirector", referencedColumnName = "idAngajat")
    public Angajat getAngajatByIdDirector() {
        return angajatByIdDirector;
    }

    public void setAngajatByIdDirector(Angajat angajatByIdDirector) {
        this.angajatByIdDirector = angajatByIdDirector;
    }

    @ManyToOne
    @JoinColumn(name = "idReprezentant", referencedColumnName = "idAngajat")
    public Angajat getAngajatByIdReprezentant() {
        return angajatByIdReprezentant;
    }

    public void setAngajatByIdReprezentant(Angajat angajatByIdReprezentant) {
        this.angajatByIdReprezentant = angajatByIdReprezentant;
    }

    @ManyToOne
    @JoinColumn(name = "idBeneficiar", referencedColumnName = "idBeneficiar")
    public Beneficiar getBeneficiarByIdBeneficiar() {
        return beneficiarByIdBeneficiar;
    }

    public void setBeneficiarByIdBeneficiar(Beneficiar beneficiarByIdBeneficiar) {
        this.beneficiarByIdBeneficiar = beneficiarByIdBeneficiar;
    }
}
