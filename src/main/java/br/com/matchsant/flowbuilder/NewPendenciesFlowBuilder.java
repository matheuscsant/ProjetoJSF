package br.com.matchsant.flowbuilder;

import java.io.Serializable;

import jakarta.enterprise.inject.Produces;
import jakarta.faces.flow.Flow;
import jakarta.faces.flow.builder.FlowBuilder;
import jakarta.faces.flow.builder.FlowBuilderParameter;
import jakarta.faces.flow.builder.FlowDefinition;

public class NewPendenciesFlowBuilder implements Serializable {

	private static final long serialVersionUID = 1L;

	@Produces
	@FlowDefinition
	public Flow defineFlow(@FlowBuilderParameter FlowBuilder flowBuilder) {
		String flowId = "newpendencies";
		flowBuilder.id("", flowId);

		flowBuilder.viewNode(flowId, "/newpendencies/newpendencies.xhtml").markAsStartNode();

		flowBuilder.returnNode("proceedToNewRegistration3").fromOutcome("/newregistration/newregistration3.xhtml");
		flowBuilder.returnNode("exitToNewInicio").fromOutcome("newregistration/newregistration.xhtml");
		
		flowBuilder.inboundParameter("userName", "#{testeFlowBuilderNestedBean.userName}");
		flowBuilder.inboundParameter("userSurname", "#{testeFlowBuilderNestedBean.userSurname}");
		return flowBuilder.getFlow();
	}
}
