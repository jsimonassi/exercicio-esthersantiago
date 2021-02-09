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

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        List<Contribuente> contribuentes = new ArrayList<>();
        Boolean fim = false;
        
        try{
        while(!fim){
            System.out.println();
            System.out.println("Escolha uma opção: ");
            System.out.println("Adicionar Pessoa Física --- 1 ");
            System.out.println("Adicionar Pessoa Jurídica - 2 ");
            System.out.println("Sair e gerar impostos ----- 3: ");
            System.out.println();

            
            int opcao = scanner.nextInt();
            
            switch(opcao){
                case 1:
                    PessoaFisica pf = new PessoaFisica();
                    System.out.println("Informe o nome: ");
                    pf.setNome(scanner.next());
                    System.out.println("Informe a renda: ");
                    pf.setRenda(scanner.nextDouble());
                    System.out.println("Informe o gasto com a saúde: ");
                    pf.setGastoSaude(scanner.nextDouble());
                    contribuentes.add(pf);
                    break;
                   
                case 2:
                    PessoaJuridica pj = new PessoaJuridica();
                    System.out.println("Informe o nome: ");
                    pj.setNome(scanner.next());
                    System.out.println("Informe a renda: ");
                    pj.setRenda(scanner.nextDouble());
                    System.out.println("Informe o número de funcionários: ");
                    pj.setnFuncionarios(scanner.nextInt());
                    contribuentes.add(pj);
                    break;
                
                case 3:
                    mostrarImpostos(contribuentes);
                    contribuentes.clear();
                    fim = true;
                   break;
                   
                default:
                    System.out.println("Opção inválida, tente novamente.");
                    break;      
            }
        }
        }catch(Exception e){
            System.out.println("Erro: " + e.getMessage());
        }
    }
    
    private static void mostrarImpostos(List<Contribuente> contribuentes){
         System.out.println("--------------------------------------------");
        for(Object obj : contribuentes){
            if(obj instanceof PessoaFisica){
                PessoaFisica pf = (PessoaFisica) obj;
                System.out.println("Nome:" + pf.getNome() + " - Imposto R$: " + pf.gerarImposto());
            }else{
                PessoaJuridica pj = (PessoaJuridica) obj;
                System.out.println("Nome:" + pj.getNome() + " - Imposto R$: " + pj.gerarImposto());
            }
        }
    }    
}
