x=int(input("Enter the number"))
c=0
for i in range(1, x):
    if len(str(i))%2==1:
        if i>=1 and i<=9 or i>=100 and i<=999:
            c=c+1
print(f"The number of numbers less than {x} are {c}")
        