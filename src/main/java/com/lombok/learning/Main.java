package com.lombok.learning;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {

    public static void main(String[] args) {
        log.info("This is main program");
        Employee eRef = new Employee();
        Address a = new Address();
        eRef.setEid(101);
        eRef.setName("Sunil Jacob");

        System.out.println(eRef);
    }
}
