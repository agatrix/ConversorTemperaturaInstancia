/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.edu.ifnmg.conversortemperaturainstancia;

/**
 * Classe que converter um valor de uma medida de 
 * temperatura para outra; Utilizando membros dinâmicos.
 * @author agatha
 */
public class ConversorTemperaturaInstancia {
    private double valor;
    
    public ConversorTemperaturaInstancia(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public double celsiusParaK() throws Exception {
        if(this.valor < -273.15)
            throw new Exception("O valor passado é menor que o Zero Absoluto");
        
        return (this.valor + 273.15);
    }
    
    
    
    
}
