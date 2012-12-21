package com.rdpgroupbd.apps.server.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.rdpgroupbd.apps.shared.Account;

public class AccountImpl implements AccountDao {

	private EntityManager em;

	public AccountImpl(EntityManager em) {
		this.em = em;
	}

	public List<Account> getAccount() {
		CriteriaBuilder builder = em.getCriteriaBuilder();
		CriteriaQuery<Account> criteria = builder.createQuery(Account.class);
		Root<Account> account = criteria.from(Account.class);
		criteria.select(account).orderBy(builder.asc(account.get("name")));
		return em.createQuery(criteria).getResultList();
	}

}
