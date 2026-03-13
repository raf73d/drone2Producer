/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.drone2producer.drone2Producer;

import jakarta.validation.constraints.NotBlank;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author rafde
 */
@RestController
public class BerichtController {

    public BerichtController(com.drone2producer.drone2Producer.BerichtService berichtService) {
        this.berichtService = berichtService;
    }
    private final BerichtService berichtService;
    
    @PostMapping("/berichten") 
    @ResponseStatus(HttpStatus.CREATED) 
void post(@RequestBody @NotBlank String berichtString) { 
berichtService.create(berichtString); 
} 
}
