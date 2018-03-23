// https://codefights.com/interview-practice/topics/arrays

int firstDuplicate(int[] a) {
  
    for(int i:a) {
        int iAbs = Math.abs(i) - 1;
        if (a[iAbs] < 0) return iAbs + 1;
        a[iAbs] = -a[iAbs];
    }
  return -1;
}
