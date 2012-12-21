package com.rdpgroupbd.apps.client.service;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface ABCServiceAsync {

	void hello(String name, AsyncCallback<String> callback) throws IllegalArgumentException;

}
