package br.com.inatel.ObserverPattern;
import br.com.inatel.ObserverPattern.frase.impl.Observador;
import br.com.inatel.ObserverPattern.frase.impl.Observavel;

public class ModificaFrase {

    public static void main(String[] args) {

        // Criando o observavel
        Observavel criadorDeFrase = new Observavel();

        //Criando 3 observadores e fazendo a inscrição.
        Observador obs1 = new Observador(1);
        Observador obs2 = new Observador(2);
        Observador obs3 = new Observador(3);

        criadorDeFrase.registraObservador(obs1);
        criadorDeFrase.registraObservador(obs2);
        criadorDeFrase.registraObservador(obs3);

        criadorDeFrase.setNovaFrase("Engenharia de Computacao com o professor Chris sempre me alegra!");

        System.out.println("\n\nNotificando todos os usuarios: ");
        criadorDeFrase.notificaObservadores();
    }
}
