#include <stdio.h>
#include <stdlib.h>

#define redundant unsigned long long

int compareFunc(const void * a, const void * b);

int main() {

    redundant n, m, i, res = 0;
    redundant counter;

    while (1) {

        scanf("%llu %llu", &n, &m);

        if (n == 0 && m == 0) {
            break;
        }

        redundant array1[n];
        redundant array2[m];

        counter = 0;
        while (counter < n) {
            scanf("%llu", &array1[counter]);
            counter++;
        }

        counter = 0;
        while (counter < m) {
            scanf("%llu", &array2[counter]);
            counter++;
        }

        int *item;
        for (i = 0; i < n; ++i) {
            item = (int *) bsearch(&array1[i], array2, m, sizeof(redundant), compareFunc);
            if (item != NULL) {
                res++;
            }
        }

        printf("%llu\n", res);
        res = 0;

    }

    return 0;
}

int compareFunc(const void * a, const void * b) {
    return ( *(int *) a - *(int *) b );
}
