package uts;

import java.util.Scanner;
import java.util.Stack;

public class Validate {
    public static void main(String[] args) {
        Stack<Character> leftChar =  new Stack<Character>();
        boolean isValid = true;
        boolean isInRight = false;
        boolean isFoundEqual = false;
        boolean isNotValidCharacter = false;
        boolean isNotValidEqual = false;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan persamaan = ");
        String equation = String.join("", scanner.nextLine().split(" "));
        for (int index = 0; index < equation.length(); index++) {
            char ch = equation.charAt(index);
            if(ch != '1' && ch != '+' && ch != '=') {
                isNotValidCharacter = true;
                break;
            }
            if(ch == '+'){
                continue;
            }
            if(ch == '=' ) {
                if(isFoundEqual) {
                    isNotValidEqual = true;
                    break;
                }
                isFoundEqual = true;
                isInRight = true;
                continue;
            }
            if(!isInRight) {
                leftChar.add(ch);
            }
            if(isInRight) {
                if(
                        leftChar.size() == 0 ||
                        (leftChar.size() > 1 && index == (equation.length() - 1))
                ) {
                    isValid = false;
                    break;
                } else {
                    leftChar.pop();
                }
            }
        }
        if(!isFoundEqual) {
            System.out.println("Bukan sebuah persamaan karena tidak ada tanda =");
        }
        else if(isNotValidCharacter) {
            System.out.println("Tidak valid karena karakter yang dijinkan hanya 1, +, dan =");
        }
        else if (isNotValidEqual) {
            System.out.println("Tidak valid karena hanya satu tanda sama dengan yang diijinkan");
        }
        else if(isValid) {
            System.out.println("Valid");
        } else {
            System.out.println("Tidak valid");
        }
    }
}
