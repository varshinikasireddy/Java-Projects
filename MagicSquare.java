import java.util.*;
public class MagicSquare
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter an Odd number:");
        int n = sc.nextInt(); 
        int[][] magicSquare = new int[n][n];
        //fix the position (p,q) for putting 1 -->follow the given universal fact
        int i = n / 2;
        int j = n - 1;
        int num = 1;
        while (num <= n*n)
        {
            if (i == -1 && j == n)// checking condition 4
            {
                i = 0;
                j = n - 2;
            }
            else                   //condition 2
            {           
                if (j == n)    //column value is becoming n
                {  
                    j = 0;
                }
                if (i < 0)     // row is becoming -1
                { 
                    i = n - 1;
                }
            }
            if (magicSquare[i][j] != 0) { //checking condition 3
                i = i + 1;
                j = j - 2;
                continue; //just skip rest of the code and go to next iteration
            } else {    
                magicSquare[i][j] = num;
                num++;
            }
            //condition 1
            i--;
            j++;
        }
        // Print the magic square
        System.out.println("The Magic Square of "+n+"X"+n+" Matrix is:");
        for (i = 0; i < n; i++)
        {
            for (j = 0; j < n; j++)
            {
                System.out.print(magicSquare[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println("The sum of each row/column/diagonal is " + n * (n * n + 1) / 2);
    }
}
//Feeling Happy Understood the Logic Well..#Happy Learning!!
