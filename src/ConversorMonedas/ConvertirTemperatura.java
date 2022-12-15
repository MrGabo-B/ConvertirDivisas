package ConversorMonedas;
import javax.swing.*;

public class ConvertirTemperatura {

//Grados Celsius a Fahrenheit

    public void CelsiusAFahrenheit(double celsius){
        double gradosFahrenheit = 1.8  * celsius + 32;
        gradosFahrenheit = (double) Math.round(gradosFahrenheit * 100d)/100;
        JOptionPane.showMessageDialog(null, "Grados Fahrenheit: " + gradosFahrenheit + " ºC");
    }

    // Grados Fahrenheit a Celsius

    public void FahrenheitACelsius(double fahrenheit){
        double gradosCelsius = (fahrenheit - 32) / 1.8;
        gradosCelsius = (double) Math.round(gradosCelsius * 100d)/100;
        JOptionPane.showMessageDialog(null, "Grados Celsius: " + gradosCelsius + " ºC");
    }

    // Grados Celsius a Kelvin

    public void CelsiusAKelvin(double celsius){
        double gradosKelvin = celsius + 273;
        gradosKelvin = (double) Math.round(gradosKelvin * 100d)/100;
        JOptionPane.showMessageDialog(null, "Grados Kelvin; " + gradosKelvin + " ºK");

    }

    // Grados Kelvin a Celsius
    public void KelvinACelsius(double kelvin){
        double gradosCelsius = kelvin - 273;
        gradosCelsius = (double) Math.round(gradosCelsius * 100d)/100;
        JOptionPane.showMessageDialog(null, "Grados Celsius; " + gradosCelsius + " ºC");

    }

    // Grados Kelvin a Fahrenheit
    public void KelvinAFahrenheit(double kelvin){
        double gradosFahrenheit = 1.8 * ( kelvin - 273) + 32;
        gradosFahrenheit = (double) Math.round(gradosFahrenheit * 100d)/100;
        JOptionPane.showMessageDialog(null, "Grados Fahrenheit; " + gradosFahrenheit + " ºF");

    }

    // Grados Fahrenheit a Kelvin
    public void FahrenheitAKelvin(double fahrenheit){
        double gradosKelvin = ((fahrenheit - 32)/1.8)+32;
        gradosKelvin = (double) Math.round(gradosKelvin * 100d)/100;
        JOptionPane.showMessageDialog(null, "Grados Kelvin; " + gradosKelvin + " ºK");


    }
}
