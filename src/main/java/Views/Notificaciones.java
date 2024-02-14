package Views;

import Theme.Imagen;

import javax.swing.*;
import java.awt.*;
public class Notificaciones {
    private static final String pathMsgOK = "/Images/icons8_ok_40px.png";
    private static final String pathMsgError = "/Images/icons8_cancel_40px.png";
    private static Icon iconOK;
    private static Icon iconError;

    static {
        Imagen imagen = new Imagen();
        iconOK = imagen.getIcon(pathMsgOK, 40, 40);
        iconError = imagen.getIcon(pathMsgError, 40, 40);
    }

    public static void mensajeOK(Component padre, String mensaje, String titulo) {
        JOptionPane.showMessageDialog(padre, mensaje, titulo, JOptionPane.PLAIN_MESSAGE, iconOK);
    }
    public static void mensajePregunta(Component padre, String mensaje, String titulo) {
        int opcion = JOptionPane.showConfirmDialog(padre, mensaje, titulo, JOptionPane.OK_CANCEL_OPTION);
        if (opcion == JOptionPane.OK_OPTION) {
            // Aquí iría la lógica para manejar la acción de aceptar
            System.out.println("Aceptar");
        } else if (opcion == JOptionPane.CANCEL_OPTION || opcion == JOptionPane.CLOSED_OPTION) {
            // Aquí iría la lógica para manejar la acción de cancelar
            System.out.println("Cancelar");
        }
    }

    public static void mensajeError(Component padre, String mensaje, String titulo) {
        JOptionPane.showMessageDialog(padre, mensaje, titulo, JOptionPane.PLAIN_MESSAGE, iconError);
    }
}