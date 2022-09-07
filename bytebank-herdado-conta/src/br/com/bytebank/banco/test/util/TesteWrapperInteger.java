package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {

        public static void main(String[] args) {

                int[] idades = new int[5];

                String[] nomes = new String[5];

                int idade = 28;//Integer
                Integer idadeRef = Integer.valueOf(29); //boxing
                int valor = idadeRef.intValue(); //unboxing
                
                List<Integer> numeros = new ArrayList<Integer>();
                numeros.add(29);
                
                System.out.println(numeros);
                //Se trocarmos idade por 29, no método add(), ainda assim o código continuará funcionando, 
                //pois o Java cria um objeto para o 29, automaticamente, e armazena sua referência no array. 
                //A ideia é auxiliar a transformar um primitivo em objeto, e vice versa. 
                //Esta transformação, que ocorre sempre automaticamente, é chamada de Autoboxing.
                //A TRANSFORMAÇÃO DE PRIMITIVO EM OBJETO É NECESSÁRIA PARA FUNCIONAR A ARRAYLIST
                
                
                Integer example = Integer.valueOf(40); //boxing
                
                System.out.println(example.doubleValue()); // para transformar o int em double.
                
                //Convertendo uma String de uma Array em int
                String [] string = new String [1];
                
                string[0]= "10";
                
                String s = string[0];
                
                //Integer number = Integer.valueOf(s); devolve uma referência 
                
                int number = Integer.parseInt(s); //devolve um primitivo
                
                System.out.println(number);
                
                

        }
}