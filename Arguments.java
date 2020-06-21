import java.io.*
public class Arguments {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}

//Implementation of interface class
interface Animal{
    public boolean feed(boolean timeToEat);
    public void groom();
    public void pet();
    
}

class Gorilla implements Animal {
    public boolean feed(boolean timeToEat) {
      // put gorilla food into cage
      return true;
    }
    public void groom() {
      // lather, rinse, repeat
    }
    public void pet() {
      // pet at your own risk
    }
    public static void main(String[] args) {
       Gorilla gor = new Gorilla();
        gor.groom();
    }
}  


// Example how to implement Generics (templates in C++)
import java.util.*;
import java.io.*;

public class Main{
    public static class FavoriteClasses<Type1,Type2,Type3>{
        private Type1 favorite1;
        private Type2 favorite2;
        private Type3 favorite3;
         
        FavoriteClasses(Type1 fav1, Type2 fav2, Type3 fav3){
            this.favorite1=fav1;
            this.favorite2=fav2;
            this.favorite3=fav3;
        }
        
        public Type1 getFav1(){
            return(this.favorite1);
        }
        
        public Type2 getFav2(){
            return(this.favorite2);
        }

        public Type3 getFav3(){
            return(this.favorite3);
        }
    }
    
    public static void main(String[] args){
        ArrayList <Double> r=new ArrayList();
        r.add(6.3);
        r.add(5.9);
        
        FavoriteClasses<String,Integer,Double>a = new FavoriteClasses<>("Hello", 67, r.get(0));
        
        System.out.println("My favorites are " + a.getFav1() + ", " + a.getFav2() + ", and " + a.getFav3() + ".");
    }
}

import java.util.Scanner;
import java.io.*;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                String sf1 = String.format("%-15s",s1);
                String sf2=String.format("%03d%n", x);  
                //Complete this line
                System.out.print(sf1);
                System.out.print(sf2);
                
                
            }
            System.out.println("================================");

    }
}


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if(N < 2 || N > 20) return;
           for (int i = 1; i <= 10; i++){
            System.out.println(+N+ " x " +i+ " = " +(N*i));

        }

        scanner.close();
    }
}



import java.util.*;
import java.io.*;
class Solution{
    public static void main(String []argh)
    {

        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127){
                    System.out.println("* byte");
                    System.out.println("* short");
                    System.out.println("* int");
                    System.out.println("* long");
                }else if(x>= -32768 && x<= 32767){
                    System.out.println("* short");
                    System.out.println("* int");
                    System.out.println("* long");   
                }else if(x>= -2147483648 && x<= 2147483647){
                    System.out.println("* int");
                    System.out.println("* long");
                }else System.out.println("* long");
                //Complete the code
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner sc=new Scanner(System.in);
    String s1;
    int i = 1;
    while(sc.hasNext()){ 	//SOOO IMPORTANT CONDITION for the EOF!
        s1 = sc.nextLine();
        System.out.println(+i+ " " +s1);
        i++;
        }
        sc.close();
    }
}

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String ab=sc.nextLine();
        int a=0;
        while(ab!=null){
            System.out.printf("%d %s\n",++a,ab);  	//Look: use of printf! System.out.printf like in C
            ab=sc.nextLine();
        }
        sc.close();
    }
}


//
// Sample code for Java Static Initializer Block
//
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

//Write your code here
        public static int B;
        public static int H;
        public static boolean flag = false;
       
    static{
        Scanner sc = new Scanner(System.in);
        B = sc.nextInt();
        H = sc.nextInt();
        flag = true;

       if (B <= 0 || H <= 0 || H > 100 || B > 100){
           flag = false;    
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            
        }
    }
public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
}
}



//String to Int and Int to String conversion
import java.util.*;
import java.security.*;
public class Solution {
 public static void main(String[] args) {

  DoNotTerminate.forbidExit();

  try {
   Scanner in = new Scanner(System.in);
   int n = in.nextInt();
   in.close();
   //String s=???; Complete this line below
    String s =  Integer.toString(n); 
   //Write your code here

   
   if (n == Integer.parseInt(s)) {
    System.out.println("Good job");
   } else {
    System.out.println("Wrong answer.");
   }
  } catch (DoNotTerminate.ExitTrappedException e) {
   System.out.println("Unsuccessful Termination!!");
  }
 }
}

//The following class will prevent you from terminating the code using exit(0)!
class DoNotTerminate {

 public static class ExitTrappedException extends SecurityException {

  private static final long serialVersionUID = 1;
 }

 public static void forbidExit() {
  final SecurityManager securityManager = new SecurityManager() {
   @Override
   public void checkPermission(Permission permission) {
    if (permission.getName().contains("exitVM")) {
     throw new ExitTrappedException();
    }
   }
  };
  System.setSecurityManager(securityManager);
 }
}




//
// To get the day of the week - Mon, Tue, Wed, Thur, Fri, Sat, Sun
//
//
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
import java.time.*;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        String s;
        return s = LocalDate.of(year, month, day).getDayOfWeek().toString();
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        Locale indiaLocale = new Locale("en", "IN");
        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
        String india = NumberFormat.getCurrencyInstance(indiaLocale).format(payment);
         
        System.out.println("US: " +us);
        System.out.println("India: " +india);
        System.out.println("China: " +china);
        System.out.println("France: " +france);
    }
}



//Work with exceptions.
//For a method to throw a custom exception it needs to be declaired like this
//public <return type> fn(int n, int p) throws Exception
import java.util.Scanner;


class MyCalculator {
    /*
    * Create the method long power(int, int) here.
    */
    
    public static long power(int n, int p) throws Exception{
        long result = 1;
        if(n == 0 || p == 0){
            throw new Exception("n and p should not be zero.");
            //System.out.println("java.lang.Exception: n and p should not be zero");
        }
        else if (n < 0 || p < 0){
           
           throw new Exception ("n or p should not be negative."); 
            //System.out.println("java.lang.Exception: n and p should not be negative");
           
        }else{
            int j = 1;
            while (j <= p){
                result = result * n;
                j++;
            }
        }
    
     return result;
    }
    
}

public class Solution {
	 public static final MyCalculator my_calculator = new MyCalculator();
    public static final Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();
            
            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

//
//  Playing with regual exxpressions and strings
//
//
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s1 = scan.nextLine();
        String s = s1.trim(); //Removes white space " " at the beginning and trailing! If you only have white space input
								// string then you should check the size of the string as s.length() and that should be 0
								//do not check like this s=="" or s==null (null when the string obj was never initialized
        
        // Write your code here.
        String  regExpr = "[- !,?._'@]+";
        
        String[] arrOfStr = s.split(regExpr,0); 
        if((s.length() == 0) && (1 == arrOfStr.length)) {  // This is so important!!!
            System.out.println("0"); 
            return;
        }
        if(arrOfStr.length > 400000) {
            //System.out.println(arrOfStr.length());
            return;
        }
        System.out.println(arrOfStr.length);
        for (String a : arrOfStr) 
            System.out.println(a); 
        scan.close();
    }
}

