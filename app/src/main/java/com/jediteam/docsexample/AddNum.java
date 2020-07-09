package com.jediteam.docsexample;

import androidx.annotation.IntRange;

import java.io.IOException;

/**
 * <h1>Add Two Numbers!</h1>
 * The AddNum program implements an application that
 * simply adds two given integer numbers and Prints
 * the output on the screen.
 * <p>
 * <b>Note:</b> Giving proper comments in your program makes it more
 * user friendly and it is assumed as a high quality code.
 *
 * @author  Zara Ali
 * @version 1.0
 * @since   2014-03-12
 * @deprecated
 */
public class AddNum {
    public static final int MAX_VALUE = 12400;
    public static final int MIN_VALUE = 0;
    /**
     * This method is used to add two integers. This is
     * a the simplest form of a class method, just to
     * show the usage of various javadoc Tags.
     * @param numA This is the first paramter to addNum method
     * @param numB  This is the second parameter to addNum method
     * @return int This returns sum of numA and numB.
     */
    public int addNum(@IntRange(from = MIN_VALUE, to = MAX_VALUE) int numA, int numB) {
        return numA + numB;
    }

    /**
     * this method is used divide 2 intergest {@code numA} and {@code numB}, hthis is form to make javadocs
     * @param numA this is the first paramter
     * @param numB this is the second paramter
     * @return int this is return divide of numA for numB
     * @exception IllegalArgumentException when the second number {@code numB}is equal {@value MIN_VALUE}
     * @see IllegalAccessException
     * @see #addNum
     *
     */
    public int divideNum(int numA, int numB)throws IllegalArgumentException{
        if(numB == 0){
            throw new IllegalArgumentException("second number can be 0");
        }
        return numA/numB;
    }


    /**
     * This is the main method which makes use of addNum method.
     * <p class="caution">
     *     This is cation, param must have args array.
     * </p>
     * <p/>
     * it has 2 main misstion :
     * <ul>
     * <li>Entry point for operation system can start</li>
     * <li>it's independency with project </li>
     * </ul>
     * @param args Unused.
     * @return Nothing.
     * @throws IOException  On output error
     * @exception IOException On input error.
     * @see IOException
     * @see System#clearProperty(String)
     */

    public static void main(String args[]) throws IOException {
        AddNum obj = new AddNum();
        int sum = obj.addNum(100000, 20);

        System.out.println("Sum of 10 and 20 is :" + sum);
    }

    /**
     * docs {@inheritDoc sdf}
     * @return
     */
    @Override
    public String toString() {
        return super.toString();
    }
}