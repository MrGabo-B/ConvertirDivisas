package ConversorMonedas;
import javax.swing.*;

public class Temperatura {
    ConvertirTemperatura temperatura = new ConvertirTemperatura();
    Principal principal = new Principal();

    public void ConvertirTemperaturas(double valorRecibido){
        Object opcion= (JOptionPane.showInputDialog(null, "Elige la conversión de temperatura ºC, ºF o ºK", "Temperatura",JOptionPane.PLAIN_MESSAGE, null, new Object[]{
                "De grados Celsius a Fahrenheit",
                "De grados Fahrenheit a Celsius",
                "De grados Celsius a Kelvin",
                "De grados Kelvin a Celsius",
                "De grados Kelvin a Fahrenheit",
                "De grados Fahrenheit a Kelvin",

        }, "Seleccione una opción"));
        if (opcion!= null){
            String op = opcion.toString();
            switch (op){
                case "De grados Celsius a Fahrenheit":
                    temperatura.CelsiusAFahrenheit(valorRecibido);
                    break;
                case "De grados Fahrenheit a Celsius":
                    temperatura.FahrenheitACelsius(valorRecibido);
                    break;
                case "De grados Celsius a Kelvin":
                    temperatura.CelsiusAKelvin(valorRecibido);
                    break;
                case "De grados Kelvin a Celsius":
                    temperatura.KelvinACelsius(valorRecibido);
                    break;
                case "De grados Kelvin a Fahrenheit":
                    temperatura.KelvinAFahrenheit(valorRecibido);
                    break;
                case "De grados Fahrenheit a Kelvin":
                    temperatura.FahrenheitAKelvin(valorRecibido);
                    break;
            }
        }else {
            System.out.println("HOla mundo");
            JOptionPane.showMessageDialog(null, "Valor no valido, tienes que elegir una opción correcta", "Validación", JOptionPane.ERROR_MESSAGE);
            principal.main(null);
        }
    }

}
