/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.afnemo.dto;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author arnoldherrera
 */
@Entity
@Table(name = "tbl_actividad")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Actividad.findAll", query = "SELECT a FROM Actividad a")
    , @NamedQuery(name = "Actividad.findByACTid", query = "SELECT a FROM Actividad a WHERE a.aCTid = :aCTid")
    , @NamedQuery(name = "Actividad.findByACTDetalle", query = "SELECT a FROM Actividad a WHERE a.aCTDetalle = :aCTDetalle")
    , @NamedQuery(name = "Actividad.findByACTEstado", query = "SELECT a FROM Actividad a WHERE a.aCTEstado = :aCTEstado")
    , @NamedQuery(name = "Actividad.findByACTFechaFinal", query = "SELECT a FROM Actividad a WHERE a.aCTFechaFinal = :aCTFechaFinal")
    , @NamedQuery(name = "Actividad.findByACTFechaInicio", query = "SELECT a FROM Actividad a WHERE a.aCTFechaInicio = :aCTFechaInicio")
    , @NamedQuery(name = "Actividad.findByACTLocalizacion", query = "SELECT a FROM Actividad a WHERE a.aCTLocalizacion = :aCTLocalizacion")
    , @NamedQuery(name = "Actividad.findByACTNombre", query = "SELECT a FROM Actividad a WHERE a.aCTNombre = :aCTNombre")})
public class Actividad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ACT_id")
    private Integer aCTid;
    @Size(max = 200)
    @Column(name = "ACT_Detalle")
    private String aCTDetalle;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ACT_Estado")
    private boolean aCTEstado;
    @Column(name = "ACT_FechaFinal")
    @Temporal(TemporalType.DATE)
    private Date aCTFechaFinal;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ACT_FechaInicio")
    @Temporal(TemporalType.DATE)
    private Date aCTFechaInicio;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "ACT_Localizacion")
    private String aCTLocalizacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "ACT_Nombre")
    private String aCTNombre;
    @JoinColumn(name = "PK_USR_Id", referencedColumnName = "PK_USR_Id")
    @ManyToOne(optional = false)
    private Usuario pKUSRId;

    public Actividad() {
    }

    public Actividad(Integer aCTid) {
        this.aCTid = aCTid;
    }

    public Actividad(Integer aCTid, boolean aCTEstado, Date aCTFechaInicio, String aCTLocalizacion, String aCTNombre) {
        this.aCTid = aCTid;
        this.aCTEstado = aCTEstado;
        this.aCTFechaInicio = aCTFechaInicio;
        this.aCTLocalizacion = aCTLocalizacion;
        this.aCTNombre = aCTNombre;
    }

    public Integer getACTid() {
        return aCTid;
    }

    public void setACTid(Integer aCTid) {
        this.aCTid = aCTid;
    }

    public String getACTDetalle() {
        return aCTDetalle;
    }

    public void setACTDetalle(String aCTDetalle) {
        this.aCTDetalle = aCTDetalle;
    }

    public boolean getACTEstado() {
        return aCTEstado;
    }

    public void setACTEstado(boolean aCTEstado) {
        this.aCTEstado = aCTEstado;
    }

    public Date getACTFechaFinal() {
        return aCTFechaFinal;
    }

    public void setACTFechaFinal(Date aCTFechaFinal) {
        this.aCTFechaFinal = aCTFechaFinal;
    }

    public Date getACTFechaInicio() {
        return aCTFechaInicio;
    }

    public void setACTFechaInicio(Date aCTFechaInicio) {
        this.aCTFechaInicio = aCTFechaInicio;
    }

    public String getACTLocalizacion() {
        return aCTLocalizacion;
    }

    public void setACTLocalizacion(String aCTLocalizacion) {
        this.aCTLocalizacion = aCTLocalizacion;
    }

    public String getACTNombre() {
        return aCTNombre;
    }

    public void setACTNombre(String aCTNombre) {
        this.aCTNombre = aCTNombre;
    }

    public Usuario getPKUSRId() {
        return pKUSRId;
    }

    public void setPKUSRId(Usuario pKUSRId) {
        this.pKUSRId = pKUSRId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (aCTid != null ? aCTid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Actividad)) {
            return false;
        }
        Actividad other = (Actividad) object;
        if ((this.aCTid == null && other.aCTid != null) || (this.aCTid != null && !this.aCTid.equals(other.aCTid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.afnemo.dto.Actividad[ aCTid=" + aCTid + " ]";
    }
    
}
