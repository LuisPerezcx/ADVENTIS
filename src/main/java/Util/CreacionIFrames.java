package Util;

import Views.*;

/*
la razon de que esta clase sea static es para evitar que existan 2 o mas internalframes
del mismo tipo al mismo tiempo.
 */
public class CreacionIFrames {
    public static  HerramientasMenuIFrame herramientasMenuIFrame;
    public static AuditoriasMenuIFrame auditoriasMenuIFrame ;
    public static ReportesMenuIFrame reportesMenuIFrame;
    public static final RegistroUsuariosIFrame registroUsuariosIFrame = new RegistroUsuariosIFrame();
    public static final RegistroEmpleadosIFrame registroEmpleadosIFrame = new RegistroEmpleadosIFrame();
    public static final VerEmpleadosIFrame verEmpleadosIFrame = new VerEmpleadosIFrame();
    public static final VerUsuariosIFrame verUsuariosIFrame = new VerUsuariosIFrame();
    public static PerfilMenuIFrame perfilMenuIFrame;
    public static EmpleadosMenuIFrame empleadosMenuIFrame;
    public static RegistroHerramientasIFrame registroHerramientasIFrame;
    public static GenerarAuditoriaIFrame generarAuditoriaIFrame;
    public static VerHerramientasIFrame verHerramientasIFrame;
    public static SolicitarHerramientasIFrame solicitarHerramientasIFrame;
    public static RegistroComponentesIFrame registroComponentesIFrame;
    public static SolicitudesHerramientasIFrame solicitudesHerramientasIFrame;
    public static RegistroTipoHerramientasIFrame registroTipoHerramientasIFrame;
    public static VistaReporteIFrame vistaReporteIFrame;
    public static VerAuditoriasIFrame verAuditoriasIFrame;
    public static RegistroComputadoras registroComputadoras;
    public static RegistroCamarasDigitalesIFrame registroCamarasDigitalesIFrame;
    public static DatosGeneralesIFrame datosGeneralesIFrame;


    public static void setPerfilMenuIFrame(PerfilMenuIFrame perfilMenuIFrame) {
        CreacionIFrames.perfilMenuIFrame = perfilMenuIFrame;
    }
    public static void setEmpleadosMenuIFrame(EmpleadosMenuIFrame empleadosMenuIFrame) {
        CreacionIFrames.empleadosMenuIFrame = empleadosMenuIFrame;
    }
    public static void setRegistroHerramientasIFrame(RegistroHerramientasIFrame registroHerramientasIFrame) {
        CreacionIFrames.registroHerramientasIFrame = registroHerramientasIFrame;
    }
    public static void  setGenerarAuditoriaIFrame(GenerarAuditoriaIFrame generarAuditoriaIFrame){
        CreacionIFrames.generarAuditoriaIFrame = generarAuditoriaIFrame;
    }
    public static void setVerHerramientasIFrame(VerHerramientasIFrame verHerramientasIFrame) {
        CreacionIFrames.verHerramientasIFrame = verHerramientasIFrame;
    }
    public static void setSolicitarHerramientasIFrame(SolicitarHerramientasIFrame solicitarHerramientasIFrame) {
        CreacionIFrames.solicitarHerramientasIFrame = solicitarHerramientasIFrame;
    }

    public static  void setRegistroComponentesIFrame(RegistroComponentesIFrame registroComponentesIFrame){
        CreacionIFrames.registroComponentesIFrame = registroComponentesIFrame;
    }

    public static void setSolicitudesHerramientasIFrame(SolicitudesHerramientasIFrame solicitudesHerramientasIFrame) {
        CreacionIFrames.solicitudesHerramientasIFrame = solicitudesHerramientasIFrame;
    }

    public static void setRegistroTipoHerramientasIFrame(RegistroTipoHerramientasIFrame registroTipoHerramientasIFrame){
        CreacionIFrames.registroTipoHerramientasIFrame = registroTipoHerramientasIFrame;
    }

    public static void setVistaReporteIFrame (VistaReporteIFrame vistaReporteIFrame){
        CreacionIFrames.vistaReporteIFrame = vistaReporteIFrame;
    }

    public static void setVerAuditoriasIFrame (VerAuditoriasIFrame verAuditoriasIFrame){
        CreacionIFrames.verAuditoriasIFrame = verAuditoriasIFrame;
    }

    public static void setRegistroComputadoras(RegistroComputadoras registroComputadoras) {
        CreacionIFrames.registroComputadoras = registroComputadoras;
    }

    public static void setRegistroCamarasDigitalesIFrame(RegistroCamarasDigitalesIFrame registroCamarasDigitalesIFrame){
        CreacionIFrames.registroCamarasDigitalesIFrame = registroCamarasDigitalesIFrame;
    }

    public static void setReportesMenuIFrame (ReportesMenuIFrame reportesMenuIFrame){
        CreacionIFrames.reportesMenuIFrame = reportesMenuIFrame;
    }

    public static void setHerramientasMenuIFrame(HerramientasMenuIFrame herramientasMenuIFrame) {
        CreacionIFrames.herramientasMenuIFrame = herramientasMenuIFrame;
    }

    public static void setAuditoriasMenuIFrame(AuditoriasMenuIFrame auditoriasMenuIFrame) {
        CreacionIFrames.auditoriasMenuIFrame = auditoriasMenuIFrame;
    }


    public static void setDatosGeneralesIFrame(DatosGeneralesIFrame datosGeneralesIFrame) {
        CreacionIFrames.datosGeneralesIFrame = datosGeneralesIFrame;
    }
}
