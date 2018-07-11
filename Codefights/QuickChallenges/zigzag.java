int zigzag(int[] a) {
    int len = a.length;
    int max = 0;
    
    int counter2 = 0;
    for(int i = 1; i < len; i++){
        if(a[i] == a[i - 1]) {
            counter2++;
        }
    }
    if(counter2 == len - 1) {
        return 1;
    }
    
    int index = 1;
    while(index < len - 1){
        int counter = 0;
        for(int i = index; i < len - 1; i++) {
            if(((a[i - 1] > a[i]) && (a[i + 1] > a[i])) || ((a[i - 1] < a[i]) && (a[i + 1] < a[i]))) {
                counter++;
                if(counter > max){
                    max = counter;
                }
            } else {
                index = i;
                break;
            }
        }
        index++;
    }
    return max + 2;
}
