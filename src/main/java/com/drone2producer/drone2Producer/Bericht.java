/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.drone2producer.drone2Producer;

import java.time.LocalDate;

/**
 *
 * @author rafde
 */
public class Bericht {

    public Bericht(java.lang.String bericht) {
        this.bericht = bericht;
        this.datum = LocalDate.now();
    }
    private LocalDate datum;
    private final String bericht;

    public LocalDate getDatum() {
        return datum;
    }

    public String getBericht() {
        return bericht;
    }
    
    
    
}
