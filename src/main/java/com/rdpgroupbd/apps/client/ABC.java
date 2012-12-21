package com.rdpgroupbd.apps.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;
import com.rdpgroupbd.apps.client.service.ABCService;
import com.rdpgroupbd.apps.client.service.ABCServiceAsync;
import com.sencha.gxt.widget.core.client.container.Viewport;
import com.sencha.gxt.widget.core.client.info.Info;

public class ABC implements EntryPoint, IsWidget {
	
	private final ABCServiceAsync remote = GWT.create(ABCService.class);

	public Widget asWidget() {
		Module module = new Module();
		return module.asWidget();
	}

	public void onModuleLoad() {
		Widget con = asWidget();
		Viewport viewport = new Viewport();
		viewport.add(con);
		helloServer();
		RootPanel.get().add(viewport);
	}
	
	@SuppressWarnings("unused")
	private void helloServer() {
		remote.hello("Shahed", new AsyncCallback<String>() {
			
			public void onSuccess(String result) {
				Info.display("Result", result);				
			}
			
			public void onFailure(Throwable caught) {
				Info.display("Error", "Exception!");
				
			}
		});
	}

}
