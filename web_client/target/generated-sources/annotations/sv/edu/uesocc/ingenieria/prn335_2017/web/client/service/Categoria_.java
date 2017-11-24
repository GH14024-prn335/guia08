package sv.edu.uesocc.ingenieria.prn335_2017.web.client.service;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sv.edu.uesocc.ingenieria.prn335_2017.web.client.service.Post;
import sv.edu.uesocc.ingenieria.prn335_2017.web.client.service.RolCategoria;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-11-23T22:50:43")
@StaticMetamodel(Categoria.class)
public class Categoria_ { 

    public static volatile SingularAttribute<Categoria, String> descripcion;
    public static volatile ListAttribute<Categoria, RolCategoria> rolCategoriaList;
    public static volatile ListAttribute<Categoria, Post> postList;
    public static volatile SingularAttribute<Categoria, Integer> idCategoria;
    public static volatile SingularAttribute<Categoria, String> nombre;
    public static volatile SingularAttribute<Categoria, Boolean> activo;

}