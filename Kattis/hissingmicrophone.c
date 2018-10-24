#include <stdio.h>

int hasSs(char array[]);

int main() {

    char string[31];
    scanf("%s", string);
    if (hasSs(string) == 0) {
        printf("hiss");
    }
    else {
        printf("no hiss");
    }

    return 0;
}

int hasSs(char pt[]) {
    for (; *pt; pt++) {
        if (*pt == 's' && *++pt && *pt == 's') {
            return 0;
        }
    }
    return -1;
}
