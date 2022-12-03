package br.com.inatel.ObserverPattern.frase.impl;
import java.util.ArrayList;
import java.util.List;
import br.com.inatel.ObserverPattern.frase.interfaces.iObservavel;

public class Observavel implements iObservavel {
	
	private String[] palavras;
	private int qtdPalavras;
	private int qtdPares;
	private int qtdMaiusculas;
	private List<Observador> pessoa;

	public Observavel() {
		pessoa = new ArrayList<Observador>();
	}

	@Override
	public void registraObservador(Observador obs) {
		pessoa.add(obs);
	}

	@Override
	public void removeObservador(Observador obs) {
		if(pessoa.contains(obs))
			pessoa.remove(obs);
	}
	@Override
	public void notificaObservadores() {
		for (Observador observador : pessoa) {
			observador.update(this);
		}
	}

	private void novasMedidas() {
		notificaObservadores();
	}

	public void setNovaFrase(String frase) {
		System.out.println("\n\n--------------Nova frase--------------n\n");
		splitFrase(frase);
		contaQtdPalavras();
		contaQtdPares();
		contaQtdMaiusculas();
		novasMedidas();
	}

	private void contaQtdPalavras() {
		this.qtdPalavras = palavras.length;
	}

	private void contaQtdPares() {
		int c = 0;

		for(String palavra : palavras){
			if(palavra.length()%2 == 0){
				c++;
			}
		}
		this.qtdPares = c;
	}

	private void contaQtdMaiusculas() {
		int c = 0;
		
		for(String palavra : palavras){
			if(Character.isUpperCase(palavra.charAt(0))) {
				c++;
			}
		}
		this.qtdMaiusculas = c;
	}

	private void splitFrase(String frase) {
		this.palavras = frase.split("\\s+");
	}

	public List<Observador> getClientes() {
		return pessoa;
	}

	public int getQtdPalavras() {
		return qtdPalavras;
	}

	public int getQtdPares() {
		return qtdPares;
	}

	public int getQtdMaiusculas() {
		return qtdMaiusculas;
	}
}
