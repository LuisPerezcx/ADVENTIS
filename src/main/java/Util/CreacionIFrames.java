package Util;

import Views.*;
import Views.celdaAcciones.PanelAcciones;

/*
la razon de que esta clase sea static es para evitar que existan 2 o mas internalframes
del mismo tipo al mismo tiempo.
 */
public class CreacionIFrames {
    public static final HerramientasMenuIFrame herramientasMenuIFrame = new HerramientasMenuIFrame();
    public static final AuditoriasMenuIFrame auditoriasMenuIFrame = new AuditoriasMenuIFrame();
    public static final ReportesMenuIFrame reportesMenuIFrame = new ReportesMenuIFrame();
    public static final RegistroUsuariosIFrame registroUsuariosIFrame = new RegistroUsuariosIFrame();
    public static final RegistroEmpleadosIFrame registroEmpleadosIFrame = new RegistroEmpleadosIFrame();
    public static final VerEmpleadosIFrame verEmpleadosIFrame = new VerEmpleadosIFrame();
    public static final VerUsuarios verUsuarios = new VerUsuarios();
    public static PerfilMenuIFrame perfilMenuIFrame;
    public static EmpleadosMenuIFrame empleadosMenuIFrame;
    public static RegistroHerramientasIFrame registroHerramientasIFrame;
    public static GenerarAuditoriaIFrame generarAuditoriaIFrame;

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

}
