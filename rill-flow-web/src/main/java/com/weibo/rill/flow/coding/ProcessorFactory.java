package com.weibo.rill.flow.coding;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public abstract class ProcessorFactory {
    private static Map<String, Class<? extends DataProcessor<?>>> processorMap = new HashMap<>();

    static {
        // 假设这里注册了一系列的处理器类
        processorMap.put("numeric", NumericDataProcessor.class);
        processorMap.put("text", TextDataProcessor.class);
        // 更多的处理器可以在这里注册
    }

    public static <T> DataProcessor<T> createProcessor(String type) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        if (!processorMap.containsKey(type)) {
            throw new IllegalArgumentException("Processor type not found: " + type);
        }
        Class<? extends DataProcessor<?>> processorClass = processorMap.get(type);
        DataProcessor<T> processor = (DataProcessor<T>) processorClass.getDeclaredConstructor().newInstance();
        return processor;
    }
}





