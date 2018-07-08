import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    
    static void staircase(int n) {
        for (int i = 1; i < n + 1; i++) {
            for (int a = 1; a < n + 1; a++) {
            	if (i + a > n) {
            		System.out.print("#");
            	} else {
            		System.out.print(" ");
            	}
            }
            System.out.println("");
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}
