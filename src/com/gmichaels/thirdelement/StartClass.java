package com.gmichaels.thirdelement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StartClass {

    private static BufferedReader reader;

    private static String userText = null;
    private static String editedUserString = null;
    private static char[] str = null;

    public static void main(String[] args) {

        try {

            reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter Your String: ");
            userText = reader.readLine();

            checkString(userText);

        } catch (IOException ioe) {

            System.err.println(ioe.getMessage());

        }

    }

    // Check user string.
    private static void checkString(String s) {

        str = s.toCharArray();

        if (str.length % 3 == 0) {

            System.out.println("You entered string: " + userText);

            returnNewString(str);

            System.out.println("New String: " + editedUserString);

        } else {

            System.out.println("String is not a multiple of 3!");

        }

    }

    // Return edited string.
    private static String returnNewString(char[] s) {

        char[] newStr = new char[s.length];
        int j = 0;

        for (int i = 0; i < s.length; i++) {

            if (((i+1) % 3) != 0) {

                newStr[j] = s[i];
                j++;

            }

        }

        editedUserString = String.valueOf(newStr);
        return editedUserString;

    }

}