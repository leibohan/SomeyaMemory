package com.nanimono.simpleoddb.object;

import java.io.DataOutputStream;
import java.io.IOException;
import java.lang.Object;

public class IntField implements Field {

    private int value;

    public int getValue() { return value; }

    public IntField(int value) { this.value = value; }

    @Override
    public String toString() { return Integer.toString(value); }

    @Override
    public int hashCode() { return Integer.hashCode(value); }

    @Override
    public boolean equals(Object field) { return ((IntField) field).value == value; }

    @Override
    public void serialize(DataOutputStream dos) throws IOException {
        dos.writeInt(value);
    }

    // TODO compare method

    @Override
    public TypeEnum getType() {
        return TypeEnum.INT_TYPE;
    }

    @Override
    public int getSize() {
        return TypeEnum.INT_TYPE.getSize();
    }
}
