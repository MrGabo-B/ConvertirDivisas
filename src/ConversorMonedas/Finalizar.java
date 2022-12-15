package ConversorMonedas;

import javax.swing.*;

public class Finalizar {
    Principal principal = new Principal();
    public void CuadroDialogoFinalizar(){
        int seleccion = JOptionPane.showConfirmDialog(null,"¿Deseas realizar otra conversión?");
        if(JOptionPane.OK_OPTION == seleccion){
            System.out.println("Seleccionó opción afirmativa");
            principal.main(null);
        }else{
            JOptionPane.showMessageDialog(null, "Programa terminado :)");
        }
    }
    public void CuadroDialogoCancelarPrincipal(String vacio, Object vacio_){
        if(vacio == null || vacio_==null)
            JOptionPane.showMessageDialog(null, "Programa terminado :)");
    }
}
