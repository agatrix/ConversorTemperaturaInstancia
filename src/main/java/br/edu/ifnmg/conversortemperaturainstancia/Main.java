package br.edu.ifnmg.conversortemperaturainstancia;

/**
 *
 * @author Gustavo
 */
public class Main {
    public static void main(String[] args) {
        
        ConversorTemperaturaInstancia valor = new ConversorTemperaturaInstancia(-5);
        System.out.println("Valor: "+valor.getValor());
        
        //<editor-fold defaultstate="collapsed" desc="Conversor de Celsius">
        try{
            System.out.println("Celsius para K: "+valor.celsiusParaK());
        }
        catch (Exception e){
            System.out.println("Erro: "+e.getMessage());
        }
        try{
            System.out.println("Celsius para F: "+valor.celsiusParaF());
        }
        catch (Exception e){
            System.out.println("Erro: "+e.getMessage());
        }
        //</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc="Conversor de Fahrenheit">
        try{
            System.out.println("fahrenheit para C: "+valor.fahrenheitParaC());
        }
        catch (Exception e){
            System.out.println("Erro: "+e.getMessage());
        }
        try{
            System.out.println("fahrenheit para K: "+valor.fahrenheitParaK());
        }
        catch (Exception e){
            System.out.println("Erro: "+e.getMessage());
        }
        //</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc="Conversor de Kelvin">
         try{
            System.out.println("Kelvin para C: "+valor.kelvinParaC());
        }
        catch (Exception e){
            System.out.println("Erro: "+e.getMessage());
        }
        try{
            System.out.println("Kelvin para F: "+valor.kelvinParaF());
        }
        catch (Exception e){
            System.out.println("Erro: "+e.getMessage());
        }
        //</editor-fold>
    }
}

