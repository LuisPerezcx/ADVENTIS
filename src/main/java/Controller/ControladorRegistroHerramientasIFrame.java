package Controller;

import Util.Regex;
import Views.Notificaciones;
import Views.RegistroHerramientasIFrame;

import javax.swing.border.BevelBorder;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ControladorRegistroHerramientasIFrame implements MouseListener {

    private final RegistroHerramientasIFrame registroHerramientasIFrame;

    public ControladorRegistroHerramientasIFrame(RegistroHerramientasIFrame registroHerramientasIFrame) {
        this.registroHerramientasIFrame = registroHerramientasIFrame;
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        Object event = e.getSource();
        if (event == registroHerramientasIFrame.btnGuardar){
            registrarHerramientas();
        }
    }

    private void registrarHerramientas(){
        Notificaciones.mensajeOK(registroHerramientasIFrame,"Registro exitoso","Herramienta registrada");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        Object event = e.getSource();
        if (event == registroHerramientasIFrame.btnGuardar){
            validarHerramientas();
            validarNumeroSerie();
            validarComentarios();
            validarCapacidad();
            validarCantidad();
        }
    }

    private void validarHerramientas(){
        /*if(Regex.validarSoloLetras(registroHerramientasIFrame.txtNombre.getText())){
            System.out.println("Nombre Herramienta Valido");
        }else {
            Notificaciones.mensajeError(registroHerramientasIFrame,"Nombre de la herramienta invalida","Error al validar Herramienta");
        }
        // if false
        //Notificaciones.mensajeError(login,"Usuario o contraseña incorrectos","Credenciales invalidas");
    */
    }

    private void validarNumeroSerie(){
        if(Regex.validarSoloNumeros(registroHerramientasIFrame.txtNumSerie.getText())){
            System.out.println("Num de serie valido");
        }else {
            Notificaciones.mensajeError(registroHerramientasIFrame,"El numero de serie contiene datos invalidos","Error al validar Numero de serie");
        }
        // if false
        //Notificaciones.mensajeError(login,"Usuario o contraseña incorrectos","Credenciales invalidas");
    }

    private void validarComentarios(){
        if(Regex.validarCadenaDeSoloLetras(registroHerramientasIFrame.txtAreaComentarios.getText())){
            System.out.println("Comentarios correctos");
        }else {
            Notificaciones.mensajeError(registroHerramientasIFrame,"Los comentarios contienen datos invalidos","Error al validar Comentarios");
        }
        // if false
        //Notificaciones.mensajeError(login,"Usuario o contraseña incorrectos","Credenciales invalidas");
    }

    private void validarCapacidad(){
        if(Regex.validarSoloNumeros(registroHerramientasIFrame.txtCapacidad.getText())){
            System.out.println("Capacidad correcta");
        }else {
            Notificaciones.mensajeError(registroHerramientasIFrame,"Los comentarios contienen datos invalidos","Error al validar Comentarios");
        }
        // if false
        //Notificaciones.mensajeError(login,"Usuario o contraseña incorrectos","Credenciales invalidas");
    }


    private void validarCantidad(){
        if(Regex.validarSoloNumeros(registroHerramientasIFrame.txtCantidad.getText())){
            System.out.println("Cantidad correcta");
        }else {
            Notificaciones.mensajeError(registroHerramientasIFrame,"Los comentarios contienen datos invalidos","Error al validar Comentarios");
        }
        // if false
        //Notificaciones.mensajeError(login,"Usuario o contraseña incorrectos","Credenciales invalidas");
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        Object event = e.getSource();
        if (event == registroHerramientasIFrame.btnGuardar){
            registroHerramientasIFrame.btnGuardar.setBorder(new BevelBorder(BevelBorder.RAISED));
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        Object event = e.getSource();

        if (event == registroHerramientasIFrame.btnGuardar){
            registroHerramientasIFrame.btnGuardar.setBorder(null);
        }
    }
}