/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.crystallake.mapper;

import com.sg.crystallake.dto.Movie;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author spookydylan
 */
public class MovieMapper implements RowMapper {

    @Override
    public Movie mapRow(ResultSet rs, int i) throws SQLException {
        Movie m = new Movie();
        m.setId(rs.getInt("ID"));
        m.setTitle(rs.getString("Title"));
        m.setYear(rs.getInt("Year"));
        m.setKiller(rs.getInt("Killer"));
        return m;
    }
    
}
