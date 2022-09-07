package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ContaCorrente[] contas = new ContaCorrente[6];
		
	
		
		ContaCorrente cc1 = new ContaCorrente(22,11);
		
		ContaCorrente cc2 = new ContaCorrente(33, 22);
		ContaCorrente cc3 = new ContaCorrente(44, 33);
		ContaCorrente cc4 = new ContaCorrente(55, 44);
		ContaCorrente cc5 = new ContaCorrente(66, 55);
		ContaCorrente cc6 = new ContaCorrente(77, 66);
		
		contas[0] = cc1;
		contas[1]= cc2;
		contas[2]= cc3;
		contas[3]= cc4;
		contas[4]= cc5;
		contas[5]= cc6;
		
		for (int i=0; i<contas.length; i++) {
			System.out.println(contas[i].getAgencia());
		}
		
		ContaCorrente ref = contas[1];
		System.out.println(ref.getAgencia());
		
		Conta[] contaCCouCP = new Conta[2];
		ContaPoupanca cp1 = new ContaPoupanca(88,99);
		ContaCorrente cc7 = new ContaCorrente(10, 11);
		contaCCouCP[0] = cp1;
		contaCCouCP[1] = cc7;
		ContaCorrente ref1 = (ContaCorrente) contaCCouCP[1]; //type cast
		System.out.println(contaCCouCP[0] + " e " + contaCCouCP[1]);
		System.out.println(ref1);
		
		Object[] referencias = new Object[5];
		
		referencias[0] = cc1;
		
		Cliente cliente = new Cliente();
		referencias[2] = cliente;
		
		
		System.out.println(referencias[0]);
		
		
	}

}
