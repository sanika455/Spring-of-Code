//issue number #50 
/*
Rishita Chourey FY comp
approach:
The concept of structures in c is used to take the input from the user in form of a complex number
The output of the multiplication is calculated according to the following formula
(a+bi)*(c+di)=(ac-bd)+(bc+ad)i
*/
#include <stdio.h>
#include <conio.h>
typedef struct COMPLEX
{
    int real;
    int img;
    
}complex;
int main()
{
    int a,b,c,d;
    complex n1,n2,final;
    printf("Enter first complex number: ");
    scanf("%d+%di",&a,&b);
    printf("Enter second complex number : ");
    scanf("%d+%di",&c,&d);
    n1.real=a;
    n1.img=b;
    n2.real=c;
    n2.img=d;
    final.real=((n1.real*n2.real)-(n1.img*n2.img));
    final.img=((n1.img*n2.real)+(n1.real*n2.img));
    printf("After multiplication: %d+%di",final.real,final.img);
}