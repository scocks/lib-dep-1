package org.king.libdep1;
public class Library {
    public String[] count(Integer number) {
        String[] lines = new String[number];
        for (int i = 0; i < number; i++) {
            lines[i] = "count from libdep1: i = " + i;
        }
        return lines;
    }
    public String greet(String name) {
        return "greet from libdep1, " + name + "!";
    }
    public String unused1(String name) {
        return "unused1 from libdep1, " + name + "!";
    }
    public String unused2(String name) {
        return "unused2 from libdep1, " + name + "!";
    }
    public String unused3(String name) {
        return "unused3 from libdep1, " + name + "!";
    }
    public String unused4(String name) {
        return "unused5 from libdep1, " + name + "!";
    }
    public String unused5(String name) {
        return "unused5 from libdep1, " + name + "!";
    }
    public String unused6(String name) {
        return "unused6 from libdep1, " + name + "!";
    }
    public String unused7(String name) {
        return "unused7 from libdep1, " + name + "!";
    }
    public String unused8(String name) {
        return "unused8 from libdep1, " + name + "!";
    }    
    public String unused9(String name) {
        return "unused9 from libdep1, " + name + "!";
    }
}