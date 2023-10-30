package br.com.matchsant.bean.estudante;

import java.io.Serializable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import br.com.matchsant.model.Estudante;
import jakarta.el.LambdaExpression;
import jakarta.faces.context.FacesContext;
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
	private boolean mostrarNota;
	private boolean mostrarLink;

	public void calcularCubo(LambdaExpression le, long value) {
		long result = (long) le.invoke(FacesContext.getCurrentInstance().getELContext(), value);
		System.out.println("Resultado do cubo tio: " + result);
	}

	public void exibirLink() {
		this.mostrarLink = true;
	}

	public void esconderLink() {
		this.mostrarLink = false;
	}

	public boolean isMostrarLink() {
		return mostrarLink;
	}

	public void setMostrarLink(boolean mostrarLink) {
		this.mostrarLink = mostrarLink;
	}

	public void exibirNotas() {
		this.mostrarNota = true;
	}

	public void esconderNotas() {
		this.mostrarNota = false;
	}

	public boolean isMostrarNota() {
		return mostrarNota;
	}

	public void setMostrarNota(boolean mostrarNota) {
		this.mostrarNota = mostrarNota;
	}

	public void executar() {
		System.out.println("Fazendo uma busca");
		System.out.println("Processando os dados");
		System.out.println("Exibindo os dados");
	}

	public void executar(String parametro) {
		System.out.println("Fazendo uma busca com parametro: " + parametro);
		System.out.println("Processando os dados com parametro: " + parametro);
		System.out.println("Exibindo os dados com parametro: " + parametro);
	}

	public String executarComRetorno(String parametro) {
		return "Teste retorno " + parametro;
	}

	public String irParaOutraPagina(String parametro) {
		return "cadastrar-estudante?faces-redirect=true";
	}

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
