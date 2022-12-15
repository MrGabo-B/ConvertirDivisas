package ConversorMonedas;

import javax.swing.*;

public class ConvertirMonedas {

    //Bolivianos
    public void ConvertirDeBolivianosADolar(double valorRecibido){
        double monedaDolar= valorRecibido / 6.91;
        monedaDolar= (double) Math.round(monedaDolar * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaDolar + " Dolares");
    }
    public void ConvertirDeBolivianosAEuro(double valorRecibido){
        double monedaEuro= valorRecibido / 7.38;
        monedaEuro = (double) Math.round(monedaEuro * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaEuro + " Euros");
    }
    public void ConvertirDeBolivianosALibras(double valorRecibido){
        double monedaLibra= valorRecibido / 8.58;
        monedaLibra= (double) Math.round(monedaLibra * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaLibra + " Libras");
    }
    public void ConvertirDeBolivianosAYen(double valorRecibido){
        double monedaYen= valorRecibido / 0.051;
        monedaYen= (double) Math.round(monedaYen * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaYen + " Yen");
    }
    public void ConvertirDeBolivianosAWonCoreano(double valorRecibido){
        double monedaWonCoreano = valorRecibido / 0.0053;
        monedaWonCoreano = (double) Math.round(monedaWonCoreano * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaWonCoreano + " Won SurCoreanos");
    }
    //////////////////////////
    public void ConvertirDeDolarABoliviano(double valorRecibido){
        double monedaBoliviano= valorRecibido * 6.91;
        monedaBoliviano= (double) Math.round(monedaBoliviano * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaBoliviano + " Bolivianos");
    }
    public void ConvertirDeEuroABoliviano(double valorRecibido){
        double monedaBoliviano= valorRecibido * 7.38;
        monedaBoliviano= (double) Math.round(monedaBoliviano * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaBoliviano + " Bolivianos");
    }
    public void ConvertirDeLibrasABoliviano(double valorRecibido){
        double monedaBoliviano= valorRecibido * 8.58;
        monedaBoliviano= (double) Math.round(monedaBoliviano * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaBoliviano + " Bolivianos");
    }
    public void ConvertirDeYenABoliviano(double valorRecibido){
        double monedaBoliviano= valorRecibido * 0.051;
        monedaBoliviano= (double) Math.round(monedaBoliviano * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaBoliviano + " Bolivianos");
    }
    public void ConvertirDeWonCoreanoABoliviano(double valorRecibido){
        double monedaBoliviano= valorRecibido * 0.0053;
        monedaBoliviano= (double) Math.round(monedaBoliviano * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaBoliviano + " Bolivianos");
    }


