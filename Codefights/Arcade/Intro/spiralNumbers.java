// https://codefights.com/arcade/intro

/*
Construct a square matrix with a size N × N containing integers from 1 to N * N in a spiral order, starting from top-left and in clockwise direction.

Example

For n = 3, the output should be

spiralNumbers(n) = [[1, 2, 3],
                    [8, 9, 4],
                    [7, 6, 5]]

Input/Output

    [execution time limit] 3 seconds (java)

    [input] integer n

    Matrix size, a positive integer.

    Guaranteed constraints:
    3 ≤ n ≤ 100.

    [output] array.array.integer
*/

int[][] spiralNumbers(int n) {
   int[][] array = new int[n][n];
    
    int left = 0;
    int right = n - 1;
    int top = 0;
    int down = n - 1;
    
    int counter = 1;
    while(counter <= n * n ){
        for (int x = left; x <= right; x++)
            array[top][x] = counter++;
        top++;
        
        for (int y = top; y <= down; y++)
            array[y][right] = counter++;
        right--;
        
        for (int x = right; x >= left; x--)
            array[down][x] = counter++;
        down--;
        
        for (int y = down; y >= top; y--)
            array[y][left] = counter++;
        left++;
    }
    return array;
}
