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
@Table(name = "tbl_persona")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Persona.findAll", query = "SELECT p FROM Persona p")
    , @NamedQuery(name = "Persona.findByPRSid", query = "SELECT p FROM Persona p WHERE p.pRSid = :pRSid")
    , @NamedQuery(name = "Persona.findByPRSApellido1", query = "SELECT p FROM Persona p WHERE p.pRSApellido1 = :pRSApellido1")
    , @NamedQuery(name = "Persona.findByPRSApellido2", query = "SELECT p FROM Persona p WHERE p.pRSApellido2 = :pRSApellido2")
    , @NamedQuery(name = "Persona.findByPRSCorreo", query = "SELECT p FROM Persona p WHERE p.pRSCorreo = :pRSCorreo")
    , @NamedQuery(name = "Persona.findByPRSEntidad", query = "SELECT p FROM Persona p WHERE p.pRSEntidad = :pRSEntidad")
    , @NamedQuery(name = "Persona.findByPRSEstado", query = "SELECT p FROM Persona p WHERE p.pRSEstado = :pRSEstado")
    , @NamedQuery(name = "Persona.findByPRSFechaNacimiento", query = "SELECT p FROM Persona p WHERE p.pRSFechaNacimiento = :pRSFechaNacimiento")
    , @NamedQuery(name = "Persona.findByPRSFechaRegistro", query = "SELECT p FROM Persona p WHERE p.pRSFechaRegistro = :pRSFechaRegistro")
    , @NamedQuery(name = "Persona.findByPRSNombres", query = "SELECT p FROM Persona p WHERE p.pRSNombres = :pRSNombres")
    , @NamedQuery(name = "Persona.findByPRSSexo", query = "SELECT p FROM Persona p WHERE p.pRSSexo = :pRSSexo")
    , @NamedQuery(name = "Persona.findByPRSTelefono", query = "SELECT p FROM Persona p WHERE p.pRSTelefono = :pRSTelefono")})
public class Persona implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "PRS_id")
    private String pRSid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "PRS_Apellido1")
    private String pRSApellido1;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "PRS_Apellido2")
    private String pRSApellido2;
    @Size(max = 45)
    @Column(name = "PRS_Correo")
    private String pRSCorreo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "PRS_Entidad")
    private String pRSEntidad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PRS_Estado")
    private boolean pRSEstado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PRS_FechaNacimiento")
    @Temporal(TemporalType.DATE)
    private Date pRSFechaNacimiento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PRS_FechaRegistro")
    @Temporal(TemporalType.DATE)
    private Date pRSFechaRegistro;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "PRS_Nombres")
    private String pRSNombres;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "PRS_Sexo")
    private String pRSSexo;
    @Size(max = 12)
    @Column(name = "PRS_Telefono")
    private String pRSTelefono;
    @JoinColumn(name = "PK_USR_Id", referencedColumnName = "PK_USR_Id")
    @ManyToOne(optional = false)
    private Usuario pKUSRId;

    public Persona() {
    }

    public Persona(String pRSid) {
        this.pRSid = pRSid;
    }

    public Persona(String pRSid, String pRSApellido1, String pRSApellido2, String pRSEntidad, boolean pRSEstado, Date pRSFechaNacimiento, Date pRSFechaRegistro, String pRSNombres, String pRSSexo) {
        this.pRSid = pRSid;
        this.pRSApellido1 = pRSApellido1;
        this.pRSApellido2 = pRSApellido2;
        this.pRSEntidad = pRSEntidad;
        this.pRSEstado = pRSEstado;
        this.pRSFechaNacimiento = pRSFechaNacimiento;
        this.pRSFechaRegistro = pRSFechaRegistro;
        this.pRSNombres = pRSNombres;
        this.pRSSexo = pRSSexo;
    }

    public String getPRSid() {
        return pRSid;
    }

    public void setPRSid(String pRSid) {
        this.pRSid = pRSid;
    }

    public String getPRSApellido1() {
        return pRSApellido1;
    }

    public void setPRSApellido1(String pRSApellido1) {
        this.pRSApellido1 = pRSApellido1;
    }

    public String getPRSApellido2() {
        return pRSApellido2;
    }

    public void setPRSApellido2(String pRSApellido2) {
        this.pRSApellido2 = pRSApellido2;
    }

    public String getPRSCorreo() {
        return pRSCorreo;
    }

    public void setPRSCorreo(String pRSCorreo) {
        this.pRSCorreo = pRSCorreo;
    }

    public String getPRSEntidad() {
        return pRSEntidad;
    }

    public void setPRSEntidad(String pRSEntidad) {
        this.pRSEntidad = pRSEntidad;
    }

    public boolean getPRSEstado() {
        return pRSEstado;
    }

    public void setPRSEstado(boolean pRSEstado) {
        this.pRSEstado = pRSEstado;
    }

    public Date getPRSFechaNacimiento() {
        return pRSFechaNacimiento;
    }

    public void setPRSFechaNacimiento(Date pRSFechaNacimiento) {
        this.pRSFechaNacimiento = pRSFechaNacimiento;
    }

    public Date getPRSFechaRegistro() {
        return pRSFechaRegistro;
    }

    public void setPRSFechaRegistro(Date pRSFechaRegistro) {
        this.pRSFechaRegistro = pRSFechaRegistro;
    }

    public String getPRSNombres() {
        return pRSNombres;
    }

    public void setPRSNombres(String pRSNombres) {
        this.pRSNombres = pRSNombres;
    }

    public String getPRSSexo() {
        return pRSSexo;
    }

    public void setPRSSexo(String pRSSexo) {
        this.pRSSexo = pRSSexo;
    }

    public String getPRSTelefono() {
        return pRSTelefono;
    }

    public void setPRSTelefono(String pRSTelefono) {
        this.pRSTelefono = pRSTelefono;
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
        hash += (pRSid != null ? pRSid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Persona)) {
            return false;
        }
        Persona other = (Persona) object;
        if ((this.pRSid == null && other.pRSid != null) || (this.pRSid != null && !this.pRSid.equals(other.pRSid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.afnemo.dto.Persona[ pRSid=" + pRSid + " ]";
    }
    
}
