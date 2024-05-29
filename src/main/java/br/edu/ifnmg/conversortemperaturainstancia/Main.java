package br.edu.ifnmg.conversortemperaturainstancia;

/**
 *
 * @author Gustavo
 */
public class Main {
    public static void main(String[] args) {
        
        ConversorTemperaturaInstancia valor = new ConversorTemperaturaInstancia(0);
        //System.out.println(valor.getValor());
        
        try{
            System.out.println(valor.celsiusParaK());
        }
        catch (Exception e){
            System.out.println("Erro: "+e.getMessage());
        }
        
    }
}
