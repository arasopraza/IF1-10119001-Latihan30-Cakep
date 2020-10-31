import java.util.Scanner;
/**
 *
 *  @author
 * NAMA     : Arsy Opraza Akma
 * KELAS    : IF1
 * NIM      : 10119001
 * Deskripsi Program: Program ini berisi tentang pertanyaan
 * mengerjakan latihan ini sendiri atau tidak
 */

public class Cakep {
    public static void main(String[] args) {
        Scanner scanner;
        String jawab;

        System.out.println((char) 27 + "[31mKamu " + (char) 27 + "[32mngerjain sendiri " + (char) 27 + "[33mlatihan 17 sampe " + (char) 27 + "[34mlatihan 30 ini?" + "\u001B[0m");
        System.out.print((char) 27 + "[34mJawab " + (char) 27 + "[31m(Yoi/Enggak) " + (char) 27 + "[0m");
        scanner = new Scanner(System.in);
        jawab = scanner.next();

        if (jawab.equals("yoi")) {
            System.out.print("\n");
            System.out.print(((char) 27 + "[31mCakep Bener. " + (char) 27 + "[35mGood Job "));
        } else if (jawab.equals("ENGGAK")) {
            System.out.print("\n");
            System.out.println(((char) 27 + "[31mTetep cakep sih. "));
            System.out.println(((char) 27 + "[96mSing penting paham konsep nya yee. "));
            System.out.print(((char) 27 + "[30mKeep the code work dude"));
        }
    }
}
