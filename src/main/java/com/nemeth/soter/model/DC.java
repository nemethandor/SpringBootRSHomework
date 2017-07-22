package com.nemeth.soter.model;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement
public class DC {

    private List<Hero> dcCaracter;

    public List<Hero> getDcCaracter() {
        return dcCaracter;
    }

    public void setDcCaracter(List<Hero> dcCaracter) {
        this.dcCaracter = dcCaracter;
    }

    public DC(List<Hero> dcCaracter) {

        this.dcCaracter = dcCaracter;
    }

    public DC() {
    }
}
