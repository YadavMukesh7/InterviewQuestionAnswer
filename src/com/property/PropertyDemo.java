package com.property;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyDemo {
    public static void main(String[] args) throws IOException {
        Properties p = new Properties();
        FileInputStream fsi = new FileInputStream("application.properties");
        p.load(fsi);
        System.out.println(p);
    }
}
