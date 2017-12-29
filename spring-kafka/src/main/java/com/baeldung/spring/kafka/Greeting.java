package com.baeldung.spring.kafka;

public class Greeting {

    private String msg;
    private String name;
	

    public Greeting() {

    }

    public Greeting(String msg1, String name) {
        this.msg = msg1;
        this.name = name;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return msg + ", " + name + "!";
    }
}
