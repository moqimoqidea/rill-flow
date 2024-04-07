package com.weibo.rill.flow.coding;

/**
 * @author moqi
 * On 2024/3/21 18:58
 */
public class TextDataProcessor implements DataProcessor<String> {
    @Override
    public String process(String data) {
        // 实现一些文本处理逻辑
        return data.toUpperCase();
    }
}
