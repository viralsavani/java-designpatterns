package com.javadesignpatterns.structural.proxy;

/**
 * Created by VIRAL on 10/21/2015.
 */
public class TwitterServiceStub implements TwitterService {
    @Override
    public String getTimeLine(String screenName) {
        return "MY TIMELINE";
    }

    @Override
    public void postToTimeLine(String screenName, String message) {

    }
}
