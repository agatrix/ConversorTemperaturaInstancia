package br.edu.ifnmg.conversortemperaturainstancia;

/**
 * Classe que converter um valor de uma medida de 
 * temperatura para outra; Utilizando membros dinâmicos.
 * @author Gustavo
 */
public class ConversorTemperaturaInstancia {
    private double valor;
    
    //<editor-fold defaultstate="collapsed" desc="Métodos Padrões">
    
    public ConversorTemperaturaInstancia(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    //</editor-fold>
    
    /**
     * Métodos de converter um valor de C para K
     * @return
     * @throws Exception 
     */
    public double celsiusParaK() throws Exception {
        if(this.valor < -273.15)
            throw new Exception("O valor passado é menor que o Zero Absoluto");
        
        return (this.valor + 273.15);
    }
    /**
     * Métodos de converter um valor de C para F
     * @return
     * @throws Exception 
     */
     public double celsiusParaF() throws Exception{
        if(this.valor < -273.15)
            throw new Exception("O valor passado é menor que o Zero Absoluto");
    
        return (this.valor*9/5) + 32;
    }
    
    /**
     * Métodos de converter um valor de F para C
     * @return
     * @throws Exception 
     */
    public double fahrenheitParaC() throws Exception {
        if(this.valor < -459.67)
            throw new Exception("O valor passado é menor que o Zero Absoluto");
          
        return ((this.valor - 32) * 5/9);
    }
    /**
     * Métodos de converter um valor de F para K
     * @return
     * @throws Exception 
     */
    public double fahrenheitParaK() throws Exception{
        if(this.valor < -459.67)
            throw new Exception("O valor passado é menor que o Zero Absoluto");
        
        return (this.valor-32)*5/9+273.15;
    }
    
    /**
     * Métodos de converter um valor de K para C
     * @return
     * @throws Exception 
     */
    public double kelvinParaC() throws Exception{
        if(this.valor < 0)
            throw new Exception("O valor passado é menor que o zero absoluto");
         
        return this.valor-273.15;
    }
    /**
     * Métodos de converter um valor de K para F
     * @return
     * @throws Exception 
     */
    public double kelvinParaF() throws Exception{
        if(this.valor < 0)
            throw new Exception("O valor passado é menor que o Zero Absoluto");
        
        return (this.valor - 273.15)*9/5+32;
    }
    
}
