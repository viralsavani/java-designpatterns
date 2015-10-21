package com.javadesignpatterns.structural.proxy;

/**
 * Created by VIRAL on 10/21/2015.
 */
public class TwitterDemo {

    public static void main(String[] args) {
        TwitterService service = (TwitterService) SecurityProxy.newInstance(new TwitterServiceStub());

        System.out.println(service.getTimeLine("Timeline"));
    }
}
