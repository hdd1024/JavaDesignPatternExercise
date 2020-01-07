package com.han.designpattern.behaviour.strategy;

/**
 * 满减促销模式
 */
public class ManJianStrategy implements PomotionStrategy {
    @Override
    public void doPomotion() {
        System.out.println("满100元减去90元！");
    }
}
