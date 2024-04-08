#include <stdio.h>
int main() {
    int a;
    int *p;

    a = 2;
    p = &a; // a = *p

    printf("%d \n", a);
    printf("%p \n", p);

    return 0;
}