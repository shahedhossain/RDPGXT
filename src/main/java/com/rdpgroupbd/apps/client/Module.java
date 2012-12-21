package com.rdpgroupbd.apps.client;

import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;
import com.rdpgroupbd.apps.client.renderer.TplRenderer;
import com.rdpgroupbd.apps.client.style.RdpStyle;
import com.sencha.gxt.core.client.util.Margins;
import com.sencha.gxt.widget.core.client.ContentPanel;
import com.sencha.gxt.widget.core.client.container.BorderLayoutContainer;
import com.sencha.gxt.widget.core.client.container.BorderLayoutContainer.BorderLayoutData;
import com.sencha.gxt.widget.core.client.container.MarginData;
import com.sencha.gxt.widget.core.client.container.SimpleContainer;

public class Module implements IsWidget {

	public Widget asWidget() {
		final BorderLayoutContainer con = new BorderLayoutContainer();

		HTML north = new HTML();
		north.setHTML(TplRenderer.renderRdpTpl().title("Formative Soft Ltd", "2012 All Right Reserved"));
		north.getElement().setId("rdp-header");

		BorderLayoutData northData = new BorderLayoutData(35);
		northData.setMargins(new Margins(0, 0, 5, 0));
		
		ContentPanel west = new ContentPanel();
		RdpStyle.setPlainHeader(west);
		west.setHeadingText("Modules");
		
		BorderLayoutData westData = new BorderLayoutData(240);
		westData.setCollapsible(true);
		westData.setSplit(true);
		westData.setCollapseMini(true);
		westData.setCollapseHidden(true);
		westData.setMargins(new Margins(0, 5, 5, 5));

		MarginData centrData = new MarginData();
		
		con.setNorthWidget(north, northData);
		con.setWestWidget(west, westData);
		con.setCenterWidget(new Form(), centrData);

		SimpleContainer simple = new SimpleContainer();
		simple.add(con, new MarginData(0));

		return simple;
	}

}
