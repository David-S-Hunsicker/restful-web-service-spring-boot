package com.example.rest.webservices.restfulwebservices.filtering;


import com.fasterxml.jackson.annotation.JsonIgnore;

public class SomeBean {
    private final String field1;
    @JsonIgnore
    private final String field2;
    private final String field3;

    public SomeBean(String val1, String val2, String val3) {
        this.field1 = val1;
        this.field2 = val2;
        this.field3 = val3;
    }

    public String getField1() {
        return field1;
    }

    @JsonIgnore
    public String getField2() {
        return field2;
    }

    public String getField3() {
        return field3;
    }

    @Override
    public String toString() {
        return "SomeBean{" + "field1='" + field1 + '\'' + ", field2='" + field2 + '\'' + ", field3='" + field3 + '\'' + '}';
    }
}
