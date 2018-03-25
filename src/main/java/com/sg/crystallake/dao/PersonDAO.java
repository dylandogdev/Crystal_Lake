/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.crystallake.dao;

import com.sg.crystallake.dto.Person;
import java.util.List;

/**
 *
 * @author spookydylan
 */
public interface PersonDAO {
    
    //C
    public void addPerson(Person personToAdd);
    
    //R
    public Person getPersonByID(int personID);
    
    public List<Person> getAllPersons();
    
    //U
    public void updatePerson(Person updatedPerson);
    
    //D
    public void deletePersonByID(int personID);
    
}
