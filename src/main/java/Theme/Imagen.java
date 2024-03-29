package Theme;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class Imagen extends Canvas {
    private int x, y;
    private String url;
    private Image imagen;  // Agregamos un campo para almacenar la imagen
    public Imagen(){}

    public Imagen(int x, int y, String url) {
        this.x = x;
        this.y = y;
        this.url = url;
    }

    @Override
    public void paint(Graphics g) {
        if (imagen == null) {
            cargarImagen();
        }
        g.drawImage(imagen, x, y, this);
    }

    public void redimensionar(int newWidth, int newHeight) {
        if (imagen == null) {
            cargarImagen();
        }
        imagen = imagen.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
        repaint();
    }

    private void cargarImagen() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            URL imageUrl = classLoader.getResource(url);

            Toolkit toolkit = Toolkit.getDefaultToolkit();
            imagen = toolkit.getImage(imageUrl);
        }catch (NullPointerException e){
            System.out.println("no sirve url");
        }
    }
    public Image getImagen() {
        return imagen;
    }
    public Icon getIcon(String path, int w, int h){
        return new ImageIcon(new ImageIcon(getClass().getResource(path)).getImage().getScaledInstance(w,h,0));
    }
}
