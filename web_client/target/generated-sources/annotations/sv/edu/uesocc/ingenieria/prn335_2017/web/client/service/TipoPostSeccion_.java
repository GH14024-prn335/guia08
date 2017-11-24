package sv.edu.uesocc.ingenieria.prn335_2017.web.client.service;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sv.edu.uesocc.ingenieria.prn335_2017.web.client.service.Seccion;
import sv.edu.uesocc.ingenieria.prn335_2017.web.client.service.TipoPost;
import sv.edu.uesocc.ingenieria.prn335_2017.web.client.service.TipoPostSeccionPK;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-11-23T22:50:43")
@StaticMetamodel(TipoPostSeccion.class)
public class TipoPostSeccion_ { 

    public static volatile SingularAttribute<TipoPostSeccion, TipoPostSeccionPK> tipoPostSeccionPK;
    public static volatile SingularAttribute<TipoPostSeccion, Seccion> seccion;
    public static volatile SingularAttribute<TipoPostSeccion, TipoPost> tipoPost;
    public static volatile SingularAttribute<TipoPostSeccion, Integer> peso;
    public static volatile SingularAttribute<TipoPostSeccion, Boolean> obligatorio;
    public static volatile SingularAttribute<TipoPostSeccion, Boolean> activo;

}