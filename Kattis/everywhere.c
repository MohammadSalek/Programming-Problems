#include <stdio.h>
#include <string.h>

int isInArray(char array[100][21], char str[21]) {
    int i;
    for (i = 0; i < 100; ++i) {
        if (*array[i] != '\0') {
            if (strcmp(array[i], str) == 0) {
                return 1;
            }
        } else {
           strcpy(array[i], str);
           break;
        }
    }
    return 0;
}

int main() {
    int n, m, counter;
    scanf("%d", &n);
    while (n) {
        scanf("%d", &m);
        char array[100][21] = {NULL};
        counter = 0;
        while (m) {
            char tmp[21];
            scanf("%s", tmp);
            if (isInArray(array, tmp) == 0) {
                ++counter;
            }
            --m;
        }
        printf("%d\n", counter);
        --n;
    }
    return 0;
}