//Using Regex, we can easily match or search for patterns in a text. Before searching for a pattern, 
//we have to specify one using some well-defined syntax.
//In this problem, you are given a pattern. You have to check whether the syntax of the given pattern is valid.
// Note: In this problem, a regex is only valid if you can compile it using the Pattern.compile method.
//Input Format
//The first line of input contains an integer , denoting the number of test cases. The next  lines contain a string of 
//any printable characters representing the pattern of a regex.
//
//Output Format
// For each test case, print Valid if the syntax of the given pattern is correct. 
//Otherwise, print Invalid. Do not print the quotes.
import java.util.*;
import java.lang.*; 
//import java.util.Scanner;
import java.util.regex.*;

public class Solution
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String pattern = in.nextLine();
          	//Write your code
              try{
                Pattern p = Pattern.compile(pattern);
                System.out.println("Valid");
              }catch (PatternSyntaxException e) {
                  System.out.println("Invalid");
              }
              testCases--;
            
		}
	}
}


//Write a class called MyRegex which will contain a string pattern. 
//You need to write a regular expression and assign it to the pattern such 
//that it can be used to validate an IP address. 
//Use the following definition of an IP address:
//IP address is a string in the form "A.B.C.D", where the value of A, B, C, and D may range from 0 to 255. 
//Leading zeros are allowed. The length of A, B, C, or D can't be greater than 3.
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class Solution{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

//Write your code here
 //Pattern p = Pattern.compile("a*b");
 //Matcher m = p.matcher("aaaaab");
 //boolean b = m.matches();

class MyRegex{
    MyRegex(){
        String zeroTo255 = "([01]?[0-9]{1,2}|2[0-4][0-9]|25[0-5])";
        pattern = zeroTo255 + "\\." + zeroTo255 + "\\."
                 + zeroTo255 + "\\." + zeroTo255;
        try{
                Pattern p = Pattern.compile(pattern);
            }catch (Exception e) {
                System.out.println("Invalid Pattern");
            }
    }
    public String pattern;
}
//(): whole group consists of three alternatives separated with | (pipe)
//[01]?[0-9]{1,2}: (the 1st group) matches any number between 0 and 199,
//[01]?: 0 or 1 may appear at most once at front of the number,
//[0-9]{1,2}: digits 0 to 9 may appear exactly once or twice on the 2nd or 3rd position in the number,
//2[0-4][0-9]: (the 2nd group) matches numbers between 200 and 249, where the first digit is always 2, the second is between 0 and 4, and the third digit is any between 0 and 9,
//25[0-5]: (the 3rd group) matches numbers between 250 and 255, where 25 is always at front and the third digit is between 0 and 5.
//With the above regexp it’s easy to create a more complex expression that will match all four parts of IPv4 Address:
//
//String IP_REGEXP = zeroTo255 + "\\." + zeroTo255 + "\\."
//                 + zeroTo255 + "\\." + zeroTo255;


//]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]
// New problem
//
//[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[
//In this challenge, we use regular expressions (RegEx) to remove instances of words that are repeated more than once, 
//but retain the first occurrence of any case-insensitive repeated word. 
//For example, the words love and to are repeated in the sentence I love Love to To tO code. 
//Can you complete the code in the editor so it will turn I love Love to To tO code into I love to code?
//To solve this challenge, complete the following three lines:
//Write a RegEx that will match any repeated word.
//Complete the second compile argument so that the compiled RegEx is case-insensitive.
//Write the two necessary arguments for replaceAll such that each repeated word is replaced with the very first instance 
//the word found in the sentence. It must be the exact first occurrence of the word, as the expected 
//output is case-sensitive.
//Note: This challenge uses a custom checker; you will fail the challenge if you modify anything other than the three 
//locations that the comments direct you to complete. 
//To restore the editor's original stub code, create a new buffer by clicking on the branch icon in the top left 
//of the editor.
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateWords {

    public static void main(String[] args) {

        //String regex = "/* Write a RegEx matching repeated words here. */";
        String regex = "(?i)\\b([a-z]+)\\b(?:\\s+\\1\\b)+";
        Pattern p = Pattern.compile(regex, 2
        /* Insert the correct Pattern flag here.*/);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());
        
        if(100 < numSentences || numSentences < 1)return;
        while (numSentences-- > 0) {
            String input = in.nextLine();
            if(input.length() > 10000) return;

            Matcher m = p.matcher(input);
            
            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                input = input.replaceAll("(?i)\\b([a-z]+)\\b(?:\\s+\\1\\b)+" /* The regex to replace */, "$1"/* The replacement. */);
            }
            // Prints the modified sentence.
            System.out.println(input);
        }
        
        in.close();
    }
}
//]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]
// New problem
//
//[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[
//You are updating the username policy on your company's internal networking platform. 
//According to the policy, a username is considered valid if all the following 
//constraints are satisfied:
//The username consists of 8 to 30 characters inclusive. If the username consists of less than
// 8 or greater than 30 characters, then it is an invalid username.
//The username can only contain alphanumeric characters and underscores (_). Alphanumeric characters describe 
//the character set consisting of lowercase characters [a-z], uppercase characters [A-Z], and digits[0-9] .
//The first character of the username must be an alphabetic character, i.e., either lowercase character  [a-z]
//or uppercase character [A-Z].
//Update the value of regularExpression field in the UsernameValidator class so that the regular expression
// only matches with valid usernames.
import java.util.Scanner;
class UsernameValidator {
    /*
     * Write regular expression here.
     */
    public static final String regularExpression = "([a-zA-Z]{1})"+"([a-zA-Z_0-9]{7,29})"; //JA SAM SAM NAPRAVIO!!!!
}


public class Solution {
    private static final Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }           
        }
    }
}
//Primer za markup language like HTML
//In a tag-based language like XML or HTML, contents are enclosed between a start tag and an end tag like 
//<tag>contents</tag>. Note that the corresponding end tag starts with a /. Given a string of text in a 
//tag-based language, parse this text and retrieve the contents enclosed within sequences of well-organized
// tags meeting the following criterion: 
// The name of the start and end tags must be same. The HTML code <h1>Hello World</h2> is not valid, 
//because the text starts with an h1 tag and ends with a non-matching h2 tag.
//Tags can be nested, but content between nested tags is considered not valid. 
//For example, in <h1><a>contents</a>invalid</h1>, contents is valid but invalid is not valid. 
//Tags can consist of any printable characters.
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
        if (testCases < 1 || testCases > 100) return;
		while(testCases>0){
			String line = in.nextLine();
			//Write your code here
            if(line.length() > 10000) return;
            String regex = "<(.+)>([^<]+)</\\1>";
            boolean matchFound = false;
            
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(line);
            String replacement = "";
			while (m.find()) {
                System.out.println(m.group(2));
                matchFound = true;
               
            } if ( ! matchFound) {
                System.out.println("None");
            }
            
			testCases--;
		}
	}
}


