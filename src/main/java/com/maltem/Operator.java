package com.maltem;

public enum Operator {

    PLUS,
    MINUS;

    public static Operator getOp(String op) {
        switch(op) {
            case "+": return PLUS;
            case "-": return MINUS;

        }
        return null;
    }
}
