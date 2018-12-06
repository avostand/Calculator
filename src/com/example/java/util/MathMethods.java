package com.example.java.util;
/**
 * Hi methods
 */
class Methods {
    private static Person p = new Person("Tong", "Chen", 27);

    public static void main(String[] args) {
        System.out.println(p);
    }

    /**
     * This method is king
     * @param s1 means queen
     * @param s2 means prince
     * @return
     */
    public static double addValues(String s1, String s2) {
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        return d1 + d2;
    }

    public static double subtractValues(String s1, String s2) {
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        return d1 - d2;
    }

    public static double multiplyValues(String s1, String s2) {
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        return d1 * d2;
    }

    public static double divideValues(String s1, String s2) {
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        return d1 / d2;
        System.out.println("aaaaaa");
    }
}
