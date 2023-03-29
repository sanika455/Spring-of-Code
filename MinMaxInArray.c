//Solution to issue #182
//ISHA BAVISKAR

#include <stdio.h>
int main()
{
    int array[10], max, min, a,i;

    printf("Enter the no of elements: ");
    scanf("%d", &a);

    printf("Enter the elements of array: ");
    for (i=0;i<a;i++){
        scanf("%d", &array[i]);
    }
    min= array[0];
    max= array[0];

    for(i=0;i<a;i++)
    {
        if(array[i]>max)
        {
            max= array[i];
        }

        if(array[i]<min)
        {
            min= array[i];
        }
    }
    
    printf("Minimum element is:%d" , min);
    printf("\nMaximum element is:%d" , max);

    return 0;
}