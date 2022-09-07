package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteOutrosWrappers {

        public static void main(String[] args) {

          
                
                Integer idadeRef = Integer.valueOf(40); //Autoboxing
                
                System.out.println(idadeRef.intValue()); // Unboxing
                
                
                Double dRef = Double.valueOf(3.2); //Autoboxing
                System.out.println(dRef.doubleValue()); //Unboxing
                
                
                Boolean bRef = Boolean.TRUE;
                System.out.println(bRef.booleanValue()); 
                
                Number number = Float.valueOf(35.7f); //Integer, Float, Double etc extendem a classe Number, que é a referência mais genérica.
                
               List<Number> lista = new ArrayList<>(); //Não precisa repitar Number no segundo <>
                
                
                

        }
}