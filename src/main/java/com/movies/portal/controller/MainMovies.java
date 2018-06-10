package com.movies.portal.controller;

import java.util.Iterator;
import java.util.List;

import com.movies.portal.model.Movies;
import com.movies.portal.service.MoviesServiceImpl;

public class MainMovies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MoviesServiceImpl impl = new MoviesServiceImpl();
		
//		Movies movie = impl.findById(2323);   
//		
//		System.out.println(movie);
		
		List<Movies> list = impl.findByActorName("Depp");
		
		System.out.println("Depp movies :");
		
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Movies movies = (Movies) iterator.next();
			System.out.println(movies.getMovie_title());
		}
		
		
	}

}
