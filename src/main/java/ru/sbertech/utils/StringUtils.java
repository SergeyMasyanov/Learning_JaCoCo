package ru.sbertech.utils;

/**
 * Created by davlet on 5/13/18.
 */
public class StringUtils {
    public String echo(String s){
        return s;
    }

    public char getFirstLetter(String s){
        assert s != null;
        return s.charAt(0);
    }

    public char getLastLetter(String s){
        assert s != null;
        return s.charAt(s.length()-1);
    }
}
