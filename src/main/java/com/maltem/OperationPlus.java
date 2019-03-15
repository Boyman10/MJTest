package com.maltem;

public class OperationPlus implements Operation {
    @Override
    public int operation(int left, int right) {
        return left+right;
    }
}
