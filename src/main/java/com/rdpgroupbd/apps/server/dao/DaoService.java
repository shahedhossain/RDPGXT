package com.rdpgroupbd.apps.server.dao;

import javax.persistence.EntityManager;

import com.rdpgroupbd.apps.server.util.EMUtil;

public class DaoService {

	static EntityManager em = EMUtil.getInstance().getEntityManager();

	public static AccountDao AccountAction() {
		return new AccountImpl(em);
	}

}
