package com.movies.portal.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.movies.portal.model.Movies;
import com.movies.portal.service.MoviesServiceImpl;

@Controller
public class MoviesController {

	MoviesServiceImpl moviesService;

	/**
	 * This method will retrieve details of a certain movie.
	 */
	@RequestMapping(value = { "/hello.htm/{id}" }, method = RequestMethod.GET)
	public ModelAndView findMovie(@PathVariable(value = "id") int id) {

		 Map<String, Object> model =  new HashMap<String, Object>();
		Movies movie = moviesService.findById(id);
		model.put("movie", movie);
		return new ModelAndView("hello", "model", model);
	}
	
}