package com.han.designpattern.behaviour.strategy;

/**
 * 促销策略执行类
 */
public class PomotionActive {

    private PomotionStrategy pomotionStrategy;


    public PomotionActive(PomotionStrategy pomotionStrategy) {
        this.pomotionStrategy = pomotionStrategy;
    }

    /**
     * 执行促销策略
     */
    public void excutePomotion(){
        pomotionStrategy.doPomotion();
    }
}
