package com.movies.portal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "MOVIES")
public class Movies {

	@Id
	private Integer id;

	@Override
	public String toString() {
		return "Movie [id=" + id + ", director_name=" + director_name + ", duration=" + duration + ", actor_2_name="
				+ actor_2_name + ", genres=" + genres + ", actor_1_name=" + actor_1_name + ", movie_title="
				+ movie_title + ", actor_3_name=" + actor_3_name + ", country=" + country + "]";
	}

	@Column(name = "director_name")
	private String director_name;

	@Column(name = "num_critic_for_reviews")
	private Integer num_critic_for_reviews;

	@Column(name = "duration")
	private Integer duration;

	@Column(name = "director_facebook_likes")
	private Integer director_facebook_likes;

	@Column(name = "actor_3_facebook_likes")
	private Integer actor_3_facebook_likes;

	@Column(name = "actor_2_name")
	private String actor_2_name;

	@Column(name = "actor_1_facebook_likes")
	private Integer actor_1_facebook_likes;

	@Column(name = "gross")
	private Integer gross;

	@Column(name = "genres", nullable = false)
	private String genres;

	@Column(name = "actor_1_name")
	private String actor_1_name;

	@Column(name = "movie_title", nullable = false)
	private String movie_title;

	@Column(name = "num_voted_users", nullable = false)
	private Integer num_voted_users;

	@Column(name = "cast_total_facebook_likes", nullable = false)
	private Integer cast_total_facebook_likes;

	@Column(name = "actor_3_name")
	private String actor_3_name;

	@NotEmpty
	@Column(name = "facenumber_in_poster")
	private Integer facenumber_in_poster;

	@Column(name = "plot_keywords")
	private String plot_keywords;

	@Column(name = "movie_imdb_link", nullable = false)
	private String movie_imdb_link;

	@Column(name = "num_user_for_reviews")
	private Integer num_user_for_reviews;

	@Column(name = "language")
	private String language;

	@Column(name = "country")
	private String country;

	@Column(name = "content_rating")
	private String content_rating;

	@Column(name = "budget")
	private Integer budget;

	@Column(name = "title_year")
	private Integer title_year;

	@Column(name = "actor_2_facebook_likes")
	private Integer actor_2_facebook_likes;

	@Column(name = "imdb_score", nullable = false)
	private Double imdb_score;

	@Column(name = "aspect_ratio")
	private Double aspect_ratio;

	@Column(name = "movie_facebook_likes", nullable = false)
	private Integer movie_facebook_likes;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDirector_name() {
		return director_name;
	}

	public void setDirector_name(String director_name) {
		this.director_name = director_name;
	}

	public Integer getNum_critic_for_reviews() {
		return num_critic_for_reviews;
	}

	public void setNum_critic_for_reviews(Integer num_critic_for_reviews) {
		this.num_critic_for_reviews = num_critic_for_reviews;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public Integer getDirector_facebook_likes() {
		return director_facebook_likes;
	}

	public void setDirector_facebook_likes(Integer director_facebook_likes) {
		this.director_facebook_likes = director_facebook_likes;
	}

	public Integer getActor_3_facebook_likes() {
		return actor_3_facebook_likes;
	}

	public void setActor_3_facebook_likes(Integer actor_3_facebook_likes) {
		this.actor_3_facebook_likes = actor_3_facebook_likes;
	}

	public String getActor_2_name() {
		return actor_2_name;
	}

	public void setActor_2_name(String actor_2_name) {
		this.actor_2_name = actor_2_name;
	}

	public Integer getActor_1_facebook_likes() {
		return actor_1_facebook_likes;
	}

	public void setActor_1_facebook_likes(Integer actor_1_facebook_likes) {
		this.actor_1_facebook_likes = actor_1_facebook_likes;
	}

	public Integer getGross() {
		return gross;
	}

	public void setGross(Integer gross) {
		this.gross = gross;
	}

	public String getGenres() {
		return genres;
	}

	public void setGenres(String genres) {
		this.genres = genres;
	}

	public String getActor_1_name() {
		return actor_1_name;
	}

	public void setActor_1_name(String actor_1_name) {
		this.actor_1_name = actor_1_name;
	}

	public String getMovie_title() {
		return movie_title;
	}

	public void setMovie_title(String movie_title) {
		this.movie_title = movie_title;
	}

	public Integer getNum_voted_users() {
		return num_voted_users;
	}

	public void setNum_voted_users(Integer num_voted_users) {
		this.num_voted_users = num_voted_users;
	}

	public Integer getCast_total_facebook_likes() {
		return cast_total_facebook_likes;
	}

	public void setCast_total_facebook_likes(Integer cast_total_facebook_likes) {
		this.cast_total_facebook_likes = cast_total_facebook_likes;
	}

	public String getActor_3_name() {
		return actor_3_name;
	}

	public void setActor_3_name(String actor_3_name) {
		this.actor_3_name = actor_3_name;
	}

	public Integer getFacenumber_in_poster() {
		return facenumber_in_poster;
	}

	public void setFacenumber_in_poster(Integer facenumber_in_poster) {
		this.facenumber_in_poster = facenumber_in_poster;
	}

	public String getPlot_keywords() {
		return plot_keywords;
	}

	public void setPlot_keywords(String plot_keywords) {
		this.plot_keywords = plot_keywords;
	}

	public String getMovie_imdb_link() {
		return movie_imdb_link;
	}

	public void setMovie_imdb_link(String movie_imdb_link) {
		this.movie_imdb_link = movie_imdb_link;
	}

	public Integer getNum_user_for_reviews() {
		return num_user_for_reviews;
	}

	public void setNum_user_for_reviews(Integer num_user_for_reviews) {
		this.num_user_for_reviews = num_user_for_reviews;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getContent_rating() {
		return content_rating;
	}

	public void setContent_rating(String content_rating) {
		this.content_rating = content_rating;
	}

	public Integer getBudget() {
		return budget;
	}

	public void setBudget(Integer budget) {
		this.budget = budget;
	}

	public Integer getTitle_year() {
		return title_year;
	}

	public void setTitle_year(Integer title_year) {
		this.title_year = title_year;
	}

	public Integer getActor_2_facebook_likes() {
		return actor_2_facebook_likes;
	}

	public void setActor_2_facebook_likes(Integer actor_2_facebook_likes) {
		this.actor_2_facebook_likes = actor_2_facebook_likes;
	}

	public Double getImdb_score() {
		return imdb_score;
	}

	public void setImdb_score(Double imdb_score) {
		this.imdb_score = imdb_score;
	}

	public Double getAspect_ratio() {
		return aspect_ratio;
	}

	public void setAspect_ratio(Double aspect_ratio) {
		this.aspect_ratio = aspect_ratio;
	}

	public Integer getMovie_facebook_likes() {
		return movie_facebook_likes;
	}

	public void setMovie_facebook_likes(Integer movie_facebook_likes) {
		this.movie_facebook_likes = movie_facebook_likes;
	}

	
	
	
}