#include <stdio.h>
#include <stdlib.h>

char trick(char x, char *chars, int rotation) {
    for (char *pt = chars; *pt; ++pt) {
        if (*pt == x) {
            while (rotation--) {
                ++pt;
                if (*pt == '\0')
                    pt = chars;
            }
            return *pt;
        }
    }
}

int main() {
    char *chars = {"ABCDEFGHIJKLMNOPQRSTUVWXYZ_."};
    int size = 40 + 6, rotation, idx; /* 3 + 3 = 3 (rotation number + ' ') + 1 ('\0') + 2 ("\n")  */
    char input[size], ans[size], *p = input;
    while (fgets(input, size, stdin) != NULL) {
        if (input[0] == '0')
            return 0;
        rotation = (int)strtol(input, &p, 10);
        idx = 0;
        for (char *pt = ++p; *pt; ++pt, ++idx)
            ans[idx] = trick(*pt, chars, rotation);
        for (idx -= 2; idx != -1; --idx)
            putchar(ans[idx]);
        putchar('\n');
    }
}
