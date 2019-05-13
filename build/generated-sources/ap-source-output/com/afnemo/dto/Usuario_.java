package com.afnemo.dto;

import com.afnemo.dto.Actividad;
import com.afnemo.dto.Persona;
import com.afnemo.dto.TipoUsuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-12T19:56:23")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile CollectionAttribute<Usuario, Persona> personaCollection;
    public static volatile CollectionAttribute<Usuario, Actividad> actividadCollection;
    public static volatile SingularAttribute<Usuario, TipoUsuario> fKTUId;
    public static volatile SingularAttribute<Usuario, Boolean> uSREstado;
    public static volatile SingularAttribute<Usuario, String> uSRPassword;
    public static volatile SingularAttribute<Usuario, String> pKUSRId;

}