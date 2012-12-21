package com.rdpgroupbd.apps.client.templates;

import com.google.gwt.safehtml.shared.SafeHtml;
import com.sencha.gxt.core.client.XTemplates;

public interface RdpTemplates extends XTemplates {

	@XTemplate(source = "RdpTitile.tpl.html")
	public SafeHtml title(String title, String subtitle);
}
