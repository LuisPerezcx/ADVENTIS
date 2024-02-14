package Controller;

import Views.VentanaPrincipal;
import Views.celdaAcciones.PanelAcciones;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import static Util.CreacionIFrames.*;

public class ControladorPanelAcciones implements MouseListener {
    private final VentanaPrincipal ventanaPrincipal;
    private final PanelAcciones panelAcciones;
    private final JTable tablaAccion;
    public ControladorPanelAcciones(VentanaPrincipal ventanaPrincipal,PanelAcciones panelAcciones,JTable table){
        this.ventanaPrincipal = ventanaPrincipal;
        this.panelAcciones = panelAcciones;
        this.tablaAccion = table;
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println(tablaAccion);
        String iFrameTitulo = tituloIFrame(tablaAccion);
        System.out.println(iFrameTitulo);

        Object event = e.getSource();
        if (event == panelAcciones.editarBtnTable1){
            switch (iFrameTitulo){
                case "Ver empleados"->
                        editarEmpleado();
                case "Ver usuarios"->
                    editarUsuario();
                case "Ver herramientas"->
                    editarHerramientas();
                case "Solicitudes de herramientas"->
                    editarSolicitudHerramienta();
                case "Solicitar herramienta"->
                    editarSolicitarHerramienta();
            }
        } else if (event == panelAcciones.eliminarBtnTable) {
            switch (iFrameTitulo){
                case "Ver empleados"->
                        eliminarEmpleado();
                case "Ver usuarios"->
                    eliminarUsuario();
                case "Ver herramientas"->
                    eliminarHerramientas();
            }
        } else if (event == panelAcciones.abrirBtnTable) {
            switch (iFrameTitulo){
                case "Solicitudes de herramientas"->
                    abrirSolicitudHerramienta();
                case "Catalogo auditorias" ->
                    verAuditoriaGenerada();
            }
        } else if (event == panelAcciones.agregarBtnTable) {
            switch (iFrameTitulo){
                case "Solicitar herramienta"->
                    agregarSolicitarHerramienta();
            }
        } else if (event == panelAcciones.pdfBtnTable) {
            switch (iFrameTitulo){
                case "Reportes"->
                    pdfReportes();
            }
        } else if (event == panelAcciones.excelBtnTable) {
            switch (iFrameTitulo){
                case "Reportes"->
                   excelReportes();
            }
        }
    }

    // -------Ver empleados

    public void editarEmpleado(){

    }
    public void eliminarEmpleado(){

    }


    // -------Ver usuarios
    public void editarUsuario(){

    }
    public void eliminarUsuario(){

    }


    // -------Ver herramientas
    public void editarHerramientas(){

    }
    public void eliminarHerramientas(){

    }


    // -------Solicitudes de herramientas
    public void  editarSolicitudHerramienta(){

    }
    public void   abrirSolicitudHerramienta(){

    }


    // -------Solicitar herramienta
    public void editarSolicitarHerramienta(){

    }
    public void agregarSolicitarHerramienta(){

    }

    // ------- Reportes
    public void pdfReportes(){

    }
    public void excelReportes(){
    }

    // ------- ver auditoria generada
    private void verAuditoriaGenerada(){
        ventanaPrincipal.dibujarVista(auditoriaGeneradaIFrame);
    }



    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
    public String tituloIFrame(Component comp) {
        Container parent = SwingUtilities.getAncestorOfClass(JInternalFrame.class, comp);
        if (parent != null) {
            JInternalFrame internalFrame = (JInternalFrame) parent;
            return internalFrame.getTitle();
        }
        System.out.println("ERROR NO SE ENCONTRO EL IFRAME");
        return null;
    }
}
