package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class Teste {

	public static void main(String[] args) {


		
		  int[]idades = new int[5]; //inicializa o array com os valores padroes

          for(int i = 0; i < idades.length; i++) {
              idades[i] = i * i;
          }

          for(int i = 0; i < idades.length; i++) {
              System.out.println(idades[i]);
          }
		
	}
}
