package com.han.designpattern.behaviour.strategy;

public class TestStrategy {

//    public static void main(String[] args) {
//
//        PomotionActive active618=new PomotionActive(new FanXianStrategy());
//        PomotionActive active1111=new PomotionActive(new ManJianStrategy());
//        active618.excutePomotion();
//        active1111.excutePomotion();
//    }

//    public static void main(String[] args) {
//
//        PomotionActive active=null;
//        String strategy="FANXIAN";
//        if (strategy.equals("LIJIAN")) {
//            active=new PomotionActive(new LiJianStrategy());
//        } else if (strategy.equals("FANXIAN")) {
//            active=new PomotionActive(new FanXianStrategy());
//        }
//        active.excutePomotion();
//    }

    public static void main(String[] args) {
        String pomotionKey = PomotionStrategyFactory.PomotionStrategyKey.FAN_XIAN;
        PomotionStrategy strategy = PomotionStrategyFactory.getPomotionStrategy(pomotionKey);
        strategy.doPomotion();
    }
}
