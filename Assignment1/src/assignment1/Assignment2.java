/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

/**
 *
 * @author namsys
 */
import java.util.*;
import java.io.*;

public class Assignment2 {

    public static void main(String[] args) {
        int x = 5;
        char[] chars = new char[x];
        for (int i = 0; i < x; i++) {
            chars[i] = 'x';
            chars[x - 1 - i] = 'x';
            for (int j = 0; j < x; j++) {
                if (j == i || j == (x - 1 - i)) {
                    continue;
                }
                chars[j] = ' ';
            }
            System.out.println(new String(chars));
        }
    }
}

