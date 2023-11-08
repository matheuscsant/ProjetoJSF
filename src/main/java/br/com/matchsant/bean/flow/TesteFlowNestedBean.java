package br.com.matchsant.bean.flow;

import java.io.Serializable;

import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.faces.flow.FlowScoped;
import jakarta.inject.Named;

@Named
@FlowScoped(value = "pendencies")
public class TesteFlowNestedBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private String userName;
	private String userSurname;

	public String validarUsuario() {
		System.out.println(" Fazendo consulta no SERASA");
		System.out.println(" Fazendo consulta no SPC");
		System.out.println(" Pedindo a permissão de Deus");
		System.out.println(" Sacrificando um bode");
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuário não passou nas pendências", "Algum detalhe"));
		return null;
//		return "proceedToRegistration3";
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserSurname() {
		return userSurname;
	}

	public void setUserSurname(String userSurname) {
		this.userSurname = userSurname;
	}

}
