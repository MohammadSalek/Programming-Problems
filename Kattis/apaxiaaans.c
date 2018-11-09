#include <stdio.h>

int main() {

    char ans[250] = {'\0'}, *pt = ans, c, prev = '\0';
    int size = 0;
    while ((c = (char) getc(stdin)) != '\n') {
        if (prev != c) {
            ++size;
            *pt = c;
            ++pt;
            prev = c;
        }
    }
    for (int i = 0; i < size; ++i) {
        printf("%c", ans[i]);
    }

    return 0;
}
