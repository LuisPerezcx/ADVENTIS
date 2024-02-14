package Controller;

import Util.Regex;
import Views.Notificaciones;
import Views.RegistroCamarasDigitalesIFrame;
import Views.RegistroComputadoras;

import javax.swing.border.BevelBorder;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ControladorRegistroComputadorasIFrame implements MouseListener {

    private final RegistroComputadoras registroComputadoras;

    public ControladorRegistroComputadorasIFrame(RegistroComputadoras registroComputadoras){
        this.registroComputadoras = registroComputadoras;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Object event = e.getSource();
        if(event == registroComputadoras.guardar){
            validarMarcaModelo();
            validarComentarios();
            validarMarcaModelo();
        }
    }

    private void validarMarcaModelo(){
        if(Regex.validarComputadora(registroComputadoras.txtMarcaModelo.getText())){
            System.out.println("Marca o modelo validos");
        }else {
            Notificaciones.mensajeError(registroComputadoras,"Nombre de la marca o modelo invalidos","Error en validaciones");
        }
        // if false
        //Notificaciones.mensajeError(login,"Usuario o contraseña incorrectos","Credenciales invalidas");
    }


    private void validarNumSerie(){
        if(Regex.validarNumSerie(registroComputadoras.txtNserie.getText())){
            System.out.println("Marca o modelo validos");
        }else {
            Notificaciones.mensajeError(registroComputadoras,"Nombre de la marca o modelo invalidos","Error en validaciones");
        }
        // if false
        //Notificaciones.mensajeError(login,"Usuario o contraseña incorrectos","Credenciales invalidas");
    }



    private void validarComentarios(){
        if(Regex.validarCadenaDeSoloLetras(registroComputadoras.txtComentarios.getText())){
            System.out.println("Comentarios correctos");
        }else {
            Notificaciones.mensajeError(registroComputadoras,"Existen datos invalidos en los comentarios","Error en validaciones");
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

        if (event == registroComputadoras.guardar){
            registroComputadoras.guardar.setBorder(new BevelBorder(BevelBorder.RAISED));
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        Object event = e.getSource();

        if (event == registroComputadoras.guardar){
            registroComputadoras.guardar.setBorder(null);
        }
    }
}
