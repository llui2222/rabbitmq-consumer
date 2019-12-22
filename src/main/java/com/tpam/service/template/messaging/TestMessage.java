package com.tpam.service.template.messaging;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TestMessage {

    private final String field1;
    private final String field2;

    @JsonCreator
    public TestMessage(@JsonProperty("field1") final String field1, @JsonProperty("field2") final String field2) {
        this.field1 = field1;
        this.field2 = field2;
    }

    public String getField1() {
        return field1;
    }

    public String getField2() {
        return field2;
    }

    @Override
    public String toString() {
        return new org.apache.commons.lang.builder.ToStringBuilder(this)
            .append("field1", field1)
            .append("field2", field2)
            .toString();
    }
}
