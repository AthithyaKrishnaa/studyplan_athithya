#  armstrong number till n

n=9475

for i in range(n):
    og=i
    sum=0
    power=len(str(i))

    while i>0:
        x=i%10
        sum+=(x**power)
        i=i//10
    
    if sum==og:
        print(sum, end=" ")
    
    