package com.weibo.rill.flow.common.util;

import java.util.ArrayList;
import java.util.List;

/**
 * @author moqi
 * On 2024/6/13 10:17
 */
public class WecodeJavaTest {

    private Integer getFirstGreaterThanTen(List<Integer> numbers) {
        for (Integer number : numbers) {
            if (number > 10) {
                return number;
            }
        }
        return null;
    }


    private String findFirstNum() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        for (Integer i : list) {
            if (i > 5) {
                return i.toString();
            }
        }
        return "";
    }

}
