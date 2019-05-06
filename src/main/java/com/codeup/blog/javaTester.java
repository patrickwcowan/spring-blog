package com.codeup.blog;

public class javaTester {
    private static boolean doesArray(int input, int[] input2) {
        boolean output = false;
        for (int i = 0; i < input2.length; i++) {
            if (input2[i] == input) {
                output = true;
            }
        } return output;
    }

    private static boolean doesArray(String input, String[] input2) {
        boolean output = false;
        for (int i = 0; i <input2.length;i++) {
            if (input2[i].equals(input)) output = true;
        } return output;
    }


    public static void main(String[] args) {

        int[] num = {2,8,9,27,28,192};
        String[] string = {"blue","bottle","phone","computer","name"};

        System.out.println(doesArray(2,num));
        System.out.println(doesArray("name", string));






    }
}