    ///Pesos Colombianos
    public void ConvertirPesosColombianosADolar(double valorRecibido){
        double monedaDolar = valorRecibido / 4801.53;
        monedaDolar = (double) Math.round(monedaDolar * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaDolar + " Dolares");
        }
    public void ConvertirDePesosColombianosAEuro(double valorRecibido){
        double monedaEuro= valorRecibido / 5100.41;
        monedaEuro = (double) Math.round(monedaEuro * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaEuro + " Euros");
    }
    public void ConvertirDePesosColombianosALibras(double valorRecibido){
        double monedaLibra= valorRecibido / 5932.87;
        monedaLibra= (double) Math.round(monedaLibra * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaLibra + " Libras");
    }
    public void ConvertirDePesosColombianosAYen(double valorRecibido){
        double monedaYen= valorRecibido / 35.29;
        monedaYen= (double) Math.round(monedaYen * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaYen + " Yen");
    }
    public void ConvertirDePesosColombianosAWonCoreano(double valorRecibido){
        double monedaWonCoreano = valorRecibido / 3.67;
        monedaWonCoreano = (double) Math.round(monedaWonCoreano * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaWonCoreano + " Won Sur Coreanos");
    }
    //////////////////////////
    public void ConvertirDeDolarAPesosColombianos(double valorRecibido){
        double pesosColombianos= valorRecibido * 4801.53;
        pesosColombianos= (double) Math.round(pesosColombianos * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + pesosColombianos + " Pesos colombianos");
    }
    public void ConvertirDeEuroAPesosColombianos(double valorRecibido){
        double pesosColombianos= valorRecibido * 5100.41;
        pesosColombianos= (double) Math.round(pesosColombianos * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + pesosColombianos + " Pesos colombianos");
    }
    public void ConvertirDeLibrasPesosColombianos(double valorRecibido){
        double pesosColombianos= valorRecibido * 5932.87;
        pesosColombianos= (double) Math.round(pesosColombianos * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + pesosColombianos + " Pesos colombianos");
    }
    public void ConvertirDeYenAPesosColombianos(double valorRecibido){
        double pesosColombianos= valorRecibido * 35.2786;
        pesosColombianos= (double) Math.round(pesosColombianos * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + pesosColombianos + " Pesos colombianos");
    }
    public void ConvertirDeWonCoreanoAPesosColombianos(double valorRecibido){
        double pesosColombianos= valorRecibido * 3.6738;
        pesosColombianos= (double) Math.round(pesosColombianos * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + pesosColombianos + " Pesos colombianos");
    }
    public void ConvertirDePesosMexicanosADolar(double valorRecibido){
        double monedaDolar= valorRecibido / 19.63;
        monedaDolar = (double) Math.round(monedaDolar * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaDolar + " Dolares");
    }
    public void ConvertirDePesosMexicanosAEuro(double valorRecibido){
        double monedaEuro= valorRecibido / 20.96;
        monedaEuro = (double) Math.round(monedaEuro * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaEuro + " Euros");
    }
    public void ConvertirDePesosMexicanosALibras(double valorRecibido){
        double monedaLibra= valorRecibido / 24.38;
        monedaLibra= (double) Math.round(monedaLibra * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaLibra + " Libras");
    }
    public void ConvertirDePesosMexicanosAYen(double valorRecibido){
        double monedaYen= valorRecibido / 0.14;
        monedaYen= (double) Math.round(monedaYen * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaYen + " Yen");
    }
    public void ConvertirDePesosMexicanosAWonCoreano(double valorRecibido){
        double monedaWonCoreano = valorRecibido / 0.0015;
        monedaWonCoreano = (double) Math.round(monedaWonCoreano * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaWonCoreano + " Won Sur Coreanos");
    }
    //////////////////////////
    public void ConvertirDeDolarAPesosMexicanos(double valorRecibido){
        double pesosMexicanos= valorRecibido * 19.63;
        pesosMexicanos= (double) Math.round(pesosMexicanos * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + pesosMexicanos + " Pesos Mexicanos");
    }
    public void ConvertirDeEuroAPesosMexicanos(double valorRecibido){
        double pesosMexicanos= valorRecibido * 20.96;
        pesosMexicanos= (double) Math.round(pesosMexicanos * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + pesosMexicanos + " Pesos Mexicanos");
    }
    public void ConvertirDeLibrasPesosMexicanos(double valorRecibido){
        double pesosMexicanos= valorRecibido * 24.38;
        pesosMexicanos= (double) Math.round(pesosMexicanos * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + pesosMexicanos + " Pesos Mexicanos");
    }
    public void ConvertirDeYenAPesosMexicanos(double valorRecibido){
        double pesosMexicanos= valorRecibido * 0.14;
        pesosMexicanos= (double) Math.round(pesosMexicanos * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + pesosMexicanos + " Pesos Mexicanos");
    }
    public void ConvertirDeWonCoreanoAPesosMexicanos(double valorRecibido){
        double pesosMexicanos= valorRecibido * 0.0015;
        pesosMexicanos= (double) Math.round(pesosMexicanos * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + pesosMexicanos + " Pesos Mexicanos");
    }
    ///
    public void ConvertirDePesosArgentinosADolar(double valorRecibido){
        double monedaDolar= valorRecibido / 172.06;
        monedaDolar = (double) Math.round(monedaDolar * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaDolar + " Dolares");
    }
    public void ConvertirDePesosArgentinosAEuro(double valorRecibido){
        double monedaEuro= valorRecibido / 183.60;
        monedaEuro = (double) Math.round(monedaEuro * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaEuro + " Euros");
    }
    public void ConvertirDePesosArgentinosALibras(double valorRecibido){
        double monedaLibra= valorRecibido / 213.62;
        monedaLibra= (double) Math.round(monedaLibra * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaLibra + " Libras");
    }
    public void ConvertirDePesosArgentinosAYen(double valorRecibido){
        double monedaYen= valorRecibido / 1.27;
        monedaYen= (double) Math.round(monedaYen * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaYen + " Yen");
    }
    public void ConvertirDePesosArgentinosAWonCoreano(double valorRecibido){
        double monedaWonCoreano = valorRecibido / 0.13;
        monedaWonCoreano = (double) Math.round(monedaWonCoreano * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaWonCoreano + " Won Sur Coreanos");
    }
    //////////////////////////
    public void ConvertirDeDolarAPesosArgentinos(double valorRecibido){
        double pesosArgentinos= valorRecibido * 172.06;
        pesosArgentinos= (double) Math.round(pesosArgentinos * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + pesosArgentinos + " Pesos Argentinos");
    }
    public void ConvertirDeEuroAPesosArgentinos(double valorRecibido){
        double pesosArgentinos= valorRecibido * 183.60;
        pesosArgentinos= (double) Math.round(pesosArgentinos * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + pesosArgentinos + " Pesos Argentinos");
    }
    public void ConvertirDeLibrasPesosArgentinos(double valorRecibido){
        double pesosArgentinos= valorRecibido * 213.62;
        pesosArgentinos= (double) Math.round(pesosArgentinos * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + pesosArgentinos + " Pesos Argentinos");
    }
    public void ConvertirDeYenAPesosArgentinos(double valorRecibido){
        double pesosArgentinos= valorRecibido * 1.27;
        pesosArgentinos= (double) Math.round(pesosArgentinos * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + pesosArgentinos + " Pesos Argentinos");
    }
    public void ConvertirDeWonCoreanoAPesosArgentinos(double valorRecibido){
        double pesosArgentinos= valorRecibido * 0.13;
        pesosArgentinos= (double) Math.round(pesosArgentinos * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + pesosArgentinos + " Pesos Argentinos");
    }


}
