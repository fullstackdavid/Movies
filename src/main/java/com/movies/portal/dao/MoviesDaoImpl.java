package com.movies.portal.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.movies.portal.model.Movies;

@Repository("moviesDao")
public class MoviesDaoImpl extends AbstractDao<Integer, Movies> implements MoviesDao {

	static final Logger logger = LoggerFactory.getLogger(MoviesDaoImpl.class);

	public Movies findById(int id) {
//		SessionFactory factory = new Configuration().buildSessionFactory();
		
		SessionFactory factory = HbUtil.getSessionFactory();
		
		Session session = factory.openSession();

		session.beginTransaction();
//		 Session session = null;
	        Movies movie = null;
	        try {
//	            session = getSession();
	            System.out.println("is session open ? " +session.isOpen());
	            movie =  (Movies) session.get(Movies.class,
	                    id);
	            Hibernate.initialize(movie);
	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            if (session != null && session.isOpen()) {
	            	session.getTransaction().commit();
	                session.close();
	            }
	        }
	        return movie;
	}
	
	@SuppressWarnings("unchecked")
	public List<Movies> findByActorName(String actor1Name) {
//		SessionFactory factory = new Configuration().buildSessionFactory();
		List<Movies> list = new ArrayList<Movies>();
		SessionFactory factory = HbUtil.getSessionFactory();
		
		Session session = factory.openSession();

		session.beginTransaction();
//		 Session session = null;
	        try {
//	            session = getSession();
	        	
	        	Query query = session.createQuery("from Movies where actor_1_name like :code ");
	        	query.setParameter("code", "%"+actor1Name+"%");
	        	list = query.list();
	            Hibernate.initialize(list);
	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            if (session != null && session.isOpen()) {
	            	session.getTransaction().commit();
	                session.close();
	            }
	        }
	        return list;
	}
}