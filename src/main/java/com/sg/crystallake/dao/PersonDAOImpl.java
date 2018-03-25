/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.crystallake.dao;

import com.sg.crystallake.dto.Person;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author spookydylan
 */
public class PersonDAOImpl implements PersonDAO {
    
    JdbcTemplate jdbcTemplate;
    
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }
    
    private static final String SQL_ADD_PERSON
            = "";
    @Override
    public void addPerson(Person personToAdd) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private static final String SQL_GET_PERSON_BY_ID
            = "";
    @Override
    public Person getPersonByID(int personID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private static final String SQL_GET_ALl_PERSONS
            = "";
    @Override
    public List<Person> getAllPersons() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private static final String SQL_UPDATE_PERSON
            = "";
    @Override
    public void updatePerson(Person updatedPerson) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private static final String SQL_DELETE_PERSON
            = "";
    @Override
    public void deletePersonByID(int personID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
