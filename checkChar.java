import java.util.*;
public class checkChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter A Character: ");
        String chr = scan.nextLine();
        switch(chr){
            case "a":
            System.out.print(chr+" is a vowel character ");
            break;
            case "e":
            System.out.print(chr+" is a vowel character ");
            break;
            case "i":
            System.out.print(chr+" is a vowel character ");
            break;
            case "o":
            System.out.print(chr+" is a vowel character ");
            break;
            case "u":
            System.out.print(chr+" is a vowel character ");
            break;
            case "A":
            System.out.print(chr+" is a vowel character ");
            break;
            case "E":
            System.out.print(chr+" is a vowel character ");
            break;
            case "I":
            System.out.print(chr+" is a vowel character ");
            break;
            case "O":
            System.out.print(chr+" is a vowel character ");
            break;
            case "U":
            System.out.print(chr+" is a vowel character ");
            break;
            default :   System.out.print(chr+" is a consonant character ");
            break;
        }
        scan.close();
    }
}
