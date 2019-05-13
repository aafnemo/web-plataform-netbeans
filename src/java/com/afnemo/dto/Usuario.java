/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.afnemo.dto;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author arnoldherrera
 */
@Entity
@Table(name = "tbl_usuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u")
    , @NamedQuery(name = "Usuario.findByPKUSRId", query = "SELECT u FROM Usuario u WHERE u.pKUSRId = :pKUSRId")
    , @NamedQuery(name = "Usuario.findByUSREstado", query = "SELECT u FROM Usuario u WHERE u.uSREstado = :uSREstado")})
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "PK_USR_Id")
    private String pKUSRId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "USR_Estado")
    private boolean uSREstado;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 2147483647)
    @Column(name = "USR_Password")
    private String uSRPassword;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pKUSRId")
    private Collection<Actividad> actividadCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pKUSRId")
    private Collection<Persona> personaCollection;
    @JoinColumn(name = "FK_TU_Id", referencedColumnName = "PK_TU_Id")
    @ManyToOne(optional = false)
    private TipoUsuario fKTUId;

    public Usuario() {
    }

    public Usuario(String pKUSRId) {
        this.pKUSRId = pKUSRId;
    }

    public Usuario(String pKUSRId, boolean uSREstado, String uSRPassword) {
        this.pKUSRId = pKUSRId;
        this.uSREstado = uSREstado;
        this.uSRPassword = uSRPassword;
    }

    public String getPKUSRId() {
        return pKUSRId;
    }

    public void setPKUSRId(String pKUSRId) {
        this.pKUSRId = pKUSRId;
    }

    public boolean getUSREstado() {
        return uSREstado;
    }

    public void setUSREstado(boolean uSREstado) {
        this.uSREstado = uSREstado;
    }

    public String getUSRPassword() {
        return uSRPassword;
    }

    public void setUSRPassword(String uSRPassword) {
        this.uSRPassword = uSRPassword;
    }

    @XmlTransient
    public Collection<Actividad> getActividadCollection() {
        return actividadCollection;
    }

    public void setActividadCollection(Collection<Actividad> actividadCollection) {
        this.actividadCollection = actividadCollection;
    }

    @XmlTransient
    public Collection<Persona> getPersonaCollection() {
        return personaCollection;
    }

    public void setPersonaCollection(Collection<Persona> personaCollection) {
        this.personaCollection = personaCollection;
    }

    public TipoUsuario getFKTUId() {
        return fKTUId;
    }

    public void setFKTUId(TipoUsuario fKTUId) {
        this.fKTUId = fKTUId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pKUSRId != null ? pKUSRId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.pKUSRId == null && other.pKUSRId != null) || (this.pKUSRId != null && !this.pKUSRId.equals(other.pKUSRId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.afnemo.dto.Usuario[ pKUSRId=" + pKUSRId + " ]";
    }
    
}
