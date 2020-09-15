
package WheelOfFortune;
import java.util.*;

public class WheelOfFortune {
public static int tempall;
public static int fin;

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("WHEEL OF FORTUNE");
        easy();
        if(tempall != 0){
            medium();
            if(fin != 0){
                hard();
            }
        }
    }

    private static void easy() {
        int allowance = 2000;
   int bilang=0;
   int flag2=1;
   int flag3=1;
   while(bilang<3){
    String[][] words = {{"dog","cat","fish"},			//animals should be lowercase
                        {"burger","pizza","spaghetti"}};	//food
    String[]categ = {"Animals","Food"};				
    int cat = (int)(Math.random()*categ.length);
    String[] vowels = {"aeiou"};
    int wor = (int) (Math.random()*words[cat].length);
    String word[] = (words[cat][wor]).split("");
    String vowel[] = (vowels[(int) (Math.random() * vowels.length)]).split("");
    String[] marks = new String[word.length];
    
    Arrays.fill(marks,"_ ");
    Scanner in  = new Scanner(System.in);
    String letter;
    
    int x=0;
    int totalall,sumtotalall;
    int minustotal;
    int flag=1;
    int vowminus;
    HashSet <String> set = new HashSet();
    int cntr=0; 

        System.out.println("                    ROUND: " + (bilang+1) +"\n");
  
    while(cntr<word.length) {
        
        if(allowance<=0){
            bilang=3;
            flag2=0;
            break;
        }
        
        int[] wheelval = {100,200,300,400,500,600};
    
        int randwheelval = (int) (Math.random()* 5 + 1);
        System.out.println("WHEEL VALUE: $" + wheelval[randwheelval]);
        System.out.println("ALLOWANCE: $" + allowance);
        System.out.println("This is your word!: " + String.join("", marks).toUpperCase());
        System.out.println("CATEGORY: " + categ[cat]);
        System.out.print("Guess a letter/word: ");
        letter = in.next().toLowerCase();
 
        if(letter.length()>1){
            if(words[cat][wor].equals(letter)){
                System.out.println("YOU GOT IT");
                allowance = allowance + (wheelval[randwheelval] *(word.length-cntr));
                System.out.println("Guessed letter/s: " + (word.length-cntr) + "*" + wheelval[randwheelval]);
                System.out.println("Money: $" + allowance);
                flag3=0;
                break;
            }
            else{
                allowance = allowance - wheelval[randwheelval];
                 System.out.println("WRONG! " + allowance + "-" + wheelval[randwheelval]);
                System.out.println("Money: $" + allowance);
            }
        }
        else{
       if(set.contains(letter) == false)
       {
        for (int i = 0; i < word.length; i++) {
            if(word[i].equals(letter)){
                x++;
                cntr++;
                marks[i] = word[i];
                set.add(letter);
            } 
          }
           for (String vowel1 : vowel) {
               if (vowel1.equals(letter)) {
                   System.out.println("VOWEL PAYMENT $25:  " + allowance + "-" + "$25");
                   vowminus = allowance - 25;
                   allowance = vowminus;
                   System.out.println("Money: $" + allowance);
                   System.out.println("");
               } else if (vowel1.equals(letter) == false && x>0) {
                   flag=1;
               } else if(x==0){
                   flag=2;
               }
           }  
        }
       else{
           System.out.println("You already entered that\n");
       }
       
       switch(flag)
       {
           case 1:
               totalall =(wheelval[randwheelval]*x);
                System.out.println("Guessed letter/s:  " + x + "   x" + wheelval[randwheelval]);
                sumtotalall = totalall + allowance ;
                allowance = sumtotalall;
                System.out.println("Money: $" + allowance);
                System.out.println("");
               break;
           case 2:
               System.out.println("WRONG! $" + allowance + "- $" + wheelval[randwheelval]);
                minustotal = allowance-wheelval[randwheelval];
                allowance = minustotal;
                System.out.println("Money: $" + allowance);
                System.out.println("");
               break;
       }
       if(cntr == word.length){
           flag3 = 0;
       }
        x=0;
    }
    }
    if(flag3 == 0){
    System.out.println("Congratulations you " + words[cat][wor].toUpperCase()+" the Defense");
       System.out.println("TOTAL:   $" + allowance + "\n\n");
       bilang++;
    }
    }
   if(flag2==1){
       System.out.println("                CONGRATS MOVING ON TO MEDIUM!");
       tempall = allowance;
   }
   else{
       System.out.println("                 YOU LOSE! BANKRUPT!");
   }
        
    }

    private static void medium() {
       int allowance;
       allowance = tempall;
   int bilang=0;
   int flag2=1;
   int flag3=1;
   while(bilang<2){
    String[][] words = {{"moose","zebra","tiger","lion"},			//animals lowercase 
                        {"cake","milktea","egg"},                            //foods
                        {"basketball","volleyball","soccer"}};                  //sports
    String[]categ = {"Animals","Food","Sports"};				
    int cat = (int)(Math.random()*categ.length);
    String[] vowels = {"aeiou"};
    int wor = (int) (Math.random()*words[cat].length);
    String word[] = (words[cat][wor]).split("");
    String vowel[] = (vowels[(int) (Math.random() * vowels.length)]).split("");
    String[] marks = new String[word.length];
    
    Arrays.fill(marks,"_ ");
    Scanner in  = new Scanner(System.in);
    String letter;
    
    int x=0;
    int totalall,sumtotalall;
    int minustotal;
    int flag=1;
    int vowminus;
    HashSet <String> set = new HashSet();
    int cntr=0; 

        System.out.println("                    ROUND: " + (bilang+1) +"\n");
  
    while(cntr<word.length) {
        
        if(allowance<=0){
            bilang=2;
            flag2=0;
            break;
        }
        
        int[] wheelval = {150,250,350,450,550};
        int randwheelval = (int) (Math.random()* 4 + 1 );
        System.out.println("WHEEL VALUE: $" + wheelval[randwheelval]);
        System.out.println("ALLOWANCE: $" + allowance);
        System.out.println("This is your word!: " + String.join("", marks).toUpperCase());
        System.out.println("CATEGORY: " + categ[cat]);
        System.out.print("Guess a letter/word: ");
        letter = in.next().toLowerCase();
 
        if(letter.length()>1){
            if(words[cat][wor].equals(letter)){
                System.out.println("YOU GOT IT");
                allowance = allowance + (wheelval[randwheelval] *(word.length-cntr));
                System.out.println("Guessed letter/s: " + (word.length-cntr) + "*" + wheelval[randwheelval]);
                System.out.println("Money: $" + allowance);
                flag3=0;
                break;
            }
            else{
                allowance = allowance - wheelval[randwheelval];
                 System.out.println("WRONG! " + allowance + "-" + wheelval[randwheelval]);
                System.out.println("Money: $" + allowance);
            }
        }
        else{
       if(set.contains(letter) == false)
       {
        for (int i = 0; i < word.length; i++) {
            if(word[i].equals(letter)){
                x++;
                cntr++;
                marks[i] = word[i];
                set.add(letter);
            } 
          }
           for (String vowel1 : vowel) {
               if (vowel1.equals(letter)) {
                   System.out.println("VOWEL PAYMENT $25:  " + allowance + "-" + "$25");
                   vowminus = allowance - 25;
                   allowance = vowminus;
                   System.out.println("Money: $" + allowance);
                   System.out.println("");
               } else if (vowel1.equals(letter) == false && x>0) {
                   flag=1;
               } else if(x==0){
                   flag=2;
               }
           }  
        }
       else{
           System.out.println("You already entered that\n");
       }
       
       switch(flag)
       {
           case 1:
               totalall =(wheelval[randwheelval]*x);
                System.out.println("Guessed letter/s:  " + x + "   x" + wheelval[randwheelval]);
                sumtotalall = totalall + allowance ;
                allowance = sumtotalall;
                System.out.println("Money: $" + allowance);
                System.out.println("");
               break;
           case 2:
               System.out.println("WRONG! $" + allowance + "- $" + wheelval[randwheelval]);
                minustotal = allowance-wheelval[randwheelval];
                allowance = minustotal;
                System.out.println("Money: $" + allowance);
                System.out.println("");
               break;
       }
       if(cntr == word.length){
           flag3 = 0;
       }
        x=0;
    }
    }
    if(flag3 == 0){
    System.out.println("Congratulations your word is " + words[cat][wor].toUpperCase());
       System.out.println("TOTAL:   $" + allowance + "\n\n");
       bilang++;
    }
    }
   if(flag2==1){
       System.out.println("                CONGRATS MOVING ON TO HARD");
       fin = tempall;
   }
   else{
       System.out.println("                 YOU LOSE! BANKRUPT!");
       System.out.println("                 YOU CAN STILL GET THE PRIZE OF EASY");
       System.out.println("                 YOU GOT "+ tempall);
   }
    }

    private static void hard() {
        int allowance;
        allowance = fin;
   int bilang=0;
   int flag2=1;
   int flag3=1;
   while(bilang<1){
    String[][] words = {{"hyena","rhinoceros","hippopotamus","racoon"},			//animals lowercase
                        {"afritada","lecheflan","grahamcake","blueberries"},            //foods
                        {"badminton","sepaktakraw","archery","triathon"}};	//food
    String[]categ = {"Animals","Food","Sports"};				
    int cat = (int)(Math.random()*categ.length);
    String[] vowels = {"aeiou"};
    int wor = (int) (Math.random()*words[cat].length);
    String word[] = (words[cat][wor]).split("");
    String vowel[] = (vowels[(int) (Math.random() * vowels.length)]).split("");
    String[] marks = new String[word.length];
    
    Arrays.fill(marks,"_ ");
    Scanner in  = new Scanner(System.in);
    String letter;
    
    int x=0;
    int totalall,sumtotalall;
    int minustotal;
    int flag=1;
    int vowminus;
    HashSet <String> set = new HashSet();
    int cntr=0; 

        System.out.println("                    ROUND: " + (bilang+1) +"\n");
  
    while(cntr<word.length) {
        
        if(allowance<=0){
            bilang=1;
            flag2=0;
            break;
        }
        
        int[] wheelval = {300,400,700,500,600};
        int randwheelval = (int) (Math.random()* 4 + 1);
        System.out.println("WHEEL VALUE: $" + wheelval[randwheelval]);
        System.out.println("ALLOWANCE: $" + allowance);
        System.out.println("This is your word!: " + String.join("", marks).toUpperCase());
        System.out.println("CATEGORY: " + categ[cat]);
        System.out.print("Guess a letter/word: ");
        letter = in.next().toLowerCase();
 
        if(letter.length()>1){
            if(words[cat][wor].equals(letter)){
                System.out.println("YOU GOT IT");
                allowance = allowance + (wheelval[randwheelval] *(word.length-cntr));
                System.out.println("Guessed letter/s: " + (word.length-cntr) + "*" + wheelval[randwheelval]);
                System.out.println("Money: $" + allowance);
                flag3=0;
                break;
            }
            else{
                allowance = allowance - wheelval[randwheelval];
                 System.out.println("WRONG! " + allowance + "-" + wheelval[randwheelval]);
                System.out.println("Money: $" + allowance);
            }
        }
        else{
       if(set.contains(letter) == false)
       {
        for (int i = 0; i < word.length; i++) {
            if(word[i].equals(letter)){
                x++;
                cntr++;
                marks[i] = word[i];
                set.add(letter);
            } 
          }
            for(int k=0;k<vowel.length;k++) {
                if (vowel[k].equals(letter)) {
                    System.out.println("VOWEL PAYMENT $25:  " + allowance + "-" + "$25");
                    vowminus = allowance - 25;
                    allowance = vowminus;
                    System.out.println("Money: $" + allowance);
                    System.out.println("");
                } else if (vowel[k].equals(letter) == false && x>0) {
                    flag=1;
                } else if(x==0){
                    flag=2;
                }
            }  
        }
       else{
           System.out.println("You already entered that\n");
       }
       
       switch(flag)
       {
           case 1:
               totalall =(wheelval[randwheelval]*x);
                System.out.println("Guessed letter/s:  " + x + "   x" + wheelval[randwheelval]);
                sumtotalall = totalall + allowance ;
                allowance = sumtotalall;
                System.out.println("Money: $" + allowance);
                System.out.println("");
               break;
           case 2:
               System.out.println("WRONG! $" + allowance + "- $" + wheelval[randwheelval]);
                minustotal = allowance-wheelval[randwheelval];
                allowance = minustotal;
                System.out.println("Money: $" + allowance);
                System.out.println("");
               break;
       }
       if(cntr == word.length){
           flag3 = 0;
       }
        x=0;
    }
    }
    if(flag3 == 0){
    System.out.println("Congratulations your word is " + words[cat][wor].toUpperCase());
       System.out.println("TOTAL:   $" + allowance + "\n\n");
       bilang++;
    }
    }
   if(flag2==1){
       System.out.println("                CONGRATS YOU COMPLETED THE GAME!!");
   }
   else{
       System.out.println("                 YOU LOSE! BANKRUPT!");
       System.out.println("                 YOU CAN STILL WIN THE PRIZE OF MEDIUEM");
       System.out.println("                 YOU GOT " + tempall);
   }
    }
    
}
