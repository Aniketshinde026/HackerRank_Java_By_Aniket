import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int i = scan.nextInt();
        double d=scan.nextDouble();
        scan.nextLine();
        String s=scan.nextLine();
        
        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}


/*Problem Explanation:
scan.nextInt() reads an integer but does not consume the newline character (\n).

scan.nextDouble() reads a double but also leaves a newline (\n) in the buffer.

When scan.nextLine() is called, it immediately reads the leftover newline instead of waiting for actual input.
📌 Why Does This Work?
scan.nextInt() → Reads 42, but leaves \n in the buffer.

scan.nextDouble() → Reads 3.1415, but again leaves \n in the buffer.

scan.nextLine() (added) → Consumes the leftover \n, so that the next nextLine() correctly reads the full sentence.

scan.nextLine() → Now reads the full string input without issues.*/