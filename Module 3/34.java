// com.utils/module-info.java

module com.utils {
    exports com.utils;
}



// com.utils/Utils.java


package com.utils;

public class Utils {
    public static String greet(String name) {
        return "Hello, " + name;
    }
}
