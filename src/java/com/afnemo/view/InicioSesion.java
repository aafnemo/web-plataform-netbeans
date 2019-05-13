/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.afnemo.view;

import com.afnemo.session.UsuarioFacade;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author arnoldherrera
 */
@Named("inicioSesion")
@SessionScoped
public class InicioSesion implements Serializable {

    @EJB
    private UsuarioFacade ejbUsuarioFacade;
    private String password;
    private String usuario;

    public UsuarioFacade getEjbUsuarioFacade() {
        return ejbUsuarioFacade;
    }

    public void setEjbUsuarioFacade(UsuarioFacade ejbUsuarioFacade) {
        this.ejbUsuarioFacade = ejbUsuarioFacade;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String login() {
        boolean validar = ejbUsuarioFacade.validarUsuario(usuario, password);
        if (validar == true) {
            return "welcomePrimefaces.xhtml";
        } else {
            return "login.xhtml";
        }
    }
}
