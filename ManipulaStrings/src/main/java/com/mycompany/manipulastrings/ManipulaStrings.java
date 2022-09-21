
package com.mycompany.manipulastrings;

import java.util.Scanner;


public class ManipulaStrings {
    public static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) {
        int op;
        do{
            System.out.println("_________Menu_________");
            System.out.println("1 ---> Tamanho String");
            System.out.println("2 ---> Arvore de letras");
            System.out.println("3 ---> Capitalização de letras");
            System.out.println("4 ---> Capitalização de letras");
            
            System.out.println("0 ---> Sair");
            System.out.println("Insira a opção pretendida");
            op = ler.nextInt();
            switch(op){
                case 0: break;
                case 1: 
                    System.out.println("A string Inserida tem "+
                    ExerciciosStrings.contaCaracteres()+" caracteres");
                    break;
                case 2 : 
                    ExerciciosStrings.arvoreCharAt();
                    break;
                case 3: 
                    ExerciciosStrings.capitalizaLetras(); 
                    break;
                case 4:
                default:
                    System.out.println("Insira opção valida");
            }
        }while(op!=0);
    }
}
