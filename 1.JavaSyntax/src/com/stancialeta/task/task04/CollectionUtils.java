package com.stancialeta.task.task04;

import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Map;

public class CollectionUtils {

    public static boolean isNotEmpty(List<String> list) {
        return list != null && list.size() > 0;
    }

    public static boolean isEmpty(List<String> list) {
        return !isNotEmpty(list);
    }

    public static boolean isNotEmpty(Set<String> set) {
        return set != null && set.size() > 0;
    }


    public static boolean isNotEmpty(Map<String, String> map) {
        return map != null && map.size() > 0;
    }

    public static boolean isNotEmpty(Queue<String> queue) {
        return queue != null && queue.size() > 0;
    }

}