//Example with arrays
import java.io.*;
import java.util.*;


public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner (System.in);
        String line = in.nextLine();
        int listSize = Integer.parseInt(line);
        if(listSize < 1 || listSize > 4000) return;
        ArrayList <Integer> list = new ArrayList<Integer>(listSize);
        //System.out.println("Size of array " +listSize);
        int i = 0;
        int noQueries;
        while(listSize > 0){
            list.add(Integer.parseInt(in.next()));
           // System.out.println("list add " +list.get(i));
            i++;
            listSize--;
        }
        noQueries = Integer.parseInt(in.next());
        //System.out.println("Num of queries " +noQueries);
        //System.out.println("Action " +in.next());
        
        while(noQueries > 0){
         line = in.next();
         //action.equals("Insert")
            if(line.equals("Insert"))
            {
                
                    int index = Integer.parseInt(in.next());
                    int value = Integer.parseInt(in.next());
                    list.add(index, value);
            }else if(line.equals("Delete")){
                int index = Integer.parseInt(in.next());
                list.remove(index); //remove first occurrence of 2
            }
            noQueries--;
        }
         in.close();
         for (Integer num : list) {
            System.out.print(num+ " ");
        }

    }
}

//Example for using HashMap!!!!
//You are given a phone book that consists of people's names and their phone number. 
//After that you will be given some person's name as query. For each query, print the phone number of that person.
//
//Input Format
//The first line will have an integer n denoting the number of entries in the phone book. 
//Each entry consists of two lines: a name and the corresponding phone number.
//After these, there will be some queries. Each query will contain a person's name. Read the queries until end-of-file.
//
//Constraints:
//A person's name consists of only lower-case English letters and it may be in the format 'first-name last-name' 
//or in the format 'first-name'. Each phone number has exactly 8 digits without any leading zeros.
//1<=n<=100000
//1<=Query<=100000
//Output Format
//For each case, print "Not found" if the person has no entry in the phone book. 
//Otherwise, print the person's name and phone number. See sample output for the exact format.
//To make the problem easier, we provided a portion of the code in the editor. 
//You can either complete that code or write completely on your own.
//Sample Input:
//3
//uncle sam
//99912222
//tom
//11122222
//harry
//12299933
//uncle sam
//uncle tom
//harry
//Sample output:
//uncle sam=99912222
//Not found
//harry=12299933

//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
	public static void main(String []argh)
	{
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
        HashMap<String, Integer> phonebook = new HashMap<>(); //new hashmap variable - string for the name, Integer for number

		in.nextLine();
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
            phonebook.put(name, phone); //inserting in the hashmap
			in.nextLine();
		}
		while(in.hasNext()) //This is the check for the EOF
		{
			String s=in.nextLine();
            if(phonebook.containsKey(s)) //if exists
             System.out.println(s + "=" + phonebook.get(s));
          else
              System.out.println("Not found");
		}
	}
}


//
//
private static final Deque<Character> sQueue = new ArrayDeque<>();

private static boolean isBalanced(String str) {
        sQueue.clear();
        int len = str.length();
        boolean failed = false;
        for (int ix = 0; !failed && ix < len; ++ix) {
            char currChar = str.charAt(ix);
            switch (currChar) {
                case '(':
                case '[':
                case '{':
                    sQueue.addFirst(currChar);
                    break;
                case ']':
                    failed = sQueue.size() == 0 || (sQueue.removeFirst() != '[');
                    break;
                case ')':
                    failed = sQueue.size() == 0 || (sQueue.removeFirst() != '(');
                    break;
                case '}':
                    failed = sQueue.size() == 0 || (sQueue.removeFirst() != '{');
                    break;
                default:
                    failed = true;
                    break;
            }
        }
        failed |= (sQueue.size() != 0);
        return !failed;
    }
//Or a better version
private static boolean isBalanced (String s) {

   final ArrayDeque<Character> stack = new ArrayDeque<> ();
   final char[] chars = s.toCharArray ();

   for (char c : chars) {

       // Matching character, . means not initialized
       char mc = '.';

       switch (c) {

       case '(':
       case '{':
       case '[':
         stack.addFirst (c);
         break;

       case ')':
         mc = '(';
       case '}':
         if (mc == '.') mc = '{';
       case ']':
         if (mc == '.') mc = '[';

         if (stack.isEmpty () || 
             stack.removeFirst () != mc) {
             return false;
         }
         break;

       default:
         // Any other character is bad input data
         return false;
       }
   }

   return stack.isEmpty ();
}
//or
import java.util.*;
class Solution{
    
   private static Map<String,String> myMap = createMap();
   private static Map<String,String> createMap() {
       HashMap<String,String> result = new HashMap<String,String>();
       result.put("(",")");
       result.put("[","]");
       result.put("{","}");
       return Collections.unmodifiableMap(result);
   }
   
   public static void main(String []argh)
   {
       Scanner sc = new Scanner(System.in);
      
       while (sc.hasNext()) {
           String input=sc.nextLine();
           Stack myStack = new Stack();          
           String last;
           String next;          
           for (int i=0 ; i<input.length(); i++){
               next = Character.toString(input.charAt(i));                 
               if (myStack.empty()) {
                   myStack.push(next);
               } else {
                   last = myStack.peek().toString();
                   if (myMap.containsKey(last)) {
                       if (myMap.get(last).equals(next)){
                           myStack.pop();
                       } else {
                           myStack.push(next);
                       }
                   } else {
                       myStack.push(next);
                       break;
                   }
               }                 
           }
           System.out.println(myStack.empty());        
       }
   }
}

//
import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayDeque;

class Solution {
    public static void main(String[] args) {
        /* Create HashMap to match opening brackets with closing brackets */
        HashMap<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
        
        /* Test each expression for validity */
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String expression = scan.next();
            System.out.println(isBalanced(expression, map) ? "true" : "false" );
        }
        scan.close();
    }
    
    private static boolean isBalanced(String expression, HashMap<Character, Character> map) {
        if ((expression.length() % 2) != 0) {
            return false; // odd length Strings are not balanced
        }        
        ArrayDeque<Character> deque = new ArrayDeque<>(); // use deque as a stack
        for (int i = 0; i < expression.length(); i++) {
            Character ch = expression.charAt(i);
            if (map.containsKey(ch)) {
                deque.push(ch);
            } else if (deque.isEmpty() || ch != map.get(deque.pop())) {
                return false;
            }
        }
        return deque.isEmpty();
    }
}

