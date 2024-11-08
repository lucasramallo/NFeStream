package com.github.lucasramallo.nfestream.core.util;

public class EnumMatcher {

    public static <E extends Enum<E>> boolean matchEnum(Class<E> enumClass, String value) {
        for (E enumConstant : enumClass.getEnumConstants()) {
            if (enumConstant.toString().equalsIgnoreCase(value)) {
                return true;
            }
        }
        return false;
    }
}