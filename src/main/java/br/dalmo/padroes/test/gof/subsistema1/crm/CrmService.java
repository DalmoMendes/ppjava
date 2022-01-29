package br.dalmo.padroes.test.gof.subsistema1.crm;

public class CrmService {

	private CrmService() {
		super();
	}
	
	public static void gravarCliente(String nome, String cep, String cidade, String estado) {
		System.out.println("Sucesso! Cliente salvo no CRM:");
		System.out.println("--------------------------------------------->");
		System.out.println("Nome: " + nome);
		System.out.println("CEP:" + cep);
		System.out.println("Cidade:"  + cidade);
		System.out.println("Estado:" + estado);
		System.out.println("--------------------------------------------->");
	}
}