//In computer science, a set is an abstract data type that can store certain values, 
//without any particular order, and no repeated values(Wikipedia).{1,2,3}is an example of a set, 
//but {1,2,2}  is not a set. Today you will learn how to use sets in java by solving this problem.
//
// Input					Output
//5
//john tom						1
//john mary						2
//john tom						2
//mary anna						3
//mary anna						3
//
// Since HashMap and MultiMap classes do not wor unless using  Guava Multimap
// The we cheat here: we create a unique value for the same key by concatenating john and tom (like john_tom) and
// john marry (like john_mary) to have a unique elemnt. If you use "john" as the key, then the second value, in this
// case mary will overwrite "tom". Not happy but it gets job done. This is a better solution with Guava Multimap
//String key = "a-key";
//Multimap<String, String> map = ArrayListMultimap.create();
// 
//map.put(key, "firstValue");
//map.put(key, "secondValue");
// 
//assertEquals(2, map.size());


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

 public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

//Write your code here
    Set set =  new HashSet(); 			//New hash table 
    for (int i =0 ; i<t ;i++){
        set.add(pair_left[i]+"_"+pair_right[i]); //one is adding to hash table a uniques string
													// which is combo of the pair_lefft + pair_right
        System.out.println(set.size());
    }  

   }
}

//Example for "Generics" aka Templates in C++
import java.io.IOException;
import java.lang.reflect.Method;

class Printer
{
   //Write your code here
   //public <T> void printArray(T[] array){
   public static <Type> void printArray(Type[] t){ //Important: <T> returnValue functionName(Type[] t)
       for(Type temp: t){
            System.out.println(temp);
       }
   }
 
}

public class Solution {


    public static void main( String args[] ) {
        Printer myPrinter = new Printer();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;

        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();

            if(name.equals("printArray"))
                count++;
        }

        if(count > 1)System.out.println("Method overloading is not allowed!");
      
    }
}

//Example for the Comparator class
import java.util.*;
// Write your Checker class here
class Checker implements Comparator<Player>{
    @Override
    public int compare(Player a, Player b){
        if (a.score == b.score){
            return a.name.compareTo(b.name);//alphabetically
        } else {
            return b.score - a.score;//decreasing 
        }
    }
}

class Player{
    String name;
    int score;
    
    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();
        
        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();
     
        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}



//
//
//You are given a list of student information: ID, FirstName, and CGPA. Your task is to rearrange them 
//according to their CGPA in decreasing order. If two student have the same CGPA, 
//then arrange them according to their first name in alphabetical order. 
//If those two students also have the same first name, then order them according to their ID. 
//No two students have the same ID.

//Hint: You can use comparators to sort a list of objects. See the oracle docs to learn about comparators.
//
//Input Format
//
//The first line of input contains an integer N, representing the total number of students. 
//The next N lines contains a list of student information in the following structure:
// ID Name CGPA
//Output Format
//
//After rearranging the students according to the above rules, print the first name of each student on a separate line.
//
//Sample Input
//
//5
//33 Rumpa 3.68
//85 Ashis 3.85
//56 Samiha 3.75
//19 Samara 3.75
//22 Fahim 3.76
//Sample Output
//
//Ashis
//Fahim
//Samara
//Samiha
//Rumpa
import java.util.*;

class Student{
	private int id;
	private String fname;
	private double cgpa;
	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
}

//Complete the code
public class Solution
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		List<Student> studentList = new ArrayList<Student>();
		while(testCases>0){
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();
			
			Student st = new Student(id, fname, cgpa);
			studentList.add(st);
			
			testCases--;
		}
          Collections.sort(studentList,  Comparator.comparing(Student :: getCgpa).reversed().thenComparing(Student :: getFname).thenComparing(Student :: getId));
      
      
      	for(Student st: studentList){
			System.out.println(st.getFname());
		}
	}
}


//
import java.util.*;
    public class test {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            Deque<Integer> deque = new ArrayDeque<Integer>();
            int n = in.nextInt();
            int m = in.nextInt();
            if(n<1 || n>100000 || m < 1 || m >100000 || m > n) return;

            //int[] intNumbers = new int[n];
            int size = 0;
            int max = 1;
           
            for (int i = 0; i < n; i++){
           
                /*long*/ int num = in.nextInt();
                if(num > 10000000 || n < 0) return;
                //intNumbers[i] = num;
                if(i < m){
                    if(false == deque.contains(/*intNumbers[i]*/num)){
                        deque.addFirst(/*intNumbers[i]*/num);
                        size = deque.size();
                        if(size > max){max = size;}
                    }else{
                        deque.addFirst(/*intNumbers[i]*/num);
                        int /*long*/ temp = deque.removeLast();
                        while((/*intNumbers[i]*/ num != temp) && (deque.size() > 0)){
                            temp = deque.removeLast();
                            
                        }
                    }
                }else{
                    size = deque.size();
                    while(size == m){
                        deque.removeLast();
                        size = deque.size();
                    } 
                    if(false == deque.contains(/*intNumbers[i]*/num)){ 
                        deque.addFirst(/*intNumbers[i]*/num);
                        size = deque.size();
                        if(size > max) {max=size;}
                    }else{
                        deque.addFirst(/*intNumbers[i]*/num);
                        int /*long*/ temp = deque.removeLast();
                        while(/*intNumbers[i]*/ num != temp && (deque.size() > 0)){
                            temp = deque.removeLast();
                            
                        }
                    }
                }
            }
                             
            System.out.println(max);
        }
    }
	
	
	
	 import java.util.*;
    public class test {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            Deque<Integer> deque = new ArrayDeque<Integer>();
            int n = in.nextInt();
            int m = in.nextInt();
            if(n<1 || n>100000 || m < 1 || m >100000 || m > n) return;

            //int[] intNumbers = new int[n];
            int size = 0;
            int max = 1;
           
            for (int i = 0; i < n; i++){
           
                /*long*/ int num = in.nextInt();
                if(num > 10000000 || n < 0) return;
                //intNumbers[i] = num;
               
                size = deque.size();
                 while(size == m){
                    deque.removeLast();
                    size = deque.size();
                } 
                if(true != deque.contains(/*intNumbers[i]*/num)){ 
                    deque.addFirst(/*intNumbers[i]*/num);
                    size = deque.size();
                    if(size > max) {max=size;}
                }else{
                    deque.addFirst(/*intNumbers[i]*/num);
                    int /*long*/ temp = deque.removeLast();
                    while(/*intNumbers[i]*/ num != temp && (deque.size() > 0)){
                        temp = deque.removeLast();   
                    }
					size = deque.size();
                    if(size > max) {max=size;}
                }
            }
                        
            System.out.println(max);
        }
    }
	
	  import java.util.*;
    public class test {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            Deque<Integer> deque = new ArrayDeque<Integer>();
             HashSet<Integer> set = new HashSet<>();
            int n = in.nextInt();
            int m = in.nextInt();
            if(n<1 || n>100000 || m < 1 || m >100000 || m > n) return;

            //int[] intNumbers = new int[n];
            int size = 0;
            int max = 1;
           
            for (int i = 0; i < n; i++){
           
                /*long*/ int num = in.nextInt();
                if(num > 10000000 || n < 0) return;
                //intNumbers[i] = num;
                deque.add(num);
                set.add(num);
                //System.out.print("Dek size is "+deque.size()+" \n");
                //System.out.print("Hash size is "+set.size()+" \n");

                if (deque.size() == m) {
                    if (set.size() > max) max = set.size();
                    int first = deque.remove();
                //    System.out.print("\nDek size is now "+deque.size()+" \n\n");
                    if (!deque.contains(first)) set.remove(first);
                }
              // size = deque.size();
                // while(size == m){
                  //  deque.removeLast();
                    //size = deque.size();
                //} 
                //if(true != deque.contains(/*intNumbers[i]*/num)){ 
                  //  deque.addFirst(/*intNumbers[i]*/num);
                  //  size = deque.size();
                  //  if(size > max) {max=size;}
                //}else{
                //    deque.addFirst(/*intNumbers[i]*/num);
                //    int /*long*/ temp = deque.removeLast();
                //    while(/*intNumbers[i]*/ num != temp && (deque.size() > 0)){
                //        temp = deque.removeLast();   
                //    }
               // }
            }
                        
            System.out.println(max);
        }
    }
	
	//
	//
	//
	//Java's BitSet class implements a vector of bit values (i.e.: false(0) or true (1)) that grows as needed, allowing us to easily manipulate bits while optimizing space 
	//(when compared to other collections). Any element having a bit value of 1 is called a set bit.
	//
	//Given 2 BitSets, B1 and B2, of size N where all bits in both BitSets are initialized to 0, perform a series of M operations. 
	//After each operation, print the number of set bits in the respective BitSets as two space-separated integers on a new line.
	//
	//Input Format
	// The first line contains 2 space-separated integers, N (the length of both BitSets B1 and B2) and M (the number of operations to perform), respectively.
	//The M subsequent lines each contain an operation in one of the following forms:
