package com.rdpgroupbd.apps.server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.rdpgroupbd.apps.client.service.ABCService;
import com.rdpgroupbd.apps.server.dao.DaoService;
import com.rdpgroupbd.apps.shared.Account;

public class ABCServiceImpl extends RemoteServiceServlet implements ABCService {

	private static final long serialVersionUID = 485616873185646205L;
	private static final Logger log = LoggerFactory
			.getLogger(ABCServiceImpl.class);

	public String hello(String name) throws IllegalArgumentException {
		String message = String.format("Hello %s\n", name);		
		for (Account a : DaoService.AccountAction().getAccount()) {
			message += String.format("{id:%s name:%s password:%s}\n",
					a.getAccountId(), a.getName(), a.getPassword());
		}
		log.info(message);
		return message;
	}

}
