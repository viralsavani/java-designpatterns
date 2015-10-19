package com.javadesignpatterns.structural.bridge;

import java.util.List;

/**
 * Created by VIRAL on 10/18/2015.
 */
public class PrintFormatter implements Formatter {
    @Override
    public String format(String header, List<Detail> details) {
        StringBuilder builder = new StringBuilder();
        builder.append(header);
        for (Detail detail : details){
            builder.append(detail.getLabel());
            builder.append(":");
            builder.append(detail.getValue());
            builder.append("\n");
        }
        return builder.toString();
    }
}
