package com.lombok.learning;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;

@Getter @Setter @ToString
public class Employee {

    int eid;
    String name;
    @Autowired
    Address address;

}
