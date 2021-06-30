package com.example.demo.utils;

import java.math.BigDecimal;
import java.math.BigInteger;

public class DataUtils {
    public static Long safeToLong(Object obj1, Long defaultValue) {
        Long result = defaultValue;
        if (obj1 != null) {
            if (obj1 instanceof BigDecimal) {
                return ((BigDecimal) obj1).longValue();
            }
            if (obj1 instanceof BigInteger) {
                return ((BigInteger) obj1).longValue();
            }
            try {
                result = Long.parseLong(obj1.toString());
            } catch (Exception ignored) {
                System.out.println(ignored.getMessage());
            }
        }

        return result;
    }

    public static Long safeToLong(Object obj1) {
        return safeToLong(obj1, null);
    }


    public static String safeToString(Object obj1) {
        return safeToString(obj1, "");
    }

    public static String safeToString(Object obj1, String defaultValue) {
        if (obj1 == null || obj1.toString().isEmpty()) {
            return defaultValue;
        }

        return obj1.toString();
    }

    public static Double safeToDouble(Object obj1) {
        return safeToDouble(obj1, 0.0);
    }

    public static Double safeToDouble(Object obj1, Double defaultValue) {
        Double result = defaultValue;
        if (obj1 != null) {
            try {
                result = Double.parseDouble(obj1.toString());
            } catch (Exception ignored) {
                System.out.println(ignored.getMessage());
            }
        }

        return result;
    }
}