//
//AND <set><set>
//OR <set><set>
//XOR <set><set>
//FLIP <set><index>
//SET <set><index>
//
//In the list above, <set> is the integer 1 or 2, where 1 denotes B1 and 2 denotes B2.
//<index> is an integer denoting a bit's index in the BitSet corresponding to <set> .
//
//For the binary operations AND, OR, and XOR, operands are read from left to right and the BitSet resulting from the operation replaces the contents of the first operand. 
//For example:
	//AND 2 1
	//B2  is the left operand, and B1 is the right operand. This operation should assign the result of "B2 and B1" to B2.
	// Sample input
	//5 4
	//AND 1 2
	//SET 1 4
	//FLIP 2 2
	//OR 2 1
	
	//Sample output
	//0 0
	//1 0
	//1 1
	//1 2
	// THIS CODE IS EXAMPLE OF USE OF Lambdas in Java!!!!!!!!
	import java.io.*;
import java.util.*;
import java.util.function.BiConsumer; //VERY IMPOPRTANT to import this one 

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner sc = new Scanner(System.in);
    int setSize = sc.nextInt();
    int numOfOperations = sc.nextInt();
    BitSet[] bitSets = new BitSet[]{
        new BitSet(setSize),
        new BitSet(setSize)
        };
    Map<String, BiConsumer<Integer,Integer>> ops = new HashMap<>(); //Use of BiConsumer!!!!!!

    ops.put("AND", (index1, index2) -> bitSets[index1-1].and(bitSets[index2-1]));
    ops.put("OR", (index1, index2) -> bitSets[index1-1].or(bitSets[index2-1]));
    ops.put("XOR", (index1, index2) -> bitSets[index1-1].xor(bitSets[index2-1]));
    ops.put("SET", (index1, index2) -> bitSets[index1-1].set(index2));
    ops.put("FLIP", (index1, index2) -> bitSets[index1-1].flip(index2));

    for (int i = 0; i < numOfOperations; i++){
        ops.get(sc.next()).accept(sc.nextInt(), sc.nextInt());    
        System.out.println(bitSets[0].cardinality() + " " + bitSets[1].cardinality()); //and cardinality
    }
    }
}
	
	
//12
//ENTER John 3.75 50
//ENTER Mark 3.8 24
//ENTER Shafaet 3.7 35
//SERVED
//SERVED
//ENTER Samiha 3.85 36
//SERVED
//ENTER Ashley 3.9 42
//ENTER Maria 3.6 46
//ENTER Anik 3.95 49
//ENTER Dan 3.95 50
//SERVED	
	
