/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.crystallake.mapper;

import com.sg.crystallake.dto.Person;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author spookydylan
 */
public class PersonMapper implements RowMapper {

    @Override
    public Person mapRow(ResultSet rs, int i) throws SQLException {
        Person p = new Person();
        p.setId(rs.getInt("ID"));
        p.setFirstName(rs.getString("FirstName"));
        p.setLastName(rs.getString("LastName"));
        p.setFirstAppearance(rs.getInt("FirstAppearance"));
        p.setFinalAppearance(rs.getInt("FinalAppearance"));
        p.setFinalGirl(rs.getBoolean("FinalGirl"));
        p.setKilledJason(rs.getBoolean("KilledJason"));
        p.setDescription(rs.getString("Description"));
        p.setDeath(rs.getString("Death"));
        return p;
    }
    
}
