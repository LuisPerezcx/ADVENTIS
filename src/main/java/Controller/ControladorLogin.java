package Controller;

import Views.Login;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ControladorLogin implements ActionListener, MouseListener {
    private final Login login;
    public ControladorLogin(Login login){
        this.login = login;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Object event = e.getSource();
        if (event == login.usuarioTxt){
            System.out.println("a");
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        Object event = e.getSource();
        if (event == login.usuarioTxt){
            if (login.usuarioTxt.getText().equals("Ingrese su nombre de usuario")){
                login.usuarioTxt.setText("");
                login.usuarioTxt.setForeground(Color.BLACK);
            }
            if (String.valueOf(login.paswordField.getPassword()).isEmpty()){
                login.paswordField.setText("********");
                login.paswordField.setForeground(Color.gray);
            }
        } else if (event == login.paswordField) {
            if (String.valueOf(login.paswordField.getPassword()).equals("********")){
                login.paswordField.setText("");
                login.paswordField.setForeground(Color.BLACK);
            }
            if (login.usuarioTxt.getText().isEmpty()){
                login.usuarioTxt.setText("Ingrese su nombre de usuario");
                login.usuarioTxt.setForeground(Color.gray);
            }
        }
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
}
