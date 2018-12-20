package com.tribune.test;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class TestVoid {
    public static void testVoid() {
        class hello {
            public void world() {
                System.out.println("hello world");
            }
        }
    }

    public static void main(String[] args) {
        testVoid();
    }

}