package com.javadesignpatterns.creational.builder;

/**
 * Builder pattern
 */
public class LunchOrderBuilder {

    private final String bread;
    private final String condiments;
    private final String dressing;
    private final String meat;
    private LunchOrderBuilder(Builder builder){
        this.bread = builder.bread;
        this.condiments = builder.condiments;
        this.dressing = builder.dressing;
        this.meat = builder.meat;
    }

    public String getBread(){
        return this.bread;
    }

    public String getCondiments(){
        return this.condiments;
    }

    public String getDressing(){
        return this.dressing;
    }

    public String getMeat(){
        return this.meat;
    }

    public static class Builder{
        private String bread;
        private String condiments;
        private String dressing;
        private String meat;

        public Builder(){

        }

        public LunchOrderBuilder build(){
            return new LunchOrderBuilder(this);
        }

        public Builder bread(String bread){
            this.bread = bread;
            return this;
        }

        public Builder condiments(String condiments){
            this.condiments = condiments;
            return this;
        }

        public Builder dressing(String dressing){
            this.dressing = dressing;
            return this;
        }

        public Builder meat(String meat){
            this.meat = meat;
            return this;
        }
    }

}
