package br.com.inatel.ObserverPattern;
import br.com.inatel.ObserverPattern.frase.impl.Observador;
import br.com.inatel.ObserverPattern.frase.impl.Observavel;
import org.junit.Test;
import static org.junit.Assert.*;

public class TesteObserver {

    @Test
    public void testeInscritos(){
        Observavel criadorDeFrase = new Observavel();
        Observador obs1 = new Observador(1);
        criadorDeFrase.registraObservador(obs1);
        assertFalse(criadorDeFrase.getClientes().isEmpty());
    }

    @Test
    public void teste2Inscritos(){
        Observavel criadorDeFrase = new Observavel();
        Observador obs1 = new Observador(1);
        Observador obs2 = new Observador(2);
        Observador obs3 = new Observador(3);

        criadorDeFrase.registraObservador(obs1);
        criadorDeFrase.registraObservador(obs2);
        criadorDeFrase.registraObservador(obs3);
        criadorDeFrase.removeObservador(obs3);

        assertEquals(2, criadorDeFrase.getClientes().size());
    }

    @Test
    public void testeContarPalavrasComCaracterPar(){
        Observavel criadorDeFrase = new Observavel();
        criadorDeFrase.setNovaFrase("Computacao é o curso mais nota 5 estrelas do inatel");
        assertEquals(2, criadorDeFrase.getQtdPares());
    }

    @Test
    public void testeContarPalavrasComInicialMaiuscula(){
        Observavel criadorDeFrase = new Observavel();
        criadorDeFrase.setNovaFrase("Computacao é o curso mais nota 5 estrelas do inatel");
        assertEquals(1, criadorDeFrase.getQtdMaiusculas());
    }
}
