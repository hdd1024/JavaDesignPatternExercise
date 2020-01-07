package com.han.designpattern.behaviour.strategy;

public class EmptyStrategy implements PomotionStrategy {
    @Override
    public void doPomotion() {
        System.out.println("无促销！");
    }
}
