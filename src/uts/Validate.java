package uts;

import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.util.Scanner;
import java.util.Stack;

public class Validate {
    public static void main(String[] args) {
        Stack<Character> leftChar =  new Stack<Character>();
        Stack<Character> rightChar =  new Stack<Character>();
        boolean isValid = true;
        boolean isInRight = false;
        boolean isFoundEqual = false;
        boolean isNotValidCharacter = false;
        boolean isNotValidEqual = false;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan persamaan = ");
        String equation = scanner.nextLine();
        char[] equationCharArray = equation.toCharArray();
        for (int i = 0; i < equationCharArray.length; i++) {
            char ch = equationCharArray[i];
            if(ch == ' '){
                continue;
            }
            if(ch != '1' && ch != '+' && ch != '=') {
                isNotValidCharacter = true;
                break;
            }
            if(ch == '=' ) {
                if(isFoundEqual) {
                    isNotValidEqual = true;
                    break;
                }
                isInRight = true;
                continue;
            }
            if(ch == '+') {
                continue;
            }
            if(!isInRight) {
                leftChar.add(ch);
            }
            if(isInRight) {
                rightChar.add(ch);
                if(leftChar.size() == 0) {
                    isValid = false;
                } else {
                    leftChar.pop();
                }
            }
        }
        if(isNotValidCharacter) {
            System.out.println("Tidak valid karena karakter yang dijinkan hanya 1, +, dan =");
        }
        else if (isNotValidEqual) {
            System.out.println("Tidak valid karena hanya satu tanda sama dengan yang diijinkan");
        }
        else if(isValid) {
            System.out.println("valid");
        } else {
            System.out.println("tidak valid");
        }
    }
}
