package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeContas;
import br.com.bytebank.banco.modelo.GuardadorDeReferencias;


public class TesteGuardadorDeContas {

	public static void main(String[] args) {
		
		GuardadorDeReferencias guardador = new GuardadorDeReferencias();
		
		Conta cc = new ContaCorrente(22,11);
		Conta cc1 = new ContaCorrente(33,44);
		
		guardador.adiciona(cc);
		guardador.adiciona(cc1);
		guardador.adiciona("Danilo");
		

		
        int tamanho = guardador.getQuantidadeDeElementos();
		
		System.out.println(tamanho);
		
		Object ref = (Object) guardador.getReferencia(2);
		System.out.println(ref);
		
	}

}
