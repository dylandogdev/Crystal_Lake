/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.crystallake.dao;

import com.sg.crystallake.dto.Position;
import com.sg.crystallake.mapper.PositionMapper;
import java.util.List;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author spookydylan
 */
public class PositionDAOImpl implements PositionDAO {

    JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    private static final String SQL_ADD_POSITION
            = "INSERT INTO Position (Name, Description) "
            + "VALUES (?, ?);";

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public void addPosition(Position positionToAdd) {
        jdbcTemplate.update(SQL_ADD_POSITION,
                positionToAdd.getName(),
                positionToAdd.getDescription());

        int positionID
                = jdbcTemplate.queryForObject("SELECT LAST_INSERT_ID()",
                        Integer.class);

        positionToAdd.setId(positionID);
    }

    private static final String SQL_GET_POSITION_BY_ID
            = "SELECT * FROM Position WHERE ID = ?;";

    @Override
    public Position getPositionByID(int positionID) {
        try {
            return (Position) jdbcTemplate.queryForObject(SQL_GET_POSITION_BY_ID,
                    new PositionMapper(),
                    positionID);
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }

    private static final String SQL_GET_ALL_POSITIONS
            = "SELECT * FROM Position;";

    @Override
    public List<Position> getAllPositions() {
        return jdbcTemplate.query(SQL_GET_ALL_POSITIONS, 
                new PositionMapper());
    }

    private static final String SQL_UPDATE_POSITION
            = "UPDATE Position SET Name = ?, Description = ? WHERE ID = ?;";

    @Override
    public void updatePosition(Position updatedPosition) {
        jdbcTemplate.update(SQL_UPDATE_POSITION, 
                updatedPosition.getName(),
                updatedPosition.getDescription(),
                updatedPosition.getId());
    }

    private static final String SQL_DELETE_POSITION
            = "DELETE FROM Position WHERE ID = ?";

    @Override
    public void deletePositionByID(int positionID) {
        jdbcTemplate.update(SQL_DELETE_POSITION, 
                positionID);
    }

}
