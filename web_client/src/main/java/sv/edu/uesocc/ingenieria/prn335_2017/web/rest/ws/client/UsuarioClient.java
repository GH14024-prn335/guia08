/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.prn335_2017.web.rest.ws.client;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import sv.edu.uesocc.ingenieria.prn335_2017.web.client.service.Usuario;

/**
 * Jersey REST client generated for REST resource:CaracteristicaResource
 * [Usuario]<br>
 * USAGE:
 * <pre>
 *        UsuarioClient client = new UsuarioClient();
 *        Object response = client.XXX(...);
 *        // do whatever with response
 *        client.close();
 * </pre>
 *
 * @author jonathanhdz
 */
@Named("usuario")
@ViewScoped
public class UsuarioClient implements Serializable {

    WebTarget target;
    String tar;
    List<Usuario> salida;
    Client client;

    public UsuarioClient() {
        try {
            client = (Client) ClientBuilder.newClient();
            target = client.target("http://localhost:8080/guia08/webresources/Usuario/allRegistro");
        } catch (Exception e) {

        }

    }

    public List<Usuario> findAll() {
        salida = null;
        try {
            if (tar != null) {
                if (tar.length() == 0) {
                    salida = new ArrayList<>();
                    System.out.println(tar + "vacio");
                } else {
                    List<Usuario> encontrado;
                    encontrado = target.request(MediaType.APPLICATION_JSON).get(new GenericType<List<Usuario>>() {
                    });
                    salida = new ArrayList<>();
                    for (Usuario usuario : encontrado) {

                        if (usuario.getNombres() != null && usuario.getNombres().matches("(.*)" + tar + "(.*)")) {
                            salida.add(usuario);
                        }
                    }
                }
            }

        } catch (Exception ex) {

        } finally {
            if (salida == null) {
                salida = new ArrayList();
            }
        }
        return salida;
    }

    public String getTar() {
        return tar;
    }

    public void setTar(String tar) {
        this.tar = tar;
    }

}
