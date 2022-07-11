/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caesar.cipher;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class CaesarCipher {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String message, encryptedMessage = "";
        int key;
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter message to encrypt : ");
        message = sc.nextLine();
        
        System.out.println("Enter key : ");
        key = sc.nextInt();
        
        for(int i = 0; i < message.length(); i++) {
            ch = message.charAt(i);
            
            if(ch >= 'a' && ch <= 'z') {
                ch = (char) (ch + key);
                if(ch > 'z') {
                    ch = (char) (ch - 'z' + 'a' - 1);
                }
                encryptedMessage += ch;
            } else if(ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + key);
                if(ch > 'Z') {
                    ch = (char) (ch - 'Z' + 'A' - 1);
                }
                encryptedMessage += ch;
            } else {
                encryptedMessage += ch;
            }
        }
        
        System.out.println("Encrypted Message : "+ encryptedMessage);
    }
    
}
