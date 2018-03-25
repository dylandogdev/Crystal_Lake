/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.crystallake.dao;

import com.sg.crystallake.dto.Movie;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author spookydylan
 */
public class MovieDAOImpl implements MovieDAO {
    
    JdbcTemplate jdbcTemplate;
    
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }
    
    private static final String SQL_ADD_MOVIE
            = "";
    @Override
    public void addMovie(Movie movieToAdd) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private static final String SQL_GET_MOVIE_BY_ID
            = "";
    @Override
    public Movie getMovieByID(int movieID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private static final String SQL_GET_ALL_MOVIES
            = "";
    @Override
    public List<Movie> getAllMovies() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private static final String SQL_UPDATE_MOVIE
            = "";
    @Override
    public void updateMovie(Movie updatedMovie) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private static final String SQL_DELETE_MOVIE
            = "";
    @Override
    public void deleteMovieByID(int movieID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
