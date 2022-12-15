package ConversorMonedas;
import javax.swing.*;

public class Principal {

    public static void main(String[] arg){
        Finalizar finalizar = new Finalizar();
        Function monedas = new Function();
        Temperatura temperatura = new Temperatura();
        Finalizar cuadro = new Finalizar();
        Validaciones validar = new Validaciones();
        Object opciones = (JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", "Menu", JOptionPane.QUESTION_MESSAGE,null, new Object[]{
                "Conversor de divisas", "Conversor de Temperatura", "Conversor de Unidades de medida", }, "Selección"));
        if(opciones==null){
            finalizar.CuadroDialogoCancelarPrincipal(null, null);
        }else{
            String op= opciones.toString();
            String input = JOptionPane.showInputDialog("Ingrese un valor para convertir");
            if(input==null){
                finalizar.CuadroDialogoCancelarPrincipal(input, null);

            }else{
                if(!(validar.ValidarVacio(input))){
                    if(!validar.ValidarLetras(input)){
                        double valorRecibido = Double.parseDouble(input);
                            switch (op){
                                case "Conversor de monedas":
                                    monedas.ConvertirMonedas(valorRecibido);
                                    cuadro.CuadroDialogoFinalizar();
                                    break;
                                case "Conversor de Temperatura":
                                    temperatura.ConvertirTemperaturas(valorRecibido);
                                    cuadro.CuadroDialogoFinalizar();
                                    break;
                                case "Conversor de Unidades de medida":
                                    System.out.println("Conversor de Unidades de medida");
                                    break;
                            }
                    }
                }
            }


        }

    }
}
