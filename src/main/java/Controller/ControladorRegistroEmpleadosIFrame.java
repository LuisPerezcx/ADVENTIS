package Controller;

import Util.Regex;
import Views.Notificaciones;
import Views.RegistroEmpleadosIFrame;

import javax.swing.border.BevelBorder;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ControladorRegistroEmpleadosIFrame implements MouseListener {
    private final RegistroEmpleadosIFrame registroEmpleadosIFrame;

    public ControladorRegistroEmpleadosIFrame(RegistroEmpleadosIFrame registroEmpleadosIFrame) {
        this.registroEmpleadosIFrame = registroEmpleadosIFrame;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Object event = e.getSource();
        if(event == registroEmpleadosIFrame.guardar){
            registrarEmpleado();
            validarNombreEmpleado();
            validarApellidoPaterno();
            validarApellidoMaterno();
        }
    }

    private void validarNombreEmpleado(){
        if(Regex.validarLetramayusculaLetraminuscula(registroEmpleadosIFrame.nombreEmpleado.getText())){
            System.out.println("nombreValido");
        }else {
            Notificaciones.mensajeError(registroEmpleadosIFrame,"Nombre invalido","Nombre");
        }
        // if false
        //Notificaciones.mensajeError(login,"Usuario o contraseña incorrectos","Credenciales invalidas");
    }

    private void validarApellidoPaterno(){
        if(Regex.validarLetramayusculaLetraminuscula(registroEmpleadosIFrame.txtUsuario1.getText())){
            System.out.println("ApellidoPaternoValido");
        }else {
            Notificaciones.mensajeError(registroEmpleadosIFrame,"Apellido Paterno invalido","Apellido Paterno");
        }
        // if false
        //Notificaciones.mensajeError(login,"Usuario o contraseña incorrectos","Credenciales invalidas");
    }

    private void validarApellidoMaterno(){
        if(Regex.validarLetramayusculaLetraminuscula(registroEmpleadosIFrame.txtUsuario2.getText())){
            System.out.println("apellidoMaternoValido");
        }else {
            Notificaciones.mensajeError(registroEmpleadosIFrame,"Apellido invalido","Apellido Materno");
        }
        // if false
        //Notificaciones.mensajeError(login,"Usuario o contraseña incorrectos","Credenciales invalidas");
    }
    private void registrarEmpleado(){
        Notificaciones.mensajeOK(registroEmpleadosIFrame,"Registro exitoso","Empleado registrado");
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
        if (event == registroEmpleadosIFrame.guardar){
            registroEmpleadosIFrame.guardar.setBorder(new BevelBorder(BevelBorder.RAISED));
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        Object event = e.getSource();
        if (event == registroEmpleadosIFrame.guardar){
            registroEmpleadosIFrame.guardar.setBorder(null);
        }
    }
}
