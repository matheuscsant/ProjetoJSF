package br.com.matchsant.flowbuilder;

import java.io.Serializable;

import jakarta.enterprise.inject.Produces;
import jakarta.faces.flow.Flow;
import jakarta.faces.flow.builder.FlowBuilder;
import jakarta.faces.flow.builder.FlowBuilderParameter;
import jakarta.faces.flow.builder.FlowDefinition;

public class NewRegistrationFlowBuilder implements Serializable {

	private static final long serialVersionUID = 1L;

	@Produces
	@FlowDefinition
	public Flow defineFlow(@FlowBuilderParameter FlowBuilder flowBuilder) {
		String flowId = "newregistration";
		flowBuilder.id("", flowId);
		flowBuilder.viewNode(flowId, "/newregistration/newregistration.xhtml").markAsStartNode();
		flowBuilder.viewNode(flowId, "/newregistration/newregistration2.xhtml");
		flowBuilder.viewNode(flowId, "/newregistration/newregistration3.xhtml");

		// Switch
		flowBuilder.switchNode("newRegistrationPage2").defaultOutcome(flowId).switchCase()
				.condition("#{not empty testeFlowBuilderBean.nome and not empty testeFlowBuilderBean.sobrenome}")
				.fromOutcome("newregistration2");

		flowBuilder.flowCallNode("callNewPendencies").flowReference("", "newpendencies").outboundParameter("userName",
				"#{testeFlowBuilderBean.nome}");
		flowBuilder.flowCallNode("callNewPendencies").flowReference("", "newpendencies")
				.outboundParameter("userSurname", "#{testeFlowBuilderBean.sobrenome}");

		flowBuilder.returnNode("exitToNewInicio").fromOutcome("/inicioflow.xhtml");
		flowBuilder.returnNode("exitToNewRequest").fromOutcome("/request.xhtml");
		flowBuilder.finalizer("#{testeFlowBuilderBean.salvar}");
//		System.out.println("\n\n\nPASSOU NA DEFINIÇÃO DO FLOW BUILDER\n\n\n");
		return flowBuilder.getFlow();
	}

}
