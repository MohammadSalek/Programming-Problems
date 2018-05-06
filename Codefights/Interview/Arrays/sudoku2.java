/*
Sudoku is a number-placement puzzle. The objective is to fill a 9 × 9 grid with numbers in such a way that each column, each row, and each of the nine 3 × 3 sub-grids that compose the grid all contain all of the numbers from 1 to 9 one time.

Implement an algorithm that will check whether the given grid of numbers represents a valid Sudoku puzzle according to the layout rules described above. Note that the puzzle represented by grid does not have to be solvable.

Example

    For

    grid = [['.', '.', '.', '1', '4', '.', '.', '2', '.'],
            ['.', '.', '6', '.', '.', '.', '.', '.', '.'],
            ['.', '.', '.', '.', '.', '.', '.', '.', '.'],
            ['.', '.', '1', '.', '.', '.', '.', '.', '.'],
            ['.', '6', '7', '.', '.', '.', '.', '.', '9'],
            ['.', '.', '.', '.', '.', '.', '8', '1', '.'],
            ['.', '3', '.', '.', '.', '.', '.', '.', '6'],
            ['.', '.', '.', '.', '.', '7', '.', '.', '.'],
            ['.', '.', '.', '5', '.', '.', '.', '7', '.']]

    the output should be
    sudoku2(grid) = true;

    For

    grid = [['.', '.', '.', '.', '2', '.', '.', '9', '.'],
            ['.', '.', '.', '.', '6', '.', '.', '.', '.'],
            ['7', '1', '.', '.', '7', '5', '.', '.', '.'],
            ['.', '7', '.', '.', '.', '.', '.', '.', '.'],
            ['.', '.', '.', '.', '8', '3', '.', '.', '.'],
            ['.', '.', '8', '.', '.', '7', '.', '6', '.'],
            ['.', '.', '.', '.', '.', '2', '.', '.', '.'],
            ['.', '1', '.', '2', '.', '.', '.', '.', '.'],
            ['.', '2', '.', '.', '3', '.', '.', '.', '.']]

    the output should be
    sudoku2(grid) = false.

    The given grid is not correct because there are two 1s in the second column. Each column, each row, and each 3 × 3 subgrid can only contain the numbers 1 through 9 one time.

Input/Output

    [execution time limit] 3 seconds (java)

    [input] array.array.char grid

    A 9 × 9 array of characters, in which each character is either a digit from '1' to '9' or a period '.'.

    [output] boolean

    Return true if grid represents a valid Sudoku puzzle, otherwise return false.

*/

boolean sudoku2(char[][] grid) {
    for(int y=0; y<grid.length; y++){
        HashSet<Character> xSet = new HashSet<>();
        int xDotCounts = 0;
        for(int x=0; x<grid[0].length; x++){  
            if(grid[y][x] == '.') xDotCounts++;
            else xSet.add(grid[y][x]); 
            if((x%3 == 0) && (y%3 == 0)){
                HashSet<Character> set = new HashSet<>();
                int dotCounts = 0;
                for(int i=0; i<3; i++){
                  for(int j=0; j<3; j++){
                        char ch = grid[y+i][x+j];
                        if(ch == '.') dotCounts++;
                        else set.add(ch);
                        }
                    }
                if(set.size() + dotCounts < 9){
                    System.out.println(set);
                    return false;
                } 
            }
        }
        if(xSet.size() + xDotCounts < 9){
            System.out.println("xset" + xSet + " " + xDotCounts);
            return false; 
        }
    }
    for(int x=0; x<grid[0].length; x++){
        HashSet<Character> ySet = new HashSet<>();
        int yDotCounts = 0;
        for(int y=0; y<grid.length; y++){
            if(grid[y][x] == '.') yDotCounts++;
            else ySet.add(grid[y][x]); 
        }
        if(ySet.size() + yDotCounts < 9){
            System.out.println("yset" + ySet + " " + yDotCounts);
            return false; 
        }
    }
    return true;
}
