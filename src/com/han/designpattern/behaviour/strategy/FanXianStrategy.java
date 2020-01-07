package com.han.designpattern.behaviour.strategy;

/**
 * 返现促销模式
 */
public class FanXianStrategy implements PomotionStrategy {
    @Override
    public void doPomotion() {
        System.out.println("下单立刻返现30元！");
    }
}
