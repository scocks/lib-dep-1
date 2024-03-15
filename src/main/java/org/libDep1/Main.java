package org.libDep1;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        String[] result = library.count(10);
        for (int i = 0; i < 10; i++) {
            System.out.println(result[i]);
        }
        System.out.println("lib-dep-1");
    }
}