package myclassloaders;

import java.util.ArrayList;
import java.util.logging.Logger;

public class PrintClassLoaders {
    public static void main(String[] args) {
        printClassLoaders();
    }

    private static void printClassLoaders() {
        System.out.println("Classloader of this class :: "+PrintClassLoaders.class.getClassLoader());
//        System.out.println("Classloader of Logging class :: "+ Logging.class.getClassLoader());
        System.out.println("Classloader of ArrayList class :: "+ ArrayList.class.getClassLoader());
    }
}
