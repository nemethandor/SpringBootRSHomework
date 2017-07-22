package com.nemeth.soter.model;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement
public class Marvel {

    private List<Hero> marvelCaracters;

    public Marvel(List<Hero> marvelCaracters) {
        this.marvelCaracters = marvelCaracters;
    }

    public Marvel() {
    }

    public List<Hero> getMarvelCaracters() {
        return marvelCaracters;
    }

    public void setMarvelCaracters(List<Hero> marvelCaracters) {
        this.marvelCaracters = marvelCaracters;
    }

}
