package PuzzleQuestions;

/*
 *  Java Program to add two large numbers using Linked List
 */

/*
Under the simplest form, each node is composed of a data
and a reference (in other words, a link) to the next node in the sequence.
This structure allows for efficient insertion or removal of elements from any position in the sequence.
Maximum value that can be stored in the primitive datatypes
?int? and ?long? is 231 and 263 respectively.
Hence values larger than this cannot be represented using int or long.
An alternative is to use the BigInteger class
which is available in java as java.math.BigInteger .
However, here we will be applying concepts of linked lists to add very large numbers.
 */

import java.util.*;

public class AddTwoLargeNumbers
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        /* Create Linked Lists */
        LinkedList<Integer> num1 = new LinkedList<Integer>();
        LinkedList<Integer> num2 = new LinkedList<Integer>();
        LinkedList<Integer> ans = new LinkedList<Integer>();
        /* Accept numbers */
        System.out.println("Adding Large Numbers Using Linked Lists Test\n");
        System.out.println("Enter number 1");
        String s1 = scan.next();
        System.out.println("Enter number 2");
        String s2 = scan.next();
        /* Store digits in lists */
        int l1 = s1.length(), l2 = s2.length();
        for (int i = l1 - 1; i >= 0; i--)
            num1.add(s1.charAt(i) - '0');
        for (int i = l2 - 1; i >= 0; i--)
            num2.add(s2.charAt(i) - '0');
        /* Adding digits and storing in ans list */
        int len = l1 > l2 ? l1 : l2;
        int carry = 0;
        for (int i = 0; i < len; i++)
        {
            int d1 = 0, d2 = 0;
            try {
                d1 = num1.get(i);
            }
            catch(Exception e){}
            try {
                d2 = num2.get(i);
            }
            catch(Exception e){}
            int x = d1 + d2 + carry;
            ans.add(x % 10);
            carry = x / 10;
        }
        /* Adding carry */
        while (carry != 0)
        {
            ans.add(carry % 10);
            carry /= 10;
        }
        /* Printing ans list */
        System.out.print("\nSum = ");
        for (int i = ans.size() - 1; i >= 0; i--)
            System.out.print(ans.get(i));
        System.out.println();
    }
}
