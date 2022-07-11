/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vernamcipher;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class VernamCipher { public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a String: ");
        String str = sc.nextLine();
        String st = "";
        String otp;
        System.out.println("Enter OTP(One Time Pad): ");
        otp = sc.nextLine();
        char m, n;
        int p1 = 0, p2 =0;
        char c[] = new char[] { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',
                'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
        int n1[] = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24,
                25 };
        if (str.length() != otp.length()) {

            System.out.println("Please enter OTP as the same length of string: ");
            otp = sc.nextLine();
        }
        for (int i = 0; i < str.length(); i++) 
        {
            m = (char) (str.charAt(i));
            n = (char) (otp.charAt(i));
            for (int j = 0; j<c.length; j++) 
            {
                if (m == c[j]) 
                {
                    p1 = n1[j];
                }
                if (n == c[j]) 
                {
                    p2 = n1[j];
                }
            }
            int p = p1 + p2;
            System.out.println(p1 + "+" + p2 + " = ");
            System.out.println(p);
            if (p > 26) {
                p = p - 26;
            }
            char c1 = c[p];
            System.out.println("\n\tCHARACTER at " + p + " is " + c1);
            st = st + c1;
        }
        System.out.println("---------------------------------------------");
        System.out.println("Cipher text is " + st);
    }
}
 

    
    

