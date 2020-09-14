package CodingTest;

import java.util.Scanner;

public class plenaDataMain {

    public static void main(String[] args) { // Main Class

        plenaData pd = new plenaData(); // pd is object of plenaData class

        Scanner sc = new Scanner(System.in); // Scanner sc.next to take input from user via console.

        pd.codeChallenge(sc.next()); // called codechallenge function and passed user entered string into it.
    }
}
