class Solution {
    int greatestOfThree(int A, int B, int C) {
        
        //we use conditional statement
        return ( (A>B)? ((A>C) ? A : C) : ((B > C)? B : C) );
    }
}
Explanation:

The code uses nested ternary operators to compare the values of A, B, and C and return the greatest among them.
The outermost ternary operator (A > B) ? ... : ... compares A and B.
If A is greater than B, it evaluates the expression after ?, otherwise it evaluates the expression after :
This is used to determine whether A is greater than B.
If A is greater than B, the expression ((A > C) ? A : C) is evaluated. This nested ternary operator compares A and C and returns A if it is greater, otherwise it returns C. 
This determines the greatest among A and C.
If A is not greater than B (i.e., B is greater than or equal to A), the expression ((B > C) ? B : C) is evaluated.
  This nested ternary operator compares B and C and returns B if it is greater, otherwise it returns C. 
This determines the greatest among B and C.
The final result of the outermost ternary operator is the greatest among A, B, and C, which is then returned by the method.

  EXAMPLE: 

Suppose we have A=7, B=12, and C=5.

The outermost ternary operator checks if A is greater than B.
Since 7 is not greater than 12, it evaluates the expression after : 

Now, the inner ternary operator compares B and C. 
Since 12 is greater than 5, it returns 12.

Therefore, the method returns 12, which is the greatest among 𝐴,B, and 𝐶.
------------------------------------------------------------------------------------------------------------------------------------------------------  
  HERE IS AN ANOTHER WAY TO DO THIS:
  
  class Solution {
    int greatestOfThree(int A, int B, int C) {
        int greatest = Integer.MIN_VALUE; // Initialize greatest to the smallest possible integer
        
        int[] numbers = {A, B, C}; // Store the numbers in an array
        
        for (int num : numbers) { // Iterate over the array of numbers
            if (num > greatest) { // Compare current number with greatest
                greatest = num; // Update greatest if the current number is greater
            }
        }
        
        return greatest;
    }
}
Explanation:

We initialize the variable greatest to Integer.MIN_VALUE, the smallest possible integer value. This ensures that any of the given numbers will be greater than this initial value.
We store the three numbers A, B, and C in an array numbers.
We iterate over each number in the array using a for-each loop.
Inside the loop, we compare each number with greatest. If the current number is greater than greatest, we update greatest to the current number.
After iterating over all numbers, we return the final value of greatest, which will be the greatest among A, B, and C.
This approach using loops provides a more flexible and scalable solution, especially if the number of input values increases or if the conditions become more complex.
---------------------------------------------------------------------------------------------------------------------------------------------------------------------
  
