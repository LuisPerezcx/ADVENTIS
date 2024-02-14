package Controller;

import Arreglos.Arreglos;
import DAO.EmpleadoDAO;
import Model.Empleado;
import Util.Regex;
import Views.Notificaciones;
import Views.VerEmpleadosIFrame;

import javax.swing.border.BevelBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

public class ControladorVerEmpleadosIFrame implements MouseListener {
    private final VerEmpleadosIFrame verEmpleadosIFrame;
    EmpleadoDAO empleadoDAO = new EmpleadoDAO();

    public ControladorVerEmpleadosIFrame(VerEmpleadosIFrame verEmpleadosIFrame) {
        this.verEmpleadosIFrame = verEmpleadosIFrame;
        mostrarDatos();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Object event = e.getSource();
        if (event == verEmpleadosIFrame.buscar1){
            validarBusqueda();
        }
    }

    private void validarBusqueda(){
        if(Regex.validarNombreCompleto(verEmpleadosIFrame.txtNombre.getText())){
            System.out.println("Busqueda exitosa");
        }else {
            Notificaciones.mensajeError(verEmpleadosIFrame,"No se puede realizar la busqueda, verifique sus datos","Error al intentar buscar");
        }
        // if false
        //Notificaciones.mensajeError(login,"Usuario o contraseña incorrectos","Credenciales invalidas");
    }
    public void mostrarDatos() {
        DefaultTableModel modelo = (DefaultTableModel) verEmpleadosIFrame.tablaEmpleados.getModel();
        modelo.setRowCount(0);  // Clear existing rows

        ArrayList<Empleado> empleados = empleadoDAO.getAllEmpleados();



        for (Empleado empleado : empleados) {
            Object[] rowData = {
                    empleado.getNombreEmpleado(),
                    empleado.getaPaterno(),
                    empleado.getaMaterno(),

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
        if (event == verEmpleadosIFrame.buscar1){
            verEmpleadosIFrame.buscar1.setBorder(new BevelBorder(BevelBorder.RAISED));
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        Object event = e.getSource();
        if (event == verEmpleadosIFrame.buscar1){
            verEmpleadosIFrame.buscar1.setBorder(null);
        }
    }
}