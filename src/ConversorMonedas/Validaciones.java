package ConversorMonedas;

import javax.swing.*;

public class Validaciones {
    Principal principal = new Principal();
    public boolean ValidarNumerosNegativos(double valorRecibido){
        boolean flag=false;
        if(valorRecibido<0){
            flag = true;
            //JOptionPane.showMessageDialog(null, "Valor no valido, el valor no puede ser negativo");
            JOptionPane.showMessageDialog(null, "Valor no valido, el valor no puede ser negativo", "Validación", JOptionPane.ERROR_MESSAGE);
        }
        return flag;
    }
    public boolean ValidarVacio(String valorRecibido){
        boolean flag= false;
        if(valorRecibido==null || valorRecibido.length()<=0){
            flag=true;
            JOptionPane.showMessageDialog(null, "Valor no valido, el campo no debe estar vacío", "Validación", JOptionPane.ERROR_MESSAGE);
            principal.main(null);
        }
        return flag;
    }
    public boolean ValidarLetras(String valorRecibido){
        boolean flag = false;
        if (valorRecibido.matches(".*[a-zA-Z]+.*")){
            flag= true;
            JOptionPane.showMessageDialog(null, "Valor no valido, el campo no debe contener letras solo numeros", "Validación", JOptionPane.ERROR_MESSAGE);
            principal.main(null);
        }
        return flag;
    }



}
