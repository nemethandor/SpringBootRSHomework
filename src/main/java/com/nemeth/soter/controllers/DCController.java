package com.nemeth.soter.controllers;

import com.nemeth.soter.model.DC;
import com.nemeth.soter.model.Hero;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DCController {

    private List<Hero> dcCar;

    public DCController(List<Hero> dcCar) {
        this.dcCar = dcCar;
    }

    @RequestMapping(value = "dc", produces = "application/json")
    public DC listAllDcCar(){
        return new DC(dcCar);
    }

    @RequestMapping(value="/dc/{id}")
    public Hero giveDcCar(@PathVariable("id") Integer id){
        for (Hero hero: dcCar){
            if (hero.getId()==id){
                return hero;
            }
        }
        throw new IllegalArgumentException("DC character is not found with this id= "+id);
    }
}