//	John
//	Mark->John
//	Mark->John->Shafaet
//1st SERVED:	Remove Mark  ==> John->Shafaet
//2nd SERVED: Remove John ==> Shafatet
//ENETR Samiha:       Samiha->Shafaet				
//3rd SERVED: Remove Samiha ==>  ONLY stays Shafaet! So far, so good.
//ENTER Ashley   Ashley->Shafaet
//	
//Dan              Dan
//Ashley			 Ashley
//Shafaet          Maria
//Maria            Shafaet

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;
import java.util.Comparator;
import java.util.PriorityQueue;
/*
 * Create the Student and Priorities classes here.
 */class Student implements Comparable<Student>
    {
        private int id;
        private String fname;
        private double cgpa;
        public Student(String fname, double cgpa, int id) {
            this.id = id;
            this.fname = fname;
            this.cgpa = cgpa;
        }
        public int getId() {
            return id;
        }
        public String getName() {
            return fname;
        }
        public double getCgpa() {
            return cgpa;
        }
        public void printStudent(){
            System.out.println("St name is "+getName()+" CGPA is "+getCgpa()+" ID is "+getId()+" \n");
        }
         @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Student student = (Student) o;
            return Double.compare(student.cgpa, cgpa) == 0 &&
                    Objects.equals(fname, student.fname) && (0 == Integer.compare(student.id, id));
        }
        @Override
        public int hashCode() {
            return Objects.hash(fname, cgpa);
        }
        @Override
        public String toString() {
            return "Student{" +
                "name='" + fname + '\'' +
                ", cgpa=" + cgpa +
                '}';
        }
         // Compare two Student objects by their cgpa and name 
        @Override
        public int compareTo(Student student) {
           // System.out.println("In compareTo method \n");
            if(this.getCgpa() > student.getCgpa()) {
                return -1;
            } else if (this.getCgpa() < student.getCgpa()) {
                return 1;
            } else {
                return 0;
            }
        }
    }
           
    class Priorities
    {
         Comparator<Student> studentComparator = new Comparator<Student>() 
        {
             @Override
            public int compare(Student s1, Student s2) {
                //System.out.println("In compare method \n");
                //s1.printStudent();
                //s2.printStudent();
                if(s1.getCgpa() > s2.getCgpa())
                {
                    return -1;
                }
                else if (s2.getCgpa() > s1.getCgpa()) 
                {
                    return 1;
                }
                else if(s2.getCgpa() == s1.getCgpa())
                {
                    if(0 > s1.getName().compareTo(s2.getName()))
                    {
                        return -1;
                    }
                    else if (0 < s1.getName().compareTo(s2.getName())) 
                    {
                        return 1;
                    }
                    else if(0 == s1.getName().compareTo(s2.getName()))
                    {
                        if(s1.getId() > s2.getId()) 
                        {
                            return -1;
                        }
                        else if(s2.getId() > s1.getId()) 
                        {
                            return 1;
                        }
                    }
                }
                return -1;
            }    
        };

        List<Student> getStudents(List<String> events)
        {

            // fille the list from the Priority Queue
            //check the first string which should be an action: enter or serve 
            //if enter, then add the next three info to a priority queue 
            //the addition should be based on th einput criteria: GPA, is same, First name, if same ID
             
            List<Student> studentList = new ArrayList<Student>(events.size());
            PriorityQueue<Student> pQueue = new PriorityQueue<>(studentComparator);
            //PriorityQueue<Student> pQueue = new PriorityQueue<>();
            //PriorityQueue<Student> pQueue = new PriorityQueue<>(Comparator.comparing(Student::getCgpa).reversed().thenComparing(Student::getName).thenComparing(Student::getId));
            String  regExpr = " ";//"[- !,?._'@]+"; 
            int numLines = events.size();
            //System.out.println("event size "+events.size());
           

           for (int i = 0; i < numLines; i++)
            {
                String getLine = events.remove(0);
                //System.out.println("Get Line "+getLine+" iteration "+i);
                String[] arrOfStr = getLine.split(regExpr,0);
               
                //System.out.println("Iteration number   "+i+"\n");   
                //System.out.println("First split   "+arrOfStr[0]+"\n");
                //System.out.println("2nd split   "+arrOfStr[1]+"\n");
                //System.out.println("3rd split   "+arrOfStr[2]+"\n");
                //System.out.println("4th split   "+arrOfStr[3]+"\n");

                if(0 == arrOfStr[0].compareTo("SERVED")) {
                    //Pop the first entry in the priority Queue
                    //pQueue.poll();
                    pQueue.poll();
                }else if (0 == arrOfStr[0].compareTo("ENTER")){
                    //add student to the priority queue
                    //arrOfStr[1] is name (String)
                    //arrOfStr[2] is GPA (Double)
                    //arrOfStr[3] is the ID (Integer)
                    Double gpa = Double.parseDouble(arrOfStr[2]);
                    int ID = Integer.parseInt(arrOfStr[3]);
                    Student student = new Student(arrOfStr[1], gpa, ID);    
                   
                    pQueue.add(student);
                    //student.printStudent();
                  
                    //studentList.add(student);
                    
                }
                
            }
         while(pQueue.peek()!=null) {
            studentList.add(pQueue.poll());
         }
         
         
         return studentList;
        };
    }



public class Solution {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();
    
    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());    
        List<String> events = new ArrayList<>();
        
        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }
        
        List<Student> students = priorities.getStudents(events);
        
        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}

//Calculating MD5 in Java
import java.io.*;
import java.util.*;
import java.security.MessageDigest;
import java.nio.charset.Charset;


public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
  
    Scanner in = new Scanner(System.in);
    String message = in.nextLine();
    in.close();
    try {
            MessageDigest messageDigest 
                = MessageDigest.getInstance("MD5");
            messageDigest.update(message.getBytes());
            byte[] hash = messageDigest.digest();

            for (byte b : hash) {
                System.out.printf("%02x", b);
            }
        } catch (Exception e) {} 
    }
}
//SHA-256
import java.io.*;
import java.util.*;
import java.security.MessageDigest;
import java.security.*;



public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
     Scanner in = new Scanner(System.in);
        String message = in.nextLine();
        in.close();

        try {
            MessageDigest messageDigest 
                = MessageDigest.getInstance("SHA-256");
            messageDigest.update(message.getBytes());
            byte[] hash = messageDigest.digest();

            for (byte b : hash) {
                System.out.printf("%02x", b);
            }
        } catch (Exception e) {}
    }
}
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 9 2 -4 -4 0
0 0 0 -2 0 0
0 0 -1 -2 -4 0

hourglass sum is 7 
hourglass sum is 13 
hourglass sum is 12 
hourglass sum is 10 

-1 -1 0 -9 -2 -2
-2 -1 -6 -8 -2 -5
-1 -1 -1 -2 -3 -4
-1 -9 -2 -4 -4 -5
-7 -3 -3 -2 -9 -9
-1 -3 -1 -2 -4 -5

//there are few tricks here. One is that the loops have to be fast
// to avoid fail of submission cause of timing
//Therefore I used a lagorithm to check for the HOUR GLASS shape as soon as the user
//provided 3 full lines of the input fo the 6x6 grid
//that sped up the algorithm but forced me for a different implementation
//2nd is when calculating Maximum of all HOUR GLASSES. One should start with a big
//Negative number like -128 (should have been even bigger but I assumed only single digit
//integers in each position
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static int hourglassSum(int[][] grid, int iPosition, int maxI, int maxJ){ //has to be declared statick because of the static function that calls it
        int result = 0;
        int M = 0;
        int maximum = -128;

        if(((iPosition + 3) > maxI)) return 0;
        
        for (M = 0; M <= maxJ - 3; M++){
            result = 0;
            for (int i = iPosition; i < (iPosition + 3); i++){
                for (int k = M; k <= M+2; k++){
                    if(i == iPosition + 1) {
                        result = result + grid[i][k+1]; 
                        break;
                    }else{
                        result = grid[i][k] + result;
                    }
                }
            }
            if (result > maximum) maximum = result;
        }
       //System.out.println("hourglass sum is "+maximum+" \n");
        return maximum;
    }

    public static void main(String[] args) {
        int[][] arr = new int[6][6];
        int sum = 0;
        int max = -128;
        int muxJ;

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
                //System.out.println(" arr of i j is "+arr[i][j]+" "+i+" "+j+"\n");
            }
            if(i >= 2){
                    sum = hourglassSum(arr, (i - 2), 6, 6);
                    if(sum > max) max = sum;
            }
        }
        
        System.out.println(max);

        scanner.close();
    }
}

