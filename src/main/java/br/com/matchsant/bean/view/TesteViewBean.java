package br.com.matchsant.bean.view;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;

@Named
@ViewScoped
public class TesteViewBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<String> personagens;
	private List<String> personagemSelecinado = new ArrayList<String>();

	@PostConstruct
	public void init() {
		System.out.println("Entrou no PostConstruct do ViewScoped");
		personagens = Arrays.asList("Freeza", "Luffy", "Buzzer", "Dickon");
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
