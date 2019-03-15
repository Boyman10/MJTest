package com.maltem;

public class Operation<Operator> implements Operation {
    @Override
    public int operation(int left, int right) {
        return left-right;
    }
}
