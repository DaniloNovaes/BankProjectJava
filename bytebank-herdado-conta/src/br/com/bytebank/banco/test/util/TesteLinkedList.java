package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.LinkedList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteLinkedList {

	public static void main(String[] args) {
	
		//Generics
	
		LinkedList<Conta> lista = new LinkedList<Conta>(); //especificando que nessa ArrayList só pode ter conta
		Conta cc = new ContaCorrente(22,11);
		lista.add(cc);
		
		Conta cc2 = new ContaCorrente(33,44);
		lista.add(cc2);
		
		Conta cc3 = new ContaCorrente(55,66);
		lista.add(cc3);
		
		Conta cc4 = new ContaCorrente(77,88);
		lista.add(cc4);
		
		System.out.println(lista.size());
		
		Conta ref = /*(Conta) Não precisa fazer o cast porque lá em cima sinalizei <Conta>*/ lista.get(0);
		System.out.println(ref);
		System.out.println(ref.getNumero());
		
		lista.remove(0);
		System.out.println("Tamanho: " + lista.size());
		
		
		for (int i=0; i <lista.size(); i++) {
			//Object oRef = lista.get(i);
			//System.out.println(oRef);
			System.out.println(lista.get(i));
		}
		
		System.out.println("----------------------");
		//foreach para iterar a ArrayList
		for (/*Object object/* /*Não precisa porque lá em cima sinalizei <Conta>*/ Conta conta : lista) {
			System.out.println(conta);
		}
		
	
		
	}

}
