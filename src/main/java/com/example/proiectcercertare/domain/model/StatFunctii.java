package com.example.proiectcercertare.domain.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "stat_functii", schema = "cercetare")
@IdClass(StatFunctiiPK.class)
public class StatFunctii {
    private int idContractTerti;
    private int idAngajat;
    private String functie;
    private Date dataInceput;
    private Date dataSfarsit;
    private ContractTerti contractTertiByIdContractTerti;
    private Angajat angajatByIdAngajat;

    @Id
    @Column(name = "idContract_Terti")
    public int getIdContractTerti() {
        return idContractTerti;
    }

    public void setIdContractTerti(int idContractTerti) {
        this.idContractTerti = idContractTerti;
    }

    @Id
    @Column(name = "idAngajat")
    public int getIdAngajat() {
        return idAngajat;
    }

    public void setIdAngajat(int idAngajat) {
        this.idAngajat = idAngajat;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StatFunctii that = (StatFunctii) o;
        return idContractTerti == that.idContractTerti &&
                idAngajat == that.idAngajat &&
                Objects.equals(functie, that.functie) &&
                Objects.equals(dataInceput, that.dataInceput) &&
                Objects.equals(dataSfarsit, that.dataSfarsit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idContractTerti, idAngajat, functie, dataInceput, dataSfarsit);
    }

    @ManyToOne
    @JoinColumn(name = "idContract_Terti", referencedColumnName = "idcontract_terti", nullable = false)
    public ContractTerti getContractTertiByIdContractTerti() {
        return contractTertiByIdContractTerti;
    }

    public void setContractTertiByIdContractTerti(ContractTerti contractTertiByIdContractTerti) {
        this.contractTertiByIdContractTerti = contractTertiByIdContractTerti;
    }

    @ManyToOne
    @JoinColumn(name = "idAngajat", referencedColumnName = "idAngajat", nullable = false)
    public Angajat getAngajatByIdAngajat() {
        return angajatByIdAngajat;
    }

    public void setAngajatByIdAngajat(Angajat angajatByIdAngajat) {
        this.angajatByIdAngajat = angajatByIdAngajat;
    }
}
