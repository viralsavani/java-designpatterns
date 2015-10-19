package com.javadesignpatterns.structural.bridge;

import java.util.List;

/**
 * Created by VIRAL on 10/18/2015.
 */
public interface Formatter {
    String format(String header, List<Detail> details);
}
