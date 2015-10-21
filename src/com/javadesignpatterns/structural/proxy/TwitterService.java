package com.javadesignpatterns.structural.proxy;

/**
 * Created by VIRAL on 10/21/2015.
 */
public interface TwitterService {

    String getTimeLine(String screenName);
    void postToTimeLine(String screenName, String message);
}
