#include <stdio.h>

int main() {

    char *buff = NULL;
    size_t buffSize = 0;
    getline(&buff, &buffSize, stdin);
    printf("%s", (*buff == 'O' && *(buff + 4) == '3' && *(buff + 5) == '1') ||
                 (*buff == 'D' && *(buff + 4) == '2' && *(buff + 5) == '5') ? "yup" : "nope");
    return 0;

}