//
//We define the following:
//
//A subarray of an n-element array is an array composed from a contiguous block of the original array's elements. 
//For example, if array=[1,2,3], then the subarrays are [1],[2],[3],[1,2],[2,3],and [1,2,3]. Something like [1,3] would not 
//be a subarray as it's not a contiguous subsection of the original array.
// The sum of an array is the total sum of its elements.
//   An array's sum is negative if the total sum of its elements is negative.
//   An array's sum is positive if the total sum of its elements is positive.
//Given an array of n integers, find and print its number of negative subarrays on a new line.
//
//Input Format
//
//The first line contains a single integer, n, denoting the length of array A = [a0,a1,...,an-1].
//The second line contains n space-separated integers describing each respective element, ai, in array A.
//
//Constraints
// 1<= n <=100
//-10^4 <= Ai <= 10^4
//Output Format
//Print the number of subarrays of A having negative sums.
//
//Sample Input
//
//5
//1 -2 4 -5 1
//Sample Output
//9
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         
        Scanner scan = new Scanner(System.in);
        int arrSize = Integer.parseInt(scan.nextLine()); 
        int[] arr = new int[arrSize];
        int counter = 0;
        int sum = 0;

        for (int i = 0; i < arrSize; i++){
            arr[i] = scan.nextInt();
        }
        for (int i = 0; i < arrSize; i++){
            if (arr[i] < 0) counter++;
            sum = arr[i];
            for(int j = i+1; j < arrSize; j++){
                sum = sum + arr[j];
                if(sum < 0) counter++;
            }

        }
        System.out.println(counter);
    }
}

8
7 43 35 26 34 78 99 70
3 71 11 16
8 70 19 42 30 84 20 57 45
0
1 20
0
0
0
10
5 1
5 7
1 7
5 3
5 2
4 7
5 2
1 2
4 1
2 3
 Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int d,q,x,y;
    ArrayList[] set = new ArrayList[n];
    for(int i=0;i<n;i++){
        d = in.nextInt();
        set[i] = new ArrayList();
        for(int j=0;j<d;j++){  
            set[i].add(in.nextInt());                
        }
    }
    q=in.nextInt();
    for(int i=0;i<q;i++){
        x=in.nextInt();
        y=in.nextInt();
        try{
            System.out.println(set[x-1].get(y-1));
        } catch(Exception e){
            System.out.println("ERROR!");
        }
    }
	
	

Let's play a game on an array! You're standing at index 0 of an n-element array named . From some index i (where 0<=i<=n ), you can perform one of the following moves:

Move Backward: If cell i-1  exists and contains a 0, you can walk back to cell i-1.
Move Forward:
If cell i+1 contains a zero, you can walk to cell i+1.
If cell i+leap contains a zero, you can jump to cell i+leap.
If you're standing in cell n-1 or the value of i+leap>=n--, you can walk or jump off the end of the array and win the game.
In other words, you can move from index i to index i+1,i-1 , or i+leap as long as the destination index is a cell containing a 0. 
If the destination index is greater than n-1, you win the game.

Given leap and game, complete the function in the editor below so that it returns true if you can win the game (or false if you cannot).

Input Format

The first line contains an integer, , denoting the number of queries (i.e., function calls).
The 2 q subsequent lines describe each query over two lines:
1. The first line contains two space-separated integers describing the respective values of n and leap.
2. The second line contains n space-separated binary integers (i.e., zeroes and ones) describing the respective values of .

import java.util.*;

public class Solution {
static int [] visited = new int[100];  //has to be a static "gloal" variable initialized every time we start one quiery

    public static boolean canWin(int leap, int[] game, int index) {
        // Return true if you can win the game; otherwise, return false.
        int size = game.length; 
       

        if(leap > 100 || size > 100 || size < 2) return false;
        if(leap > size) return true;
        
        if(index >= size){
               return true;
        }else if (index < 0 || game[index] == 1) {
            return false;
        }

        if(visited[index]==0)
        {
            visited[index]=1;
            if(game[index]==0)
            {
                if(canWin(leap,game,index+leap))
                    return true;
                if(canWin(leap, game,index+1))
                {
         ?        return true;
                }
                if(index!=0)
                    if(canWin(leap,game,index-1))
                         return true;
            }
        }
        return false;
    }
        
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        if(q > 5000)return;
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
                visited[i]=0; //I added it here; very important for proper working
            }
            System.out.println( (canWin(leap, game, 0)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
//
//
//
// Given a large integer,n, use the Java BigInteger class' isProbablePrime method to determine and print whether it's prime or not prime.
//
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.math.BigInteger; //MUST IMPORT

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String n = scanner.nextLine();
        BigInteger a = new BigInteger(n);  //IMPORTNAT HOW TO CREATE a B\igInteger object!!!!
        boolean prime = a.isProbablePrime(1);
        System.out.println(prime? "prime":"not prime");
        scanner.close();
    }
}

//Inheritance
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//Write your code here
class Arithmetic {
    int add(int a, int b)
    {
        return a+b;
    }
}

class Adder extends Arithmetic{

}


public class Solution{
    public static void main(String []args){
        // Create a new Adder object
        Adder a = new Adder();
        
        // Print the name of the superclass on a new line
        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());	
        
        // Print the result of 3 calls to Adder's `add(int,int)` method as 3 space-separated integers:
        System.out.print(a.add(10,32) + " " + a.add(10,3) + " " + a.add(10,10) + "\n");
     }
}
import java.util.*;
abstract class Book{
	String title;
	abstract void setTitle(String s);
	String getTitle(){
		return title;
	}
	
}

//Write MyBook class here
class MyBook extends Book{
    void setTitle(String s){
        title = s;
    }
}

public class Main{
	
	public static void main(String []args){
		//Book new_novel=new Book(); This line prHMain.java:25: error: Book is abstract; cannot be instantiated
		Scanner sc=new Scanner(System.in);
		String title=sc.nextLine();
		MyBook new_novel=new MyBook();
		new_novel.setTitle(title);
		System.out.println("The title is: "+new_novel.getTitle());
      	sc.close();
		
	}
}
// Example of implementing interfaces
import java.util.*;
interface AdvancedArithmetic{
  int divisor_sum(int n);
}

//Write your code here
class MyCalculator implements AdvancedArithmetic{
    public int divisor_sum(int n){
        int sum = n + 1;
        int [] array = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 43};
        if(n == 1) return n;

        //for(int k: array){
        for(int k = 2; k < n; k++){
            if (n % k == 0) {
                sum = sum + k;
            }
        }
        return sum;
    }
}

class Solution{
    public static void main(String []args){
        MyCalculator my_calculator = new MyCalculator();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(my_calculator);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(my_calculator.divisor_sum(n) + "\n");
      	sc.close();
    }
    /*
     *  ImplementedInterfaceNames method takes an object and prints the name of the interfaces it implemented
     */
    static void ImplementedInterfaceNames(Object o){
        Class[] theInterfaces = o.getClass().getInterfaces();
        for (int i = 0; i < theInterfaces.length; i++){
            String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    }
}

// Example of Polymorphism in Java (virtual functions in C++)
import java.util.*;
class Sports{

