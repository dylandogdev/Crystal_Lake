/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.crystallake.dao;

import com.sg.crystallake.dto.Movie;
import java.util.List;

/**
 *
 * @author spookydylan
 */
public interface MovieDAO {
    
    //C
    public void addMovie(Movie movieToAdd);
    
    //R
    public Movie getMovieByID(int movieID);
    
    public List<Movie> getAllMovies();
    
    //U
    public void updateMovie(Movie updatedMovie);
    
    //D
    public void deleteMovieByID(int movieID);
    
}
