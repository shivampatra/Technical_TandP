#include <stdio.h>
#include <string.h>

int main(void) {
    char pass[20];

  /*  while (1) {
        printf("Enter the password:\n");
        scanf("%s", pass);
        if (strcmp(pass, "Cosmos@32") == 0) {
            printf("Welcome\n");
            break;
        } else {
            printf("Incorrect password\n");
        }
    }


    do {
        printf("Enter the password:\n");
        scanf("%s", pass);
        if (strcmp(pass, "Cosmos@32") == 0) {
            printf("Welcome\n");
            break;
        } else {
            printf("Incorrect password\n");
        }
    }while(1);
    */
    for(;;) {
        printf("Enter the password:\n");
        scanf("%s", pass);
        if (strcmp(pass, "Cosmos@32") == 0) {
            printf("Welcome\n");
            break;
        } else {
            printf("Incorrect password\n");
        }
    }
    return 0;
}