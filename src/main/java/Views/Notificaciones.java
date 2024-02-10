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

    public static void mensajeError(Component padre, String mensaje, String titulo) {
        JOptionPane.showMessageDialog(padre, mensaje, titulo, JOptionPane.PLAIN_MESSAGE, iconError);
    }
}