package br.com.fiap.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.fiap.model.Profile;
import br.com.fiap.utils.JPAUtil;

public class ProfileDAO {
	
	public void save(Profile profile) {
		EntityManager em = JPAUtil.getEntityManager();
		em.getTransaction().begin();
		em.persist(profile);
		em.getTransaction().commit();
		
		em.close();
	}
	
	public List<Profile> getAll(){
		EntityManager em = JPAUtil.getEntityManager();
		String jpql = "SELECT p FROM Profile p";
		TypedQuery<Profile> query = em.createQuery(jpql, Profile.class);
		return query.getResultList();
	}

}
