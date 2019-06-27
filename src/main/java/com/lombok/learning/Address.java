package com.lombok.learning;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@Slf4j
public class Address {

    String city;
    String state;

    private void startTest() {
        log.info("In Address()");
    }

}
