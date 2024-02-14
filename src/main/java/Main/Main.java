/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Main;

import DAO.ConexionBD;
import Views.Login;
import Views.VentanaPrincipal;

/**
 *
 * @author david
 */
public class Main {

    public static void main(String[] args) {
       new Login();
       new VentanaPrincipal();
        ConexionBD conexionBD = new ConexionBD();
        conexionBD.conectar();
    }
}
