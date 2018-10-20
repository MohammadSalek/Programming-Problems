// https://open.kattis.com/problems/autori

#include <stdio.h>

int main() {

    char myString[100];
    char answer[100];
    char *ptr;
    char *ptrAns = answer;

    fgets(myString, 100, stdin);

    for (ptr = myString; *ptr; ptr++) {
        if(ptr == myString) {
            answer[ptrAns - answer] = *ptr;
            ptrAns++;
        }
        else if ( *ptr == '-' && *(ptr + 1) != '\0') {
            answer[ptrAns - answer] = *(ptr + 1);
            ptrAns++;
        }
    }

    for (ptrAns = answer; *ptrAns; ptrAns++) {
        printf("%c", *ptrAns);
    }

    return 0;
}
