package com.example.proiectcercertare.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "act_aditional", schema = "cercetare")
public class ActAditional {
    private int idActAditional;
    private Integer numar;
    private Date data;
    private Date dataInceput;
    private Date dataSfarsit;

    @Id
    @Column(name = "idAct_Aditional")
    public int getIdActAditional() {
        return idActAditional;
    }

    public void setIdActAditional(int idActAditional) {
        this.idActAditional = idActAditional;
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
        ActAditional that = (ActAditional) o;
        return idActAditional == that.idActAditional &&
                Objects.equals(numar, that.numar) &&
                Objects.equals(data, that.data) &&
                Objects.equals(dataInceput, that.dataInceput) &&
                Objects.equals(dataSfarsit, that.dataSfarsit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idActAditional, numar, data, dataInceput, dataSfarsit);
    }
}
