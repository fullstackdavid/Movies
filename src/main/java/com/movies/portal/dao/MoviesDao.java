package com.movies.portal.dao;

import com.movies.portal.model.Movies;

public interface MoviesDao {

	
	Movies findById(int id);
}
