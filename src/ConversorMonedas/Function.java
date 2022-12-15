package ConversorMonedas;

import javax.swing.*;

public class Function {
    ConvertirMonedas monedas = new ConvertirMonedas();
    Principal principal = new Principal();
    public void ConvertirMonedas( double valorRecibido){
        Object opcion= (JOptionPane.showInputDialog(null, "Elige la moneda a la que deseas convertir tu dinero", "Monedas",JOptionPane.PLAIN_MESSAGE, null, new Object[]{
                "De Bolivianos a Dólar","De Bolivianos a Euro", "De Bolivianos a Libras", "De Bolivianos a Yen", "De Bolivianos a Won Coreano",
                "De Dólar a Bolivianos", "De Euro a Bolivianos", "De Libras a Bolivianos", "De Yen a Bolivianos", "De Won Coreano a Bolivianos",
                "De Pesos a Dólar","De Pesos a Euro", "De Pesos a Libras", "De Pesos a Yen", "De Pesos a Won Coreano",
                "De Dólar a Pesos", "De Euro a Pesos", "De Libras a Pesos", "De Yen a Pesos", "De Won Coreano a Pesos",
                "De Pesos Mexicanos a Dólar","De Pesos Mexicanos a Euro", "De Pesos Mexicanos a Libras", "De Pesos Mexicanos a Yen", "De Pesos Mexicanos a Won Coreano",
                "De Dólar a Pesos Mexicanos", "De Euro a Pesos Mexicanos", "De Libras a Pesos Mexicanos", "De Yen a Pesos Mexicanos", "De Won Coreano a Pesos Mexicanos",
                "De Pesos Argentinos a Dólar", "De Pesos Argentinos a Euro", "De Pesos Argentinos a Libras",  "De Pesos Argentinos a Yen", "De Pesos Argentinos a Won Coreano",
                "De Dólar a Pesos Argentinos", "De Euro a Pesos Argentinos", "De Libras a Pesos Argentinos", "De Yen a Pesos Argentinos", "De Won Coreano a Pesos Argentinos",

        }, "Seleccion"));

        if (opcion!= null){
            String op = opcion.toString();
            switch (op){
                case "De Bolivianos a Dólar":
                    monedas.ConvertirDeBolivianosADolar(valorRecibido);
                    break;
                case "De Bolivianos a Euro":
                    monedas.ConvertirDeBolivianosAEuro(valorRecibido);
                    break;
                case "De Bolivianos a Libras":
                    monedas.ConvertirDeBolivianosALibras(valorRecibido);
                    break;
                case "De Bolivianos a Yen":
                    monedas.ConvertirDeBolivianosAYen(valorRecibido);
                    break;
                case "De Bolivianos a Won Coreano":
                    monedas.ConvertirDeBolivianosAWonCoreano(valorRecibido);
                    break;
                case "De Dólar a Bolivianos":
                    monedas.ConvertirDeDolarABoliviano(valorRecibido);
                    break;
                case "De Euro a Bolivianos":
                    monedas.ConvertirDeEuroABoliviano(valorRecibido);
                    break;
                case "De Libras a Bolivianos":
                    monedas.ConvertirDeLibrasABoliviano(valorRecibido);
                    break;
                case "De Yen a Bolivianos":
                    monedas.ConvertirDeYenABoliviano(valorRecibido);
                    break;
                case "De Won Coreano a Bolivianos":
                    monedas.ConvertirDeWonCoreanoABoliviano(valorRecibido);
                    break;
                case "De Pesos a Dólar":
                    monedas.ConvertirPesosColombianosADolar(valorRecibido);
                    break;
                case "De Pesos a Euro":
                    monedas.ConvertirDePesosColombianosAEuro(valorRecibido);
                    break;
                case "De Pesos a Libras":
                    monedas.ConvertirDePesosColombianosALibras(valorRecibido);
                    break;
                case "De Pesos a Yen":
                    monedas.ConvertirDePesosColombianosAYen(valorRecibido);
                    break;
                case "De Pesos a Won Coreano":
                    monedas.ConvertirDePesosColombianosAWonCoreano(valorRecibido);
                    break;
                case "De Dólar a Pesos":
                    monedas.ConvertirDeDolarAPesosColombianos(valorRecibido);
                    break;
                case "De Euro a Pesos":
                    monedas.ConvertirDeEuroAPesosColombianos(valorRecibido);
                    break;
                case "De Libras a Pesos":
                    monedas.ConvertirDeLibrasPesosColombianos(valorRecibido);
                    break;
                case "De Yen a Pesos":
                    monedas.ConvertirDeYenAPesosColombianos(valorRecibido);
                    break;
                case "De Won Coreano a Pesos":
                    monedas.ConvertirDeWonCoreanoAPesosColombianos(valorRecibido);
                    break;
                case "De Pesos Mexicanos a Dólar":
                    monedas.ConvertirDePesosMexicanosADolar(valorRecibido);
                    break;
                case "De Pesos Mexicanos a Euro":
                    monedas.ConvertirDePesosMexicanosAEuro(valorRecibido);
                    break;
                case "De Pesos Mexicanos a Libras":
                    monedas.ConvertirDePesosMexicanosALibras(valorRecibido);
                    break;
                case "De Pesos Mexicanos a Yen":
                    monedas.ConvertirDePesosMexicanosAYen(valorRecibido);
                    break;
                case "De Pesos Mexicanos a Won Coreano":
                    monedas.ConvertirDePesosMexicanosAWonCoreano(valorRecibido);
                    break;
                case "De Dólar a Pesos Mexicanos":
                    monedas.ConvertirDeDolarAPesosMexicanos(valorRecibido);
                    break;
                case "De Euro a Pesos Mexicanos":
                    monedas.ConvertirDeEuroAPesosMexicanos(valorRecibido);
                    break;
                case "De Libras a Pesos Mexicanos":
                    monedas.ConvertirDeLibrasPesosMexicanos(valorRecibido);
                    break;
                case "De Yen a Pesos Mexicanos":
                    monedas.ConvertirDeYenAPesosMexicanos(valorRecibido);
                    break;
                case "De Won Coreano a Pesos Mexicanos":
                    monedas.ConvertirDeWonCoreanoAPesosMexicanos(valorRecibido);
                    break;
                case "De Pesos Argentinos a Dólar":
                    monedas.ConvertirDePesosArgentinosADolar(valorRecibido);
                    break;
                case "De Pesos Argentinos a Euro":
                    monedas.ConvertirDePesosArgentinosAEuro(valorRecibido);
                    break;
                case "De Pesos Argentinos a Libras":
                    monedas.ConvertirDePesosArgentinosALibras(valorRecibido);
                    break;
                case "De Pesos Argentinos a Yen":
                    monedas.ConvertirDePesosArgentinosAYen(valorRecibido);
                    break;
                case "De Pesos Argentinos a Won Coreano":
                    monedas.ConvertirDePesosArgentinosAWonCoreano(valorRecibido);
                    break;
                case "De Dólar a Pesos Argentinos":
                    monedas.ConvertirDeDolarAPesosArgentinos(valorRecibido);
                    break;
                case "De Euro a Pesos Argentinos":
                    monedas.ConvertirDeEuroAPesosArgentinos(valorRecibido);
                    break;
                case "De Libras a Pesos Argentinos":
                    monedas.ConvertirDeLibrasPesosArgentinos(valorRecibido);
                    break;
                case "De Yen a Pesos Argentinos":
                    monedas.ConvertirDeYenAPesosArgentinos(valorRecibido);
                    break;
                case "De Won Coreano a Pesos Argentinos":
                    monedas.ConvertirDeWonCoreanoAPesosArgentinos(valorRecibido);
                    break;


            }
        }else {
            System.out.println("HOla mundo");
            JOptionPane.showMessageDialog(null, "Valor no valido, tienes que elegir una opción correcta", "Validación", JOptionPane.ERROR_MESSAGE);
            principal.main(null);
        }
    }
}
