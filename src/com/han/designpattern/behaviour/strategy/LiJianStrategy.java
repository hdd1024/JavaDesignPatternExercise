package com.han.designpattern.behaviour.strategy;

/**
 * 立减促销模式
 */
public class LiJianStrategy implements PomotionStrategy {
    @Override
    public void doPomotion() {
        System.out.println("立刻减去20元！");
    }
}
