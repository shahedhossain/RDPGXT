package com.rdpgroupbd.apps.client;

import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;
import com.rdpgroupbd.apps.client.style.RdpStyle;
import com.sencha.gxt.core.client.util.Margins;
import com.sencha.gxt.widget.core.client.ContentPanel;
import com.sencha.gxt.widget.core.client.container.BorderLayoutContainer;
import com.sencha.gxt.widget.core.client.container.BorderLayoutContainer.BorderLayoutData;
import com.sencha.gxt.widget.core.client.container.MarginData;
import com.sencha.gxt.widget.core.client.container.SimpleContainer;

public class Form implements IsWidget {

	public Widget asWidget() {
		final BorderLayoutContainer con = new BorderLayoutContainer();
			
		ContentPanel west = new ContentPanel();		
		RdpStyle.setPlainHeader(west);
		
		ContentPanel center = new ContentPanel();
		RdpStyle.setPlainHeader(center);
			
		BorderLayoutData westData = new BorderLayoutData(200);
		westData.setCollapsible(true);
		westData.setSplit(true);
		westData.setCollapseMini(true);
		westData.setCollapseHidden(true);
		westData.setMargins(new Margins(5, 5, 5, 5));
		
		MarginData centrData = new  MarginData();
		centrData.setMargins(new Margins(5, 5, 5, 0));
		
		con.setWestWidget(west, westData);
		con.setCenterWidget(center, centrData);
				
		ContentPanel panel = new ContentPanel();
		RdpStyle.setPlainHeader(panel);
		panel.setHeadingText("Forms");
		panel.setWidget(con);
		
		MarginData simpleData = new  MarginData();
		simpleData.setMargins(new Margins(0, 5, 5, 0));
		
		SimpleContainer simple = new SimpleContainer();
		simple.add(panel, simpleData);
		
						
		return panel;
	}

}