    String getName(){
        return "Generic Sports";
    }
  
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has n players in " + getName() );
    }
}

class Soccer extends Sports{
    @Override
    String getName(){
        return "Soccer Class";
    }

    // Write your overridden getNumberOfTeamMembers method here
    @Override
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has 11 players in " +getName());
    }

}

public class Solution{
	
    public static void main(String []args){
        Sports c1 = new Sports();
        Soccer c2 = new Soccer();
        System.out.println(c1.getName());
        c1.getNumberOfTeamMembers();
        System.out.println(c2.getName());
        c2.getNumberOfTeamMembers();
	}
}
// Call to the base class method using KEYWORD super
import java.util.*;
import java.io.*;


class BiCycle{
	String define_me(){
		return "a vehicle with pedals.";
	}
}

class MotorCycle extends BiCycle{
	String define_me(){
		return "a cycle with an engine.";
	}
	
	MotorCycle(){
		System.out.println("Hello I am a motorcycle, I am "+ define_me());

		String temp=super.define_me(); //Fix this line

		System.out.println("My ancestor is a cycle who is "+ temp );
	}
	
}
class Solution{
	public static void main(String []args){
		MotorCycle M=new MotorCycle();
	}
}

//
//
//  Example for use of instanceof operator
//
class Student{}
class Rockstar{   }
class Hacker{}


public class InstanceOFTutorial{
	
   static String count(ArrayList mylist){
      int a = 0,b = 0,c = 0;
      for(int i = 0; i < mylist.size(); i++){
         Object element=mylist.get(i);
         if(element instanceof Student)   //import !!!!! obj instanceof datatype
            a++;
         if(element instanceof Rockstar)
            b++;
         if(element instanceof Hacker)
            c++;
      }
      String ret = Integer.toString(a)+" "+ Integer.toString(b)+" "+ Integer.toString(c);
      return ret;
   }

   public static void main(String []args){
      ArrayList mylist = new ArrayList();
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      for(int i=0; i<t; i++){
         String s=sc.next();
         if(s.equals("Student"))mylist.add(new Student());
         if(s.equals("Rockstar"))mylist.add(new Rockstar());
         if(s.equals("Hacker"))mylist.add(new Hacker());
      }
      System.out.println(count(mylist));
   }
}

//Use of iterators in Java
//
//
import java.util.*;
public class Main{
	
   static Iterator func(ArrayList mylist){
      Iterator it=mylist.iterator();
      while(it.hasNext()){
         Object element = it.next();
         if(element instanceof String)//Hints: use instanceof operator

			break;
		}
      return it;
      
   }
   @SuppressWarnings({ "unchecked" })
   public static void main(String []args){
      ArrayList mylist = new ArrayList();
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();
      for(int i = 0;i<n;i++){
         mylist.add(sc.nextInt());
      }
      
      mylist.add("###");
      for(int i=0;i<m;i++){
         mylist.add(sc.next());
      }
      
      Iterator it=func(mylist);
      while(it.hasNext()){
         Object element = it.next();
         System.out.println((String)element);
      }
   }
}

//Learning problem with exceptionsimport java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       Scanner sc = new Scanner (System.in);
       int x;
       int y;
       try{
            x = sc.nextInt();
            y = sc.nextInt();
            System.out.println(x/y);
       }  
       catch(InputMismatchException e){
        System.out.println("java.util.InputMismatchException");
        //System.out.println(e);
       }
       catch(Exception e){
           System.out.println(e);
       }
       
       
    }
}

//
//According to Wikipedia, a factory is simply an object that returns another object from some other method call, which is assumed to be "new".
//
//In this problem, you are given an interface Food. There are two classes Pizza and Cake which implement the Food interface, and they both contain a method getType().
//
//The main function in the Main class creates an instance of the FoodFactory class. The FoodFactory class contains a method getFood(String) that returns a new instance of Pizza or Cake according to its parameter.
//
//You are given the partially completed code in the editor. Please complete the FoodFactory class.


import java.util.*;
import java.security.*;
interface Food {
	 public String getType();
	}
	class Pizza implements Food {
	 public String getType() {
	 return "Someone ordered a Fast Food!";
	 }
	}

	class Cake implements Food {

	 public String getType() {
	 return "Someone ordered a Dessert!";
	 }
	}
	class FoodFactory {
		public Food getFood(String order) {
//Write your code here
            Food handle = null; 
                if(0 == order.compareTo("pizza")) {
                    handle = new Pizza();
                }
                if(0 == order.compareTo("cake")){
                    handle = new Cake();
                }
return handle;


}//End of getFood method

	}//End of factory class

	public class Solution {

	 public static void main(String args[]){
			Do_Not_Terminate.forbidExit();

		try{

			Scanner sc=new Scanner(System.in);
			//creating the factory
			FoodFactory foodFactory = new FoodFactory();
	
			//factory instantiates an object
			Food food = foodFactory.getFood(sc.nextLine());
	
			
			System.out.println("The factory returned "+food.getClass());
			System.out.println(food.getType());
		}
		catch (Do_Not_Terminate.ExitTrappedException e) {
			System.out.println("Unsuccessful Termination!!");
		}
	 }

	}
	class Do_Not_Terminate {
		 
	    public static class ExitTrappedException extends SecurityException {

			private static final long serialVersionUID = 1L;
	    }
	 
	    public static void forbidExit() {
	        final SecurityManager securityManager = new SecurityManager() {
	            @Override
	            public void checkPermission(Permission permission) {
	                if (permission.getName().contains("exitVM")) {
	                    throw new ExitTrappedException();
	                }
	            }
	        };
	        System.setSecurityManager(securityManager);
	    }
	}	
	
	
	
// Example of a Singleton design pattern and class
//
//"The singleton pattern is a design pattern that restricts the instantiation of a class to one object. 
// This is useful when exactly one object is needed to coordinate actions across the system."
//- Wikipedia: Singleton Pattern
//
//Complete the Singleton class in your editor which contains the following components:
//
//A private Singleton non parameterized constructor.
//A public String instance variable named str.
//Write a static method named getSingleInstance that returns the single instance of the Singleton class.
//Once submitted, our hidden Solution class will check your code by taking a String as input and then 
//using your Singleton class to print a line.
//Input Format
//
// You will not be handling any input in this challenge.
//
//Output Format
//You will not be producing any output in this challenge.

Sample Input
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;


class Singleton{
    private static Singleton _instance = null;
    public String str = null;
    private Singleton(){		//important to declare the constructor to be PRIVATE or PROTECTED
         
    }
    public static Singleton getSingleInstance(){ //The most important public static Singleton getSingleInstance()
        if (null == _instance) {
            _instance = new Singleton();
        }
        return _instance;
    }
    public String getStr(){
        return str;
    }
    public String setStr(String S){
        if(_instance != null) str = S;
        return S;
    }
}
