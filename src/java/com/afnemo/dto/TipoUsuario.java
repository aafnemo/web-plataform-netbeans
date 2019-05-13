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
@Table(name = "tbl_tipousuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoUsuario.findAll", query = "SELECT t FROM TipoUsuario t")
    , @NamedQuery(name = "TipoUsuario.findByPKTUId", query = "SELECT t FROM TipoUsuario t WHERE t.pKTUId = :pKTUId")
    , @NamedQuery(name = "TipoUsuario.findByTUCodigo", query = "SELECT t FROM TipoUsuario t WHERE t.tUCodigo = :tUCodigo")
    , @NamedQuery(name = "TipoUsuario.findByTUDetalle", query = "SELECT t FROM TipoUsuario t WHERE t.tUDetalle = :tUDetalle")})
public class TipoUsuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "PK_TU_Id")
    private Integer pKTUId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "TU_Codigo")
    private String tUCodigo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "TU_Detalle")
    private String tUDetalle;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fKTUId")
    private Collection<Usuario> usuarioCollection;

    public TipoUsuario() {
    }

    public TipoUsuario(Integer pKTUId) {
        this.pKTUId = pKTUId;
    }

    public TipoUsuario(Integer pKTUId, String tUCodigo, String tUDetalle) {
        this.pKTUId = pKTUId;
        this.tUCodigo = tUCodigo;
        this.tUDetalle = tUDetalle;
    }

    public Integer getPKTUId() {
        return pKTUId;
    }

    public void setPKTUId(Integer pKTUId) {
        this.pKTUId = pKTUId;
    }

    public String getTUCodigo() {
        return tUCodigo;
    }

    public void setTUCodigo(String tUCodigo) {
        this.tUCodigo = tUCodigo;
    }

    public String getTUDetalle() {
        return tUDetalle;
    }

    public void setTUDetalle(String tUDetalle) {
        this.tUDetalle = tUDetalle;
    }

    @XmlTransient
    public Collection<Usuario> getUsuarioCollection() {
        return usuarioCollection;
    }

    public void setUsuarioCollection(Collection<Usuario> usuarioCollection) {
        this.usuarioCollection = usuarioCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pKTUId != null ? pKTUId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoUsuario)) {
            return false;
        }
        TipoUsuario other = (TipoUsuario) object;
        if ((this.pKTUId == null && other.pKTUId != null) || (this.pKTUId != null && !this.pKTUId.equals(other.pKTUId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.afnemo.dto.TipoUsuario[ pKTUId=" + pKTUId + " ]";
    }
    
}
