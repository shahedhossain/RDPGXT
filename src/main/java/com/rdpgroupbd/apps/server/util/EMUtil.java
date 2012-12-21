package com.rdpgroupbd.apps.server.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

final public class EMUtil {

	private static final Logger log = LoggerFactory.getLogger(EMUtil.class);
	private static final String JPU = "ABC";
	
	private EntityManagerFactory emf;
	private EntityManager em;
	
	private static EMUtil emu;

	private EMUtil() {
		emf = Persistence.createEntityManagerFactory(JPU);
		em = emf.createEntityManager();
	}

	public static EMUtil getInstance() {
		if (emu == null) {
			emu = new EMUtil();
		}
		return emu;
	}

	public EntityManager getEntityManager() {
		if (!em.isOpen()) {
			emf = Persistence.createEntityManagerFactory(JPU);
			em = emf.createEntityManager();
			log.error("Unable to initialized Entity Manager!");
		} else {
			log.info("Entity Manager initialized ");
		}
		return em;
	}

}
