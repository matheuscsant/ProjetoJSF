package br.com.matchsant.bean.estudante;

import java.io.Serializable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import br.com.matchsant.model.Estudante;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;

@Named
@ViewScoped
public class CadastrarEstudanteBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private Estudante estudante = new Estudante();

	private String[] arraysStrings = { "Matheus", "Santos", "Gabriel", "Front-End" };
	private List<String> listStrings = Arrays.asList("Matheus", "Santos", "Gabriel", "Front-End");
	private Set<String> setStrings = new HashSet<>(Arrays.asList("Jorge", "Felipe", "Pedro", "Back-End"));
	private Map<String, String> mapStrings = Map.of("Nome", "Matheus", "Idade", "21", "Email", "matheuszin");

	public Estudante getEstudante() {
		return estudante;
	}

	public void setEstudante(Estudante estudante) {
		this.estudante = estudante;
	}

	public String[] getArraysStrings() {
		return arraysStrings;
	}

	public void setArraysStrings(String[] arraysStrings) {
		this.arraysStrings = arraysStrings;
	}

	public List<String> getListStrings() {
		return listStrings;
	}

	public void setListStrings(List<String> listStrings) {
		this.listStrings = listStrings;
	}

	public Set<String> getSetStrings() {
		return setStrings;
	}

	public void setSetStrings(Set<String> setStrings) {
		this.setStrings = setStrings;
	}

	public Map<String, String> getMapStrings() {
		return mapStrings;
	}

	public void setMapStrings(Map<String, String> mapStrings) {
		this.mapStrings = mapStrings;
	}

}
