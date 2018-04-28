// https://codefights.com/arcade/intro

/*
Sudoku is a number-placement puzzle. The objective is to fill a 9 × 9 grid with digits so that each column, each row, and each of the nine 3 × 3 sub-grids that compose the grid contains all of the digits from 1 to 9.

This algorithm should check if the given grid of numbers represents a correct solution to Sudoku.

Example

For the first example below, the output should be true. For the other grid, the output should be false: each of the nine 3 × 3 sub-grids should contain all of the digits from 1 to 9.

Input/Output

    [execution time limit] 3 seconds (java)

    [input] array.array.integer grid

    A matrix representing 9 × 9 grid already filled with numbers from 1 to 9.

    [output] boolean

    true if the given grid represents a correct solution to Sudoku, false otherwise.
*/



boolean sudoku(int[][] grid) {    
    
    int iStart = 0;
    int iEnd = 3;
    int jStart = 0;
    int jEnd = 3;
     
    int counter = 0;
    while(counter < 9){
        HashSet<Integer> set = new HashSet<>();
        for(int i = iStart; i < iEnd; i++){
            for(int j = jStart; j < jEnd; j++){
                set.add(grid[i][j]);
            }
        }
        if(set.size() != 9) return false;

        if(iStart + 3 >= 9){
            iStart = 0;
            iEnd = 3;
            jStart += 3;
            jEnd += 3;
        }else{
            iStart += 3;
            iEnd += 3;
        }
        counter++;
    }
    
    for(int i = 0; i < 9; i++){
        HashSet<Integer> set = new HashSet<>();
        for(int j = 0; j < 9; j++){
            set.add(grid[i][j]);
        }
        if(set.size() != 9) return false;
    }
    
    for(int i = 0; i < 9; i++){
        HashSet<Integer> set = new HashSet<>();
        for(int j = 0; j < 9; j++){
            set.add(grid[j][i]);
        }
        if(set.size() != 9) return false;
    }
    
    return true;
}
