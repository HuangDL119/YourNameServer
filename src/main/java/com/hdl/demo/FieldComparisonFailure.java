package com.hdl.demo;

/**
 * Models a failure when comparing two fields.
 */
public class FieldComparisonFailure {
    private final String field;
    private final Object expected;
    private final Object actual;

    public FieldComparisonFailure(String field, Object expected, Object actual) {
        this.field = field;
        this.expected = expected;
        this.actual = actual;
    }

    public String getField() {
        return field;
    }

    public Object getExpected() {
        return expected;
    }

    public Object getActual() {
        return actual;
    }
}