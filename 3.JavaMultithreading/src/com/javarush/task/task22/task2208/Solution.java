package com.javarush.task.task22.task2208;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* 
Формируем WHERE
*/

public class Solution {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("name", "Ivanov");
        map.put("country", "Ukraine");
        map.put("city", "Kiev");
        map.put("age", null);

        System.out.println(getQuery(map));
    }

    public static String getQuery(Map<String, String> params) {
        StringBuilder queryBuilder = new StringBuilder();
        for (String s : params.keySet()) {
            String value = params.get(s);
            if (value == null) {
                continue;
            }
            if (queryBuilder.toString().length() != 0) {
                queryBuilder.append(" and ");
            }
            queryBuilder.append(s + " = '" + value + "'");
        }
        return queryBuilder.toString();
//        String result = "";
//        StringBuilder stringBuilder = new StringBuilder(result);
//        for (Map.Entry<String, String> pair : params.entrySet()) {
//            String key = pair.getKey();
//            String value = pair.getValue();
//            if (pair.getValue() == null)
//                continue;
//            stringBuilder.append(String.format("%s = '%s' and ", key, value));
//        }
//        if (stringBuilder.length() != 0) {
//            stringBuilder.delete(stringBuilder.lastIndexOf(" and"), stringBuilder.length());
//        }
//
//        return stringBuilder.toString();
    }
}
