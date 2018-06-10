package com.movies.portal.service;

import java.util.List;

import com.movies.portal.dao.MoviesDaoImpl;
import com.movies.portal.model.Movies;

public class MoviesServiceImpl implements MoviesService {

	private MoviesDaoImpl dao = new MoviesDaoImpl();

	public Movies findById(int id) {
		return dao.findById(id);
	}
	
	public List<Movies> findByActorName(String actor1name) {
		return dao.findByActorName(actor1name);
	}
}
