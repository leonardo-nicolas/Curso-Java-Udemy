package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

//Esta classe NÃO FAZ PARTE da exigência do desafio proposto pelo professor. 
public class Estabelecimento {
	String nomeFantasia;
	String razaoSocial;
	String telefone;
	String cnpj;
	Endereco endereco;
	
	public Estabelecimento(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	
	final List<Cliente> clientes = new ArrayList<Cliente>();
	
	void adicionarCliente(Cliente cliente) {
		clientes.add(cliente);
	}
	
	public int hashCode() {
		return nomeFantasia.length() + 
				razaoSocial.length() + 
				cnpj.length();
	}
	
	public String toString() {
		return razaoSocial;
	}
}
