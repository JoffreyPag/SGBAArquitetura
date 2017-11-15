/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FabricaUsuario;

//import sgbaarquitetura.Bolsista;
//import sgbaarquitetura.Gerente;
import sgbaarquitetura.Usuario;

/**
 *
 * @author joffr
 */
public class FabricaUsuario {

    public static Usuario CriarUsuario(String tipo) {

        if (tipo.equalsIgnoreCase("Bolsista")) {
          //  return new Bolsista();
        } else if (tipo.equalsIgnoreCase("Gerente")) {
           // return new Gerente();
        }
        return null;
    }

}
