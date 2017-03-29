package com.expertzlab.spring.core;

import org.springframework.stereotype.Component;

/**
 * Created by gireeshbabu on 22/03/17.
 */

//@Component
public class HelloBean {

    private String neighbourName;
    private ConnectedBean connectedBean;

    public String getNeighbourName() {
        return neighbourName;
    }

    public ConnectedBean getConnectedBean() {
        return connectedBean;
    }

    public void setConnectedBean(ConnectedBean connectedBean) {
        System.out.println("Called setConnected Bean" + connectedBean);
        this.connectedBean = connectedBean;
    }

    public void setNeighbourName(String neighbourName) {
        System.out.println("In Setter -" + neighbourName);
        this.neighbourName = neighbourName;
    }

    public HelloBean(String parentName){
        System.out.println("in Constructor - "+ parentName);
    }

    public void printHello(){

        System.out.println("Hello world!");
    }

    public void init(){
        System.out.println("In Init");
    }

    public void destroy(){
        System.out.println("In Destroy");
        //System.out.println(" "+connectedBean);
    }
}
