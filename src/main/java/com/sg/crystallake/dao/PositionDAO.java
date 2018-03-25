/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.crystallake.dao;

import com.sg.crystallake.dto.Position;
import java.util.List;

/**
 *
 * @author spookydylan
 */
public interface PositionDAO {
    
    //C
    public void addPosition(Position positionToAdd);
    
    //R
    public Position getPositionByID(int positionID);
    
    public List<Position> getAllPositions();
    
    //U
    public void updatePosition(Position updatedposition);
    
    //D
    public void deletePositionByID(int positionID);
    
}
