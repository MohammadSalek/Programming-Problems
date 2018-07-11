int[] digitRootSort(int[] a) {
    int[] sums = new int[a.length];
    for(int i = 0; i < a.length; i++) {
        int num = a[i];
        sums[i] = findSum(num);
    }
    int counter = 0;
    while(counter < a.length) {
        for(int i = 1; i < a.length; i++) {
            if(sums[i] < sums[i - 1]) {
                a = changePos(a, i, i-1);
                sums = changePos(sums, i, i-1);
            }
            else if(sums[i] == sums[i - 1]) {
                if(a[i] < a[i - 1]) {
                    a = changePos(a, i, i-1);
                    sums = changePos(sums, i, i-1);
                }
            }
        }
        counter++;
    }
    return a;
}

int findSum(int num) {
    int sum = 0;
    while(num > 0) {
        sum += num%10;
        num /= 10;
    }
    System.out.println(sum);
    return sum;
}

int[] changePos(int[] a, int i, int j){
    int temp = a[i];
    a[i] = a[j];
    a[j] = temp;
    return a;
}
