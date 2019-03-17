package com.maltem;

import java.lang.reflect.InvocationTargetException;

public class OperationImpl<T> implements Operation {

    private Operator operator;
    private int leftOperand, rightOperand;

    public OperationImpl(String ope) {
        this.operator = Operator.getOp(ope);
    }

    @Override
    public int operation(int left, int right) {

        leftOperand = left;
        rightOperand = right;

        try {
            System.out.println("doing..."+this.operator);
            return (int)this.getClass().getMethod("do" + this.operator.toString()).invoke(this);

        }
        catch (NoSuchMethodException e) {
            System.err.println("no such method " + e.getMessage());
        }
        catch (IllegalAccessException e) {
            System.err.println("no such illegal " + e.getMessage());
        }
        catch (InvocationTargetException e) {

            System.err.println("no such invocation " + e.getMessage());
        }
        return 0;
    }

    public int doMINUS() {
        return leftOperand - rightOperand;
    }
    public int doPLUS() {
        return leftOperand + rightOperand;
    }
}
