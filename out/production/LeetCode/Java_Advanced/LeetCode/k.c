#include <cs50.h>
#include <stdio.h>
void pattern(int input);
int main(void)
{
    int n;
    do{
         n=get_int("Enter a value:");
    }while(n<1 || n>8);
    pattern(n);
    printf("\n");

}
void pattern(int input){
    int span=1;
    int count=1;

    while(count<input+1){
        span=span+2;
        count++;
    }
    int center=((span-(span%2))/2)+1;
    for(int i=1;i<=input;i++){
        for(int j=1;j<=center+i;j++){
            //if(j>center+i){break;}
            if(j==center){
                printf("  ");
            }
            else if(j<center-i){
                printf(" ");
            }else{
                printf("#");
            }

        }
        printf("\n");

    }
}
void pattern_(int number){
    for (int height = 0; height < number; height++) //height and number of lines
    {
        for (int spaces = number - height - 2; spaces >= 0; spaces--) //to print spaces before pyramid
        {
            printf(" ");
        }
        for (int row = 0; row <= height; row++) //left pyramid
        {
            printf("#");
        }
        printf("  ");
        for (int row2 = 0; row2 <= height; row2++) //right pyramid
        {
            printf("#"); 
        }
        printf("\n");
    }
}