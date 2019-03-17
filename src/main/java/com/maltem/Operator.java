package com.maltem;

public enum Operator {

    PLUS("Plus"),
    MINUS("Minus");

    public static Operator getOp(String op) {
        switch(op) {
            case "+": return PLUS;
            case "-": return MINUS;

        }
        return null;
    }


    private String name = "";

    //Constructeur
    Operator(String name){
        this.name = name;
    }

    public String toString(){
        return name;
    }
}
