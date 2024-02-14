package Util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    static Pattern pattern;
    static Matcher matcher;
    static String regex;
    public static boolean validarCorreo(String validar){
        regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$\n";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(validar);
        return matcher.matches();
    }
    public static boolean validarLetramayusculaLetraminuscula(String validar){
        regex = "^[A-Za-zÁÉÍÓÚáéíóúÜüÑñ\\s'-]+ [A-Za-zÁÉÍÓÚáéíóúÜüÑñ\\s'-]+$";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(validar);
        return matcher.matches();
    }

    public static boolean validarNombreCompleto(String validar){
        regex = "^[A-Z][a-z]+(?: [A-Z][a-z]+)+$";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(validar);
        return matcher.matches();
    }

    public static boolean validarSoloNumeros(String validar){
        regex = "^[0-9]+$";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(validar);
        return matcher.matches();
    }

    public static boolean validarCadenaDeSoloLetras(String validar){
        regex = "^[a-zA-Z\\s]+$";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(validar);
        return matcher.matches();
    }

    public static boolean validarLetrasNumeros(String validar){
        regex = "^[A-Za-z0-9\\s]+$";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(validar);
        return  matcher.matches();
    }

    public static boolean validarNombreComponente(String validar){
        regex = "^[a-zA-Z]+\\s?[a-zA-Z\\s]*$";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(validar);
        return  matcher.matches();
    }



}
