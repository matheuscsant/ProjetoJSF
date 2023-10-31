package br.com.matchsant.bean.conversation;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import jakarta.enterprise.context.Conversation;
import jakarta.enterprise.context.ConversationScoped;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named
@ConversationScoped
// Transient
public class TesteConversationBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<String> personagens;
	private List<String> personagemSelecinado = new ArrayList<String>();

	@Inject
	private Conversation conversation;

	public void init() {
		System.out.println("Entrou no PostConstruct do ConversationScoped");
		personagens = Arrays.asList("Java", "MySQL", "PostgreSQL");
		if (conversation.isTransient()) {
			// Long Running
			conversation.begin();
			System.out.println("Iniciando conversation scoped, ID = " + conversation.getId());
		}
	}

	public void endConversation() {
		if (!conversation.isTransient()) {
			conversation.end();
		}
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
