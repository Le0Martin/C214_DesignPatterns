package br.com.inatel.ObserverPattern.frase.impl;
import br.com.inatel.ObserverPattern.frase.interfaces.iObservador;
public class Observador implements iObservador {
	int id;
	public Observador(int id) {

		this.id = id;
	}
	@Override
	public void update(Observavel obs) {
		System.out.println("Usuarios: "+ this.id);

		System.out.println("Qtd de palavras: " + obs.getQtdPalavras());

		System.out.println("Qtd de palavras com quantidade de pares de caracteres: " + obs.getQtdPares());

		System.out.println("Qtd de palavras começadas com maiusculas:" + obs.getQtdMaiusculas());
	}
}