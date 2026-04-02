/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.drone2producer.drone2Producer;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Service;

/**
 *
 * @author rafde
 */
@Service
public class BerichtService {

    public BerichtService(org.springframework.amqp.core.AmqpTemplate template) {
        this.template = template;
    }
    private final AmqpTemplate template;
    void create(String berichtString){
        Bericht bericht = new Bericht(berichtString);
    template.convertAndSend("exchange1", "", new BerichtGemaakt(bericht));
}

}
