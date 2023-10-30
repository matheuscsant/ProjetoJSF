package br.com.matchsant.bean.application;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

@Named
@ApplicationScoped
public class TesteApplicationBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<String> categoriaList;

	@PostConstruct
	public void init() {
		System.out.println("Entrou no PostConstruct do ApplicationScoped");
		categoriaList = Arrays.asList("Animado", "RPG", "SCI-FI", "Terror");
	}
	
	public void mudarList() {
		categoriaList = Arrays.asList("Animado", "RPG", "SCI-FI", "Terror", "Desenho");
	}

	public List<String> getCategoriaList() {
		return categoriaList;
	}

	public void setCategoriaList(List<String> categoriaList) {
		this.categoriaList = categoriaList;
	}

}
