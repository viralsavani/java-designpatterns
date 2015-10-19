package com.javadesignpatterns.structural.bridge;

import java.util.List;

/**
 * Created by VIRAL on 10/18/2015.
 */
public abstract class Printer {

    public String print(Formatter formatter){
        return formatter.format(getHeader(), getDetails());
    }

    abstract protected List<Detail> getDetails();
    abstract protected String getHeader();
}
