import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                System.out.printf("%-15s%03d%n",s1,x);
            }
            System.out.println("================================");

    }
}



/*
🔹 Explanation of printf Formatting:
java
Copy
Edit
System.out.printf("%-15s%03d%n", s, n);
Format Specifier	Meaning
%-15s	Left-align string (s), using exactly 15 characters (padded with spaces).
%03d	Print integer (d) with at least 3 digits, adding leading zeroes if necessary.
%n	Print a new line (platform-independent \n).

🔹 Explanation of printf Formatting:
java
Copy
Edit
System.out.printf("%-15s%03d%n", s, n);
Format Specifier	Meaning
%-15s	Left-align string (s), using exactly 15 characters (padded with spaces).
%03d	Print integer (d) with at least 3 digits, adding leading zeroes if necessary.
%n	Print a new line (platform-independent \n).





*/