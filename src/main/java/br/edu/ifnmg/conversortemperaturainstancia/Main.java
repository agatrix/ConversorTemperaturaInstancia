package br.edu.ifnmg.conversortemperaturainstancia;

/**
 *
 * @author Gustavo
 */
public class Main {
    public static void main(String[] args) {
        
        ConversorTemperaturaInstancia valor = new ConversorTemperaturaInstancia(0);
        System.out.println("Valor: "+valor.getValor());
        
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
    }
}

