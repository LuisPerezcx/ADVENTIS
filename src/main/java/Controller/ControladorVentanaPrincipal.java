package Controller;

import Views.*;

import javax.swing.border.BevelBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import static Util.CreacionIFrames.*;


public class ControladorVentanaPrincipal implements ActionListener, MouseListener {
    private final VentanaPrincipal ventanaPrincipal;

    public ControladorVentanaPrincipal(VentanaPrincipal ventanaPrincipal){
        this.ventanaPrincipal = ventanaPrincipal;
        crearIFrames();
    }
    private void crearIFrames(){
        setPerfilMenuIFrame(new PerfilMenuIFrame(ventanaPrincipal));
        setEmpleadosMenuIFrame(new EmpleadosMenuIFrame(ventanaPrincipal));
        setRegistroHerramientasIFrame(new RegistroHerramientasIFrame(ventanaPrincipal));
        setVerHerramientasIFrame(new VerHerramientasIFrame(ventanaPrincipal));
        setGenerarAuditoriaIFrame(new GenerarAuditoriaIFrame(ventanaPrincipal));
        setSolicitarHerramientasIFrame(new SolicitarHerramientasIFrame(ventanaPrincipal));
        setRegistroComponentesIFrame(new RegistroComponentesIFrame(ventanaPrincipal));
        setRegistroTipoHerramientasIFrame(new RegistroTipoHerramientasIFrame(ventanaPrincipal));
        setSolicitudesHerramientasIFrame(new SolicitudesHerramientasIFrame(ventanaPrincipal));
        setVistaReporteIFrame(new VistaReporteIFrame(ventanaPrincipal));
        setVerAuditoriasIFrame(new VerAuditoriasIFrame(ventanaPrincipal));
        setRegistroComputadoras(new RegistroComputadoras(ventanaPrincipal));
        setRegistroCamarasDigitalesIFrame(new RegistroCamarasDigitalesIFrame(ventanaPrincipal));
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Object event = e.getSource();

        if (event == ventanaPrincipal.rUsuariosItem){
            ventanaPrincipal.dibujarVista(registroUsuariosIFrame);
        } else if (event == ventanaPrincipal.rEmpleadosItem) {
            ventanaPrincipal.dibujarVista(registroEmpleadosIFrame);
        } else if (event == ventanaPrincipal.verEmpleadosItem) {
            ventanaPrincipal.dibujarVista(verEmpleadosIFrame);
        } else if (event == ventanaPrincipal.verUsuariosItem) {
            ventanaPrincipal.dibujarVista(verUsuariosIFrame);
        } else if (event == ventanaPrincipal.rHerramientasItem){
            ventanaPrincipal.dibujarVista(registroHerramientasIFrame);
        } else if (event == ventanaPrincipal.verHerramientasItem) {
            ventanaPrincipal.dibujarVista(verHerramientasIFrame);
        } else if (event == ventanaPrincipal.generarAuditoriasItem){
            ventanaPrincipal.dibujarVista(generarAuditoriaIFrame);
        } else if (event == ventanaPrincipal.solicitarHerramientaItem) {
            ventanaPrincipal.dibujarVista(solicitarHerramientasIFrame);
        } else if (event == ventanaPrincipal.rTipoComponente){
            ventanaPrincipal.dibujarVista(registroComponentesIFrame);
        } else if (event == ventanaPrincipal.rTipoHerramientaItem) {
            ventanaPrincipal.dibujarVista(registroTipoHerramientasIFrame);
        } else if (event == ventanaPrincipal.prestarHerramientasItem) {
            ventanaPrincipal.dibujarVista(solicitudesHerramientasIFrame);
        } else if (event == ventanaPrincipal.verReportesItem) {
            ventanaPrincipal.dibujarVista(vistaReporteIFrame);
        } else if (event == ventanaPrincipal.verAuditoriasItem) {
            ventanaPrincipal.dibujarVista(verAuditoriasIFrame);
        } else if (event == ventanaPrincipal.rComputadorasPItem) {
            ventanaPrincipal.dibujarVista(registroComputadoras);
        } else if (event == ventanaPrincipal.rCamarasDItem) {
            ventanaPrincipal.dibujarVista(registroCamarasDigitalesIFrame);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Object event = e.getSource();
        if(event == ventanaPrincipal.empleadosBMenu){
            ventanaPrincipal.dibujarVista(empleadosMenuIFrame);
        } else if (event == ventanaPrincipal.herramientasBMenu) {
            ventanaPrincipal.dibujarVista(herramientasMenuIFrame);
        } else if (event == ventanaPrincipal.auditoriasBMenu) {
            ventanaPrincipal.dibujarVista(auditoriasMenuIFrame);
        } else if (event == ventanaPrincipal.reportesBMenu) {
            ventanaPrincipal.dibujarVista(reportesMenuIFrame);
        } else if (event == ventanaPrincipal.perfilBMenu) {
            ventanaPrincipal.dibujarVista(perfilMenuIFrame);
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
        if (event == ventanaPrincipal.empleadosBMenu){
            ventanaPrincipal.empleadosBMenu.setBorder(new BevelBorder(BevelBorder.RAISED));
        } else if (event == ventanaPrincipal.herramientasBMenu) {
            ventanaPrincipal.herramientasBMenu.setBorder(new BevelBorder(BevelBorder.RAISED));
        } else if (event == ventanaPrincipal.auditoriasBMenu) {
            ventanaPrincipal.auditoriasBMenu.setBorder(new BevelBorder(BevelBorder.RAISED));
        } else if (event == ventanaPrincipal.reportesBMenu) {
            ventanaPrincipal.reportesBMenu.setBorder(new BevelBorder(BevelBorder.RAISED));
        } else if (event == ventanaPrincipal.perfilBMenu) {
            ventanaPrincipal.perfilBMenu.setBorder(new BevelBorder(BevelBorder.RAISED));
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        Object event = e.getSource();
        if (event == ventanaPrincipal.empleadosBMenu){
            ventanaPrincipal.empleadosBMenu.setBorder(null);
        }else if (event == ventanaPrincipal.herramientasBMenu) {
            ventanaPrincipal.herramientasBMenu.setBorder(null);
        } else if (event == ventanaPrincipal.auditoriasBMenu) {
            ventanaPrincipal.auditoriasBMenu.setBorder(null);
        } else if (event == ventanaPrincipal.reportesBMenu) {
            ventanaPrincipal.reportesBMenu.setBorder(null);
        } else if (event == ventanaPrincipal.perfilBMenu) {
            ventanaPrincipal.perfilBMenu.setBorder(null);
        }

    }
}
