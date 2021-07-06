package com.company;

public class Average {

    public static int averageAge(int[] ages) {
        int sum = 0; // all ages is "sum"
        for (int i = 0; i < ages.length; i++) { //looping will start with 0 and will look until we go through all ppl given

            sum = sum + ages[i];

        }
        return sum / ages.length; //ages lenght gives the element
    }
}
