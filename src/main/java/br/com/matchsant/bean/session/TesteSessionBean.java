package br.com.matchsant.bean.session;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Named;

@Named
@SessionScoped
public class TesteSessionBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<String> personagens;
	private List<String> personagemSelecinado = new ArrayList<String>();

	@PostConstruct
	public void init() {
		System.out.println("Entrou no PostConstruct do SessionScoped");
		personagens = Arrays.asList("Vegeta", "Gaara", "Madara", "Alien");
	}

	public String logout() {
		FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
		return "session?faces-redirect=true";
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
