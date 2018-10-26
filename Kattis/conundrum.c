// https://open.kattis.com/problems/conundrum

#include <stdio.h>

void toLower(char *arr);

int main() {

    char array[301];
    scanf("%s", array);
    toLower(array);
    char name[] = "PER", *ptName = name, *ptArr = array;
    int counter = 0;
    while (*ptArr) {
        if (*ptArr != *ptName) {
            ++counter;
        }
        ++ptArr;
        ++ptName;
        if (!(*ptName)) {
            ptName = name;
        }
    }
    printf("%d", counter);

    return 0;
}

void toLower(char * arr) {
    char *pt = arr;
    while (*pt) {
        if (*pt >= 97) {
            *pt = (char) ((short) *pt - 32);
        }
        pt++;
    }
}
