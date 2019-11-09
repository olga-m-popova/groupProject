package replit;

import java.util.Scanner;

public class passwordValidator {
    public static void main(String[] args) {


            Scanner scanner = new Scanner(System.in);

            String n1 = "Abcdefghi1$";
            // add some changes

            int l = n1.length();

            int countLowerCase = 0;
            int countUpperCase = 0;
            int countDigits = 0;
            int countSpecial = 0;
            for (int i = 0; i < l; i++) {
                if (((int) n1.charAt(i)) >= 65 && ((int) n1.charAt(i)) <= 90) {
                    countUpperCase++;
                }
                if
                (((int) n1.charAt(i)) >= 97 && ((int) n1.charAt(i)) <= 122) {
                    countLowerCase++;
                }
                if
                (((int) n1.charAt(i)) >= 48 && ((int) n1.charAt(i)) <= 57) {
                    countDigits++;
                }
                if
                (((int) n1.charAt(i)) >= 33 && ((int) n1.charAt(i)) <= 47) {
                    countSpecial++;
                }
            }

            if (countUpperCase == 0) {
                System.out.println("Password should contain at least 1 uppercase number ");
                //break;
            } else if (countLowerCase == 0) {
                System.out.println("Password should contain at least 1 lowercase number");
                //break;
            } else if (countDigits == 0) {
                System.out.println("Password should contain at least 1 digit ");
                //break;
            } else if (countSpecial == 0) {
                System.out.println("Password should contain at least 1 of these special characters: ~`!@#$%^&*()+=_-{}[]|:;”’?/<>,.");
            } else if (countDigits > 0 && countLowerCase > 0 && countUpperCase > 0 && countSpecial > 0) {
                System.out.println("Your password is accepted");
            }
        }
    }













