package sv.edu.uesocc.ingenieria.prn335_2017.web.client.service;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sv.edu.uesocc.ingenieria.prn335_2017.web.client.service.Categoria;
import sv.edu.uesocc.ingenieria.prn335_2017.web.client.service.Paso;
import sv.edu.uesocc.ingenieria.prn335_2017.web.client.service.Rol;
import sv.edu.uesocc.ingenieria.prn335_2017.web.client.service.RolCategoriaPK;
import sv.edu.uesocc.ingenieria.prn335_2017.web.client.service.UsuarioRolCategoria;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-11-23T22:50:43")
@StaticMetamodel(RolCategoria.class)
public class RolCategoria_ { 

    public static volatile ListAttribute<RolCategoria, UsuarioRolCategoria> usuarioRolCategoriaList;
    public static volatile ListAttribute<RolCategoria, Paso> pasoList;
    public static volatile SingularAttribute<RolCategoria, Categoria> categoria;
    public static volatile SingularAttribute<RolCategoria, Rol> rol;
    public static volatile SingularAttribute<RolCategoria, RolCategoriaPK> rolCategoriaPK;
    public static volatile SingularAttribute<RolCategoria, Boolean> activo;

}