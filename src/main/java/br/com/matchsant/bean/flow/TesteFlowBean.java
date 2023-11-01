package br.com.matchsant.bean.flow;

import java.io.Serializable;

import jakarta.faces.flow.FlowScoped;
import jakarta.inject.Named;

@Named
@FlowScoped(value = "registration")
public class TesteFlowBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private String nome;
	private String sobrenome;
	private String endereco;

	public String salvar() {
		System.out.println("Salvando no banco de dados para encerrar o FlowScoped");
		System.out.println("Nome: " + nome);
		System.out.println("Sobrenome: " + sobrenome);
		System.out.println("Nome: " + endereco);
//		return "exitToInicio";
		return "exitToRequest";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobreNome) {
		this.sobrenome = sobreNome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

}
