package com.rdpgroupbd.apps.client.style;

import com.google.gwt.dom.client.Style;
import com.sencha.gxt.core.client.resources.ThemeStyles;
import com.sencha.gxt.widget.core.client.ContentPanel;
import com.sencha.gxt.widget.core.client.Header;

public class RdpStyle {
	
	
	public static void setPlainHeader(ContentPanel panel) {
		Style style = panel.getHeader().getElement().getStyle();
		String color = ThemeStyles.getStyle().borderColor();
		style.setProperty("backgroundImage", "none");
		style.setProperty("borderTop", "1px solid "+ color);
	}
	
	public static void setPlainHeader(Header header) {
		Style style = header.getElement().getStyle();
		String color = ThemeStyles.getStyle().borderColor();
		style.setProperty("backgroundImage", "none");
		style.setProperty("borderTop", "1px solid "+ color);
	}

}
