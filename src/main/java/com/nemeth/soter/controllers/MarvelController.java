package com.nemeth.soter.controllers;

import com.nemeth.soter.model.Hero;
import com.nemeth.soter.model.Marvel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MarvelController {

    private List<Hero> marvelCar;

    public MarvelController() {
    }

    @Autowired
    public MarvelController(List<Hero> marvelCar) {
        this.marvelCar = marvelCar;
    }

    @RequestMapping(value = "/marvel",produces = {"application/json"})
    public Marvel listAllMarvelCar(){
        return new Marvel(marvelCar);
    }

    @RequestMapping(value = "/marvel/{id}")
    public Hero listMarvelCar(@PathVariable("id") Integer id){
        for (Hero hero : marvelCar){
            if (hero.getId()==id){
                return hero;
            }
        }
        throw new IllegalArgumentException("Marvel character is not found with this id= "+id);
    }

}
