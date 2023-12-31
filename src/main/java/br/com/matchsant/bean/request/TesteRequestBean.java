package br.com.matchsant.bean.request;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@Named
@RequestScoped
public class TesteRequestBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<String> personagens;
	private List<String> personagemSelecinado = new ArrayList<>();

	@PostConstruct
	public void init() {
		System.out.println("Entrou no PostConstruct do RequestScoped");
		personagens = Arrays.asList("Goku", "Ben 10", "Kurama", "Naruto");
	}

	public void selecionarPersonagem() {
		int index = ThreadLocalRandom.current().nextInt(3);
		String personagem = personagens.get(index);
		personagemSelecinado.add(personagem);
	}

	public List<String> getPersonagemSelecinado() {
		return personagemSelecinado;
	}

	public void setPersonagemSelecinado(List<String> personagemSelecinado) {
		this.personagemSelecinado = personagemSelecinado;
	}

}
