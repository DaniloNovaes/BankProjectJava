package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;


public class TesteOrdenacao {

        public static void main(String[] args) {

        	Conta cc1 = new ContaCorrente(22, 33);
            Cliente clienteCC1 = new Cliente();
            clienteCC1.setNome("Nico");
            cc1.setTitular(clienteCC1);
            cc1.deposita(333.0);

            Conta cc2 = new ContaPoupanca(22, 44);
            Cliente clienteCC2 = new Cliente();
            clienteCC2.setNome("Guilherme");
            cc2.setTitular(clienteCC2);
            cc2.deposita(444.0);

            Conta cc3 = new ContaCorrente(22, 11);
            Cliente clienteCC3 = new Cliente();
            clienteCC3.setNome("Paulo");
            cc3.setTitular(clienteCC3);
            cc3.deposita(111.0);

            Conta cc4 = new ContaPoupanca(22, 22);
            Cliente clienteCC4 = new Cliente();
            clienteCC4.setNome("Ana");
            cc4.setTitular(clienteCC4);
            cc4.deposita(222.0);

                List<Conta> lista = new ArrayList<>();
                lista.add(cc1);
                lista.add(cc2);
                lista.add(cc3);
                lista.add(cc4);
                
                
                for (Conta conta : lista) {
					System.out.println(conta + ", " + conta.getTitular().getNome()); //IMPRIMIR A CONTA É CHAMAR TOSTRING DEBAIXO DOS PANOS
					
				}
                
                //JEITO MAIS EXTENSO
                
                //NumeroDaContaComparator comparator = new NumeroDaContaComparator();
                //lista.sort(comparator);
                //TitularDaContaComparator comparatorSring = new TitularDaContaComparator(); 
                //lista.sort(comparatorSring);
                
                //SIMPLIFICADO
                
                //lista.sort(new NumeroDaContaComparator());
                
                //lista.sort(new TitularDaContaComparator()); //Ordem Alfabética
                
                Collections.sort(lista); //utilizando a implementação na CONTA e criando o método compareto na CONTA ORDEM NATURAL
                /* A interface Comparable exige uma implementação do método compareTo, que precisa ser chamado 
                 * pelo algoritmo interno do método sort() da lista.*/
                
                //lista.sort(new SaldoDaContaComparator()); //Criando a classe separada aqui embaixo
        
                
                
                
                System.out.println("------------------------------");

                for (Conta conta : lista) {
					System.out.println(conta + ", " + conta.getTitular().getNome()); //IMPRIMIR A CONTA É CHAMAR TOSTRING DEBAIXO DOS PANOS
					
				}
                
                Collections.reverse(lista);
                
               // Collections.shuffle(lista); //aleatório
               // Collections.rotate(lista, 5);//rotacionar
                
                System.out.println("------------------------------");

                for (Conta conta : lista) {
					System.out.println(conta + ", " + conta.getTitular().getNome()); //IMPRIMIR A CONTA É CHAMAR TOSTRING DEBAIXO DOS PANOS
					
				}
                
        }

}


class TitularDaContaComparator implements Comparator<Conta>{

	@Override
	public int compare(Conta c1, Conta c2) {
		
		String nomeC1 = c1.getTitular().getNome();
		String nomeC2 = c2.getTitular().getNome();
		return nomeC1.compareTo(nomeC2);
		
	}
	
}

class SaldoDaContaComparator implements Comparator<Conta>{

	@Override
	public int compare(Conta c1, Conta c2) {
		
		return Double.compare(c1.getSaldo(), c2.getSaldo());
	}
	
}

class NumeroDaContaComparator implements Comparator<Conta>{
//FUNCTION OBJECT - um objeto que criamos para encapsular uma 
//função ou método. As classes anônimas facilitam
//um pouco a criação desses objetos.
	@Override
	public int compare(Conta c1, Conta c2) {
		
		
	return Integer.compare(c1.getNumero(), c2.getNumero());

//return c1.getNumero() - c2.getNumero();
		
//A linha acima faz a mesma coisa que a linha abaixo
		
/**		if (c1.getNumero() < c2.getNumero()) {
			return -1;
		}
		
		if(c1.getNumero() > c2.getNumero()) {
			return 1;
		}
		return 0;*/
	} 



}