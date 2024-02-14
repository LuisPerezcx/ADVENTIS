package Controller;

import Arreglos.Arreglos;
import DAO.UbicacionesDAO;
import Util.Regex;
import Views.Notificaciones;
import DAO.CamarasDAO;
import Views.RegistroCamarasDigitalesIFrame;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.Array;

public class ControladorRegistroCamarasDigitalesIFrame implements MouseListener {

    private final RegistroCamarasDigitalesIFrame registroCamarasDigitalesIFrame;
    CamarasDAO camarasDAO = new CamarasDAO();
    UbicacionesDAO ubicacionesDAO = new UbicacionesDAO();

    public ControladorRegistroCamarasDigitalesIFrame(RegistroCamarasDigitalesIFrame registroCamarasDigitalesIFrame1){
        this.registroCamarasDigitalesIFrame = registroCamarasDigitalesIFrame1;
        llenarCombo();
    }
    private void llenarCombo(){
        registroCamarasDigitalesIFrame.comboUbicacion.removeAllItems();
        ubicacionesDAO.obtenerUbicaciones();
        for (String item : Arreglos.ubicacionArray){
            registroCamarasDigitalesIFrame.comboUbicacion.addItem(item);
        }
    }
    private void AgregarCamara(){

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Object event = e.getSource();
        if(event == registroCamarasDigitalesIFrame.guardar){
            validarNombre();
            validarNumeroSerie();
            validarResponsable();
            validarNombre();
        }
    }

    private void validarNombre(){
        if(Regex.validarCadenaDeSoloLetras(registroCamarasDigitalesIFrame.txtMarca.getText())){
            System.out.println("Marca modelo correctos");
        }else {
            Notificaciones.mensajeError(registroCamarasDigitalesIFrame,"marca o modelo  invalidos","Marca/Modelo");
        }
        // if false
        //Notificaciones.mensajeError(login,"Usuario o contraseña incorrectos","Credenciales invalidas");
    }

    private void validarNumeroSerie(){
        if(Regex.validarSoloNumeros(registroCamarasDigitalesIFrame.txtNumeroSeire.getText())){
            System.out.println("Numero de serie correctos");
        }else {
            Notificaciones.mensajeError(registroCamarasDigitalesIFrame,"numero de serie invalido","Numero de Serie");
        }
        // if false
        //Notificaciones.mensajeError(login,"Usuario o contraseña incorrectos","Credenciales invalidas");
    }

    private void validarComentarios(){
        if(Regex.validarCadenaDeSoloLetras(registroCamarasDigitalesIFrame.txtAreaComentarios.getText())){
            System.out.println("Comentarios correctos");
        }else {
            Notificaciones.mensajeError(registroCamarasDigitalesIFrame,"comentarios invalidos","Comentarios");
        }
        // if false
        //Notificaciones.mensajeError(login,"Usuario o contraseña incorrectos","Credenciales invalidas");
    }

    private void validarResponsable(){
        if(Regex.validarCadenaDeSoloLetras(registroCamarasDigitalesIFrame.txtResponsable.getText())){
            System.out.println("Responsable correctos");
        }else {
            Notificaciones.mensajeError(registroCamarasDigitalesIFrame,"Responsable invalido","Responsable");
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

        if (event == registroCamarasDigitalesIFrame.guardar){
            registroCamarasDigitalesIFrame.guardar.setBorder(new BevelBorder(BevelBorder.RAISED));
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        Object event = e.getSource();

        if (event == registroCamarasDigitalesIFrame.guardar){
            registroCamarasDigitalesIFrame.guardar.setBorder(null);
        }
    }
}
