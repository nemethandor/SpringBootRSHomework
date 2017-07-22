package com.nemeth.soter.config;


import com.nemeth.soter.BasicVariable.Gender;
import com.nemeth.soter.BasicVariable.UniverseEnum;
import com.nemeth.soter.model.Hero;
import com.nemeth.soter.model.Marvel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfig {


    @Autowired
    private Environment environment;

    @Bean
    public List<Hero> marvelCar(){
        List<Hero> marvelCaracters = new ArrayList<>();
        marvelCaracters.add(new Hero(1,"Spider-man", UniverseEnum.Marvel , false,23, Gender.male,"Precognitive Spider-sense"));
        marvelCaracters.add(new Hero(2,"Spider-woman", UniverseEnum.Marvel , false,21, Gender.female,"Flight"));
        marvelCaracters.add(new Hero(3,"Iron man", UniverseEnum.Marvel , false,41, Gender.male,"Genius-level intellect"));
        marvelCaracters.add(new Hero(4,"Green Goblin", UniverseEnum.Marvel , true,56, Gender.male,"Regenerative healing factor"));
        return marvelCaracters;
    }

    @Bean
    public List<Hero> dcCar(){
        List<Hero> dcCaracters = new ArrayList<>();
        dcCaracters.add(new Hero(1,"Batman",UniverseEnum.DC,false,32,Gender.male,"Expert detective"));
        dcCaracters.add(new Hero(2,"Flash",UniverseEnum.DC,false,29,Gender.male,"Superhuman speed"));
        dcCaracters.add(new Hero(3,"Wonder Woman",UniverseEnum.DC,false,27,Gender.female,"Superhuman strength, speed, durability, and longevity"));
        dcCaracters.add(new Hero(4,"Joker",UniverseEnum.DC,true,42 ,Gender.female,"Expert chemist"));
        return dcCaracters;
    }
}
