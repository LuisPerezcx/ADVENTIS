package Controller;

import DAO.UsuarioDAO;
import Model.Usuario;
import Util.Regex;
import Views.Notificaciones;
import Views.VerUsuariosIFrame;

import javax.swing.border.BevelBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class ControladorVerUsuariosIFrame implements MouseListener{
    private final VerUsuariosIFrame verUsuariosIFrame;
    private final UsuarioDAO usuarioDAO = new UsuarioDAO();

    public ControladorVerUsuariosIFrame(VerUsuariosIFrame verUsuariosIFrame) {
        this.verUsuariosIFrame = verUsuariosIFrame;
        mostrarDatos();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Object event = e.getSource();
        if (event == verUsuariosIFrame.btnBuscar){
            validarBusqueda();

        }
    }

    private void validarBusqueda(){
        if(Regex.validarNombreCompleto(verUsuariosIFrame.txtBusqueda.getText())){
            System.out.println("Busqueda exitosa");
        }else {
            Notificaciones.mensajeError(verUsuariosIFrame,"No se puede realizar la busqueda, verifique sus datos","Error al intentar buscar");
        }
        // if false
        //Notificaciones.mensajeError(login,"Usuario o contraseña incorrectos","Credenciales invalidas");
    }

    public void mostrarDatos (){
        DefaultTableModel modelo  = (DefaultTableModel) verUsuariosIFrame.tblUsuarios.getModel();
        modelo.setRowCount(0);

        ArrayList<Usuario> usuarios = usuarioDAO.getAllUsuarios();

        for (Usuario usuario: usuarios){
            Object[] rowData = {
                    usuario.getEmail(),
                    usuario.getIdTipoUsuario(),
            };
            modelo.addRow(rowData);
        }
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
        if (event == verUsuariosIFrame.btnBuscar){
            verUsuariosIFrame.btnBuscar.setBorder(new BevelBorder(BevelBorder.RAISED));
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        Object event = e.getSource();
        if (event == verUsuariosIFrame.btnBuscar){
            verUsuariosIFrame.btnBuscar.setBorder(null);
        }
    }


}