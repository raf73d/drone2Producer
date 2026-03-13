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
public class BerichtGemaakt {
    private LocalDate datum;
    private String berichtString;
    public BerichtGemaakt(Bericht bericht) {
        datum = bericht.getDatum();
        berichtString = bericht.getBericht();   
    }

    public LocalDate getDatum() {
        return datum;
    }

    public String getBerichtString() {
        return berichtString;
    }
    
}
