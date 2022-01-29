package br.dalmo.padroes.test.gof.singleton;

/**
 * Singleton "apressado".
 * 
 * @author falvojr, Reprodução Dalmo
 */
public class SingletonEager {

	private static SingletonEager instancia = new SingletonEager();
	
	private SingletonEager() {
		super();
	}
	
	public static SingletonEager getInstancia() {
		return instancia;
	}
}
