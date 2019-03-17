package com.maltem;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);
        System.out.println( "Please enter an operation (ie: 2+6)" );

        String str = in.nextLine();

        System.out.println(compute(str));
    }

    public static String compute(String str) {


        Pattern p = Pattern.compile("(\\d)+([+-])(\\d)+");

        Matcher m = p.matcher(str);

        boolean b = m.matches();

        Operation operation ;

        int l,r;
        String o;

        if (b && m.groupCount() > 2) {

            l = Integer.valueOf(m.group(1));
            r = Integer.valueOf(m.group(3));
            o = m.group(2);

            operation = new OperationImpl(o);


           return String.valueOf(operation.operation(l,r));

        }
        else
        return "Error";
    }




}
