package br.senai.sp.jandira.model;

import java.util.Scanner;

 public class Zebra {
    String nome, apelido;
    int idade;
    Scanner teclado = new Scanner(System.in);
    public void cadastrarZebra(){
        System.out.println(" *************** Leão *****************");
        System.out.println(" Informe o Nome : ");
        nome = teclado.nextLine();
        System.out.println("Informe o Apelido:  ");
        apelido = teclado.nextLine();
        System.out.println("Informe a Idade:  ");
        idade = teclado.nextInt();
        System.out.println("**************** Cadastro Concluido ************");


    }

}
