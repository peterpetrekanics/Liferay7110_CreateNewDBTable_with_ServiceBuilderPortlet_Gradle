package com.liferay.test.portlet;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.test.constants.UpgradeProcessSBSampleMVCPortlet7110PortletKeys;
import com.liferay.test.model.Foo;
import com.liferay.test.service.FooLocalServiceUtil;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;

import org.osgi.service.component.annotations.Component;

/**
 * @author peterpetrekanics
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=UpgradeProcessSBSampleMVCPortlet7110",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + UpgradeProcessSBSampleMVCPortlet7110PortletKeys.UPGRADEPROCESSSBSAMPLEMVCPORTLET7110,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class UpgradeProcessSBSampleMVCPortlet7110Portlet extends MVCPortlet {
	int count;
	
	public void processAction(ActionRequest actionRequest, ActionResponse actionResponse) throws IOException, PortletException {
		System.out.println("ProcessAction starts..");
		
		
		Foo myFoo = FooLocalServiceUtil.createFoo(count++);
		FooLocalServiceUtil.addFoo(myFoo);
		System.out.println("getFoosCount: " + FooLocalServiceUtil.getFoosCount());
		
		
		
		System.out.println("ProcessAction ends..");
	}
}