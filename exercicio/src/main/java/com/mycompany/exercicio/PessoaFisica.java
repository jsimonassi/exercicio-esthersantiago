/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio;

/**
 *
 * @author joao.farias
 */
public class PessoaFisica extends Contribuente{
    
    private Double gastoSaude;
    public final Integer BASE_CALCULO = 20000;
        
    public PessoaFisica(){}
    
    public Double getGastoSaude() {
        return gastoSaude;
    }

    public void setGastoSaude(Double gastoSaude) {
        this.gastoSaude = gastoSaude;
    } 
    
    public Double gerarImposto(){
        if(this.getRenda() < this.BASE_CALCULO){
            return (this.getRenda() * 0.15) - (this.getGastoSaude() * 0.5);
        }
        return (this.getRenda() * 0.25) - (this.getGastoSaude() * 0.5);//TODO: Pode gerar imposto negativo?
    }
}
