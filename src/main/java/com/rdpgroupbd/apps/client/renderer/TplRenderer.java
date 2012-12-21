package com.rdpgroupbd.apps.client.renderer;

import com.google.gwt.core.client.GWT;
import com.rdpgroupbd.apps.client.templates.RdpTemplates;

public final class TplRenderer {

	public static RdpTemplates renderRdpTpl() {
		return  GWT.create(RdpTemplates.class);
	}
}
