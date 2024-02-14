package Controller;

import Util.Regex;
import Views.Notificaciones;
import Views.RegistroComponentesIFrame;

import javax.swing.border.BevelBorder;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ControladorRegistroComponentesIFrame implements MouseListener {

    private final RegistroComponentesIFrame registroComponentesIFrame;

    public ControladorRegistroComponentesIFrame(RegistroComponentesIFrame registroComponentesIFrame){
        this.registroComponentesIFrame = registroComponentesIFrame;
    }


    @Override
    public void mouseClicked(MouseEvent e) {
//        Object event = e.getSource();
//        if(event == registroComponentesIFrame.btnBuscar){
//            validaNombre();
//            validaFabricante();
//            validaDescripcion();
//            validaBusqueda();
//        }
    }

    private void validaNombre(){
        if(Regex.validarNombreComponente(registroComponentesIFrame.txtNombreComponentes.getText())){
            System.out.println("nombreValido");
        }else {
            Notificaciones.mensajeError(registroComponentesIFrame,"Nombre invalido","Error en la verificacion del nombre");
        }
        // if false
        //Notificaciones.mensajeError(login,"Usuario o contraseña incorrectos","Credenciales invalidas");
    }

    private void validaFabricante(){
        if(Regex.validarNombreComponente(registroComponentesIFrame.txtFabricanteComponente.getText())){
            System.out.println("nombreValido");
        }else {
            Notificaciones.mensajeError(registroComponentesIFrame,"Nombre de fabricante no cumple con las validaciones","Error en la verificacion del fabricante");
        }
        // if false
        //Notificaciones.mensajeError(login,"Usuario o contraseña incorrectos","Credenciales invalidas");
    }

    private void validaDescripcion(){
        if(Regex.validarCadenaDeSoloLetras(registroComponentesIFrame.txtDescripcionComponentes.getText())){
            System.out.println("nombreValido");
        }else {
            Notificaciones.mensajeError(registroComponentesIFrame,"Descripcion con caracteres invalidos","Error en la verificacion de la descripcion");
        }
        // if false
        //Notificaciones.mensajeError(login,"Usuario o contraseña incorrectos","Credenciales invalidas");
    }

    private void validaBusqueda(){
        if(Regex.validarNombreComponente(registroComponentesIFrame.txtBuscarComponente.getText())){
            System.out.println("nombreValido");
        }else {
            Notificaciones.mensajeError(registroComponentesIFrame,"Ocurrio un error al tratar de buscar, verifique sus datos","Error en la verificacion de busquda");
        }
        // if false
        //Notificaciones.mensajeError(login,"Usuario o contraseña incorrectos","Credenciales invalidas");
    }


    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        Object event = e.getSource();

        if (event == registroComponentesIFrame.btnGuardar){
            registroComponentesIFrame.btnGuardar.setBorder(new BevelBorder(BevelBorder.RAISED));
        } else if (event == registroComponentesIFrame.btnBuscar){
            registroComponentesIFrame.btnBuscar.setBorder(new BevelBorder(BevelBorder.RAISED));
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        Object event = e.getSource();

        if (event == registroComponentesIFrame.btnGuardar){
            registroComponentesIFrame.btnGuardar.setBorder(null);
        }else if (event == registroComponentesIFrame.btnBuscar){
            registroComponentesIFrame.btnBuscar.setBorder(null);
        }
    }
}
