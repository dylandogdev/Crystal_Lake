/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.crystallake.mapper;

import com.sg.crystallake.dto.Position;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author spookydylan
 */
public class PositionMapper implements RowMapper {

    @Override
    public Position mapRow(ResultSet rs, int i) throws SQLException {
        Position t = new Position();
        t.setId(rs.getInt("ID"));
        t.setName(rs.getString("Name"));
        t.setDescription(rs.getString("Description"));
        return t;
    }
      
}
