
package com.mycompany.manipulastrings;


class ExerciciosStrings {

    
    static String s,s1;
    static void leStrings(String texto){
            System.out.println(texto);
        s = ManipulaStrings.ler.next();
        s1 = ManipulaStrings.ler.nextLine();
        s = s + s1;  
    }
    static int contaCaracteres() {
        leStrings("Insira um texto");
        return s.length();
    }

    static void arvoreCharAt() {
        int x,y;
        leStrings("Insira uma palavra");
        for (x=0;x<s.length();x++){
            for(y=0;y<=x;y++){
                System.out.print(s.charAt(y));
            }
            System.out.println();
        }
        for(x=s.length()-1;x>=0;x--){
           for(y=0;y<x;y++){
                System.out.print(s.charAt(y));
            }
            System.out.println();
        }
        }
    //static String v;
    static void capitalizaLetras() {
        leStrings("Insira um texto em letra minuscula");
        System.out.println(s.toUpperCase());
        leStrings("Insira um texto em letra maiuscula");
        System.out.println(s.toLowerCase());
    }
    
    }
