package com.afnemo.dto;

import com.afnemo.dto.Usuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-25T01:02:59")
@StaticMetamodel(Actividad.class)
public class Actividad_ { 

    public static volatile SingularAttribute<Actividad, String> aCTDetalle;
    public static volatile SingularAttribute<Actividad, String> aCTLocalizacion;
    public static volatile SingularAttribute<Actividad, Boolean> aCTEstado;
    public static volatile SingularAttribute<Actividad, Date> aCTFechaFinal;
    public static volatile SingularAttribute<Actividad, String> aCTNombre;
    public static volatile SingularAttribute<Actividad, Integer> aCTid;
    public static volatile SingularAttribute<Actividad, Usuario> pKUSRId;
    public static volatile SingularAttribute<Actividad, Date> aCTFechaInicio;

}