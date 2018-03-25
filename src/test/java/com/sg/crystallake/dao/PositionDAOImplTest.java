/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.crystallake.dao;



import com.sg.crystallake.dto.Position;
import java.util.List;
import org.junit.After;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author spookydylan
 */
public class PositionDAOImplTest {
    
    PositionDAO dao;
    
    public PositionDAOImplTest() {
    }
    
    @Before
    public void setUp() {
        
        //spring dependency injection
        ApplicationContext ctx
                = new ClassPathXmlApplicationContext("test-applicationContext.xml");
        
        //get the dao bean
        dao = ctx.getBean("positionDao", PositionDAO.class);
        
        //make sure the dao is in a known good state before I run each test
        List<Position> positions = dao.getAllPositions();
        for(Position position : positions){
            dao.deletePositionByID(position.getId());
        }
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testAddGetPosition() {
        
        Position position = new Position();
        position.setName("Counselor");
        position.setDescription("A counselor at Camp Crystal Lake.");
        
        dao.addPosition(position);
        
        Position retrievedPosition = dao.getPositionByID(position.getId());
        
        assertEquals(position, retrievedPosition);
        
    }

    @Test
    public void testGetAllPositions() {
        
        Position position = new Position();
        position.setName("Counselor");
        position.setDescription("A counselor at Camp Crystal Lake.");
        
        dao.addPosition(position);
        
        Position position2 = new Position();
        position2.setName("Counselor");
        position2.setDescription("A counselor at Camp Crystal Lake.");
        
        dao.addPosition(position2);
        
        List<Position> positions = dao.getAllPositions();
        
        assertEquals(2, positions.size());
        
    }

    @Test
    public void testUpdatePosition() {
        
        Position position = new Position();
        position.setName("Counselor");
        position.setDescription("A counselor at Camp Crystal Lake.");
        
        dao.addPosition(position);
        
        Position position2 = new Position();
        position2.setName("Town Person");
        position2.setDescription("Townies know what's up.");
        position2.setId(position.getId());
        
        dao.updatePosition(position2);
        
        Position retrievedPosition = dao.getPositionByID(position2.getId());
        
        assertEquals("Town Person", retrievedPosition.getName());
        
    }

    @Test
    public void testDeletePositionByID() {
        
        Position position = new Position();
        position.setName("Counselor");
        position.setDescription("A counselor at Camp Crystal Lake.");
        
        dao.addPosition(position);
        
        dao.deletePositionByID(position.getId());
        
        assertNull(dao.getPositionByID(position.getId()));
    }
    
}
