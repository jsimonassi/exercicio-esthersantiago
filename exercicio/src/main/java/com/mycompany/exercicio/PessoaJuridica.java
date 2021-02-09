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
public class PessoaJuridica extends Contribuente{
    
    private Integer nFuncionarios;
    public final Integer BASE_nFUNCIONARIOS = 10;
    
    public PessoaJuridica() {}

    public Integer getnFuncionarios() {
        return nFuncionarios;
    }

    public void setnFuncionarios(Integer nFuncionarios) {
        this.nFuncionarios = nFuncionarios;
    }
    

    public Double gerarImposto(){
        if(this.getnFuncionarios() < this.BASE_nFUNCIONARIOS){
            return (this.getRenda() * 0.16);
        }
        return (this.getRenda() * 0.14);
    }
}
