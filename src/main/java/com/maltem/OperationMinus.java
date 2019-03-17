package com.maltem;

public class OperationMinus implements Operation {

    @Override
    public int operation(int left, int right) {
        return left  - right;
    }
}
