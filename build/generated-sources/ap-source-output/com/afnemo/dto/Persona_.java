package com.afnemo.dto;

import com.afnemo.dto.Usuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-25T01:02:59")
@StaticMetamodel(Persona.class)
public class Persona_ { 

    public static volatile SingularAttribute<Persona, String> pRSTelefono;
    public static volatile SingularAttribute<Persona, String> pRSApellido2;
    public static volatile SingularAttribute<Persona, String> pRSApellido1;
    public static volatile SingularAttribute<Persona, String> pRSNombres;
    public static volatile SingularAttribute<Persona, Boolean> pRSEstado;
    public static volatile SingularAttribute<Persona, Date> pRSFechaNacimiento;
    public static volatile SingularAttribute<Persona, Date> pRSFechaRegistro;
    public static volatile SingularAttribute<Persona, String> pRSSexo;
    public static volatile SingularAttribute<Persona, String> pRSCorreo;
    public static volatile SingularAttribute<Persona, String> pRSid;
    public static volatile SingularAttribute<Persona, String> pRSEntidad;
    public static volatile SingularAttribute<Persona, Usuario> pKUSRId;

}