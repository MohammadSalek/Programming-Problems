int[][] constructSubmatrix(int[][] matrix, int[] rowsToDelete, int[] columnsToDelete) {
    int newRow = matrix.length - rowsToDelete.length;
    int newCol = matrix[0].length - columnsToDelete.length;

    int[][] answer = new int[newRow][newCol];
    
    int rowCounter, colCounter;
    rowCounter = colCounter = 0;
    for(int i = 0; i < matrix.length; i++) {
        for(int j = 0; j < matrix[0].length; j++)  {
            if(hasThis(rowsToDelete, i)) {
                rowCounter--;
                break;
            }
            if(hasThis(columnsToDelete, j)){
                j++;
            }
            answer[rowCounter][colCounter] = matrix[i][j];
            colCounter++;
        }
        colCounter = 0;
        rowCounter++;
    }
    return answer;
}

boolean hasThis(int[] array, int num){
    for(int i = 0; i < array.length; i++){
        if(array[i] == num) {
            return true;
        }
    }
    return false;
}
