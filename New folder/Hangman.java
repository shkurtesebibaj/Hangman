

import java.util.Scanner;

public class Hangman {

   private static String[] words = {"dokumentet","aeroplani","peshku","lulja", "zhurma", "shiu",
                        "profesioni", "karantina", "uji","politika","informata" };
   private static String word = words[(int) (Math.random() * words.length)];
   private static String asterisk = new String(new char[word.length()]).replace("\0", "*");
   private static int count = 0;

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
   
      while (count < 7 && asterisk.contains("*")) {
         System.out.println("Mendo ndonje shkronje ne fjale");
         System.out.println(asterisk);
         String guess = sc.next();
         hang(guess);
      }
      sc.close();
   }

   public static void hang(String guess) {
      String newasterisk = "";
      for (int i = 0; i < word.length(); i++) {
         if (word.charAt(i) == guess.charAt(0)) {
            newasterisk += guess.charAt(0);
         } else if (asterisk.charAt(i) != '*') {
            newasterisk += word.charAt(i);
         } else {
            newasterisk += "*";
         }
      }
   
      if (asterisk.equals(newasterisk)) {
         count++;
         hangmanImage();
      } else {
         asterisk = newasterisk;
      }
      if (asterisk.equals(word)) {
         System.out.println("Sakte! Ti fitove! Fjala ishte: " + word);
      }
   }

   public static void hangmanImage() {
      if (count == 1) {
         System.out.println("Mendim i gabuar, provo perseri");
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println("___|___");
         System.out.println();
      }
      if (count == 2) {
         System.out.println("Mendim i gabuar, provo perseri");
         System.out.println("   |");
         System.out.println("   |");
         System.out.println("   |");
         System.out.println("   |");
         System.out.println("   |");
         System.out.println("   |");
         System.out.println("   |");
         System.out.println("___|___");
      }
      if (count == 3) {
         System.out.println("Mendim i gabuar, provo perseri");
         System.out.println("   ____________");
         System.out.println("   |");
         System.out.println("   |");
         System.out.println("   |");
         System.out.println("   |");
         System.out.println("   |");
         System.out.println("   |");
         System.out.println("   | ");
         System.out.println("___|___");
      }
      if (count == 4) {
         System.out.println("Mendim i gabuar, provo perseri");
         System.out.println("   ____________");
         System.out.println("   |          _|_");
         System.out.println("   |         /   \\");
         System.out.println("   |        |     |");
         System.out.println("   |         \\_ _/");
         System.out.println("   |");
         System.out.println("   |");
         System.out.println("   |");
         System.out.println("___|___");
      }
      if (count == 5) {
         System.out.println("Mendim i gabuar, provo perseri");
         System.out.println("   ____________");
         System.out.println("   |          _|_");
         System.out.println("   |         /   \\");
         System.out.println("   |        |     |");
         System.out.println("   |         \\_ _/");
         System.out.println("   |           |");
         System.out.println("   |           |");
         System.out.println("   |");
         System.out.println("___|___");
      }
      if (count == 6) {
         System.out.println("Mendim i gabuar, provo perseri");
         System.out.println("   ____________");
         System.out.println("   |          _|_");
         System.out.println("   |         /   \\");
         System.out.println("   |        |     |");
         System.out.println("   |         \\_ _/");
         System.out.println("   |           |");
         System.out.println("   |           |");
         System.out.println("   |          / \\ ");
         System.out.println("___|___      /   \\");
      }
      if (count == 7) {
         System.out.println("LOJA MBAROJ!");
         System.out.println("   ____________");
         System.out.println("   |          _|_");
         System.out.println("   |         /   \\");
         System.out.println("   |        |     |");
         System.out.println("   |         \\_ _/");
         System.out.println("   |          _|_");
         System.out.println("   |         / | \\");
         System.out.println("   |          / \\ ");
         System.out.println("___|___      /   \\");
         System.out.println("LOJA MBAROJ!Ti Humbe! Fjala ishte:" + word);
      }
   }
}