package com.han.designpattern.behaviour.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * 将策略和工厂模式结合使用
 */
public class PomotionStrategyFactory {
    private static final Map<String, PomotionStrategy> POMOTION_STRATEGY_MAP = new HashMap<String, PomotionStrategy>();
    /**
     * 无促销
     */
    private static final EmptyStrategy EMPTY_STRATEGY = new EmptyStrategy();

    static {
        POMOTION_STRATEGY_MAP.put(PomotionStrategyKey.FAN_XIAN, new FanXianStrategy());
        POMOTION_STRATEGY_MAP.put(PomotionStrategyKey.LI_JIAN, new LiJianStrategy());
        POMOTION_STRATEGY_MAP.put(PomotionStrategyKey.MAN_JIAN, new ManJianStrategy());
    }

    private PomotionStrategyFactory() {
    }

    /**
     * 获取策略模式
     *
     * @param pomotioanStrategyKey 通过{@link PomotionStrategyKey}中的key，来获取对于策略
     * @return 策略类
     */
    public static PomotionStrategy getPomotionStrategy(String pomotioanStrategyKey) {
        PomotionStrategy pomotionStrategy = POMOTION_STRATEGY_MAP.get(pomotioanStrategyKey);
        return pomotionStrategy == null ? EMPTY_STRATEGY : pomotionStrategy;
    }

    public interface PomotionStrategyKey {
        String LI_JIAN = "LIJIAN";
        String FAN_XIAN = "FANXIAN";
        String MAN_JIAN = "MANJIAN";
    }
}
