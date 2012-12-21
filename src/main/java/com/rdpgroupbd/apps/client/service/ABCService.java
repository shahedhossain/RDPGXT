package com.rdpgroupbd.apps.client.service;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("greet")
public interface ABCService extends RemoteService {
	String hello(String name) throws IllegalArgumentException;
}
