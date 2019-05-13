package com.afnemo.dto;

import com.afnemo.dto.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-12T19:56:23")
@StaticMetamodel(TipoUsuario.class)
public class TipoUsuario_ { 

    public static volatile SingularAttribute<TipoUsuario, Integer> pKTUId;
    public static volatile SingularAttribute<TipoUsuario, String> tUDetalle;
    public static volatile SingularAttribute<TipoUsuario, String> tUCodigo;
    public static volatile CollectionAttribute<TipoUsuario, Usuario> usuarioCollection;

}