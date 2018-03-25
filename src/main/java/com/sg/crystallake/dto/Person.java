/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.crystallake.dto;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author spookydylan
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Person {
    
    private int id;
    private String firstName;
    private String lastName;
    private int firstAppearance;
    private int finalAppearance;
    private boolean finalGirl;
    private boolean killedJason;
    private String description;
    private String death;
    private List<Movie> movies;
    private List<Position> types;
    
}
