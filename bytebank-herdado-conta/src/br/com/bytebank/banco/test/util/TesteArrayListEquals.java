package br.com.bytebank.banco.test.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {
	
		//Generics
	
		ArrayList<Conta> lista = new ArrayList<Conta>(); //especificando que nessa ArrayList só pode ter conta
		Conta cc = new ContaCorrente(22,11);
		lista.add(cc);
		
		Conta cc2 = new ContaCorrente(22,22);
		lista.add(cc2);
		
		
		
		Conta cc3 = new ContaCorrente(22,22);
		
		boolean existe = lista.contains(cc3);
		
		System.out.println("Já Existe? " + existe);
		
		
	
		//foreach para iterar a ArrayList
		for (/*Object object/* /*Não precisa porque lá em cima sinalizei <Conta>*/ Conta conta : lista) {
			System.out.println(conta);
		}
		
		
	}

}
