
package activity7;

import java.util.Scanner;

public class activity7 {
    public static void main(String[] args) {
        Scanner code = new Scanner(System.in);
        
        char letter = 'i';
        System.out.println("Enter letter");
        letter = code.next().charAt(0);
        switch (letter){
            case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U':
            System.out.print("the letter is vowel.\n");
            default:
                System.out.println("The letter " + letter + " is a consonant.");
    }
    
    }
    
}
