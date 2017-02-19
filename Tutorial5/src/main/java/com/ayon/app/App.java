package com.ayon.app;

import com.google.common.base.Optional;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Optional<Integer> opt = Optional.of(new Integer(10));
        if (opt.isPresent()) {
            System.out.println(opt.get());
        }
    }
}
