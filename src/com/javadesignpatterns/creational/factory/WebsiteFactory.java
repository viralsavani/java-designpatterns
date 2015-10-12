package com.javadesignpatterns.creational.factory;

/**
 * Created by VIRAL on 10/12/2015.
 */
public class WebsiteFactory {

    public static Website getWebsite(WebsiteType siteType){
        switch (siteType) {
            case BLOG:{
                return new Blog();
            }
            case SHOP:{
                return  new Shop();
            }

            default:{
                return null;
            }
        }
    }

}
