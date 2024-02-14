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
    public static boolean validarNombreCompleto(String validar){
        regex = "^[A-Z][a-z]+(?: [A-Z][a-z]+)+$";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(validar);
        return matcher.matches();
    }
}
