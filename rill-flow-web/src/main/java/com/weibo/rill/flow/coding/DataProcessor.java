package com.weibo.rill.flow.coding;

/**
 * @author moqi
 * On 2024/3/21 18:58
 */
public interface DataProcessor<T> {
    T process(T data);
}
