# strong number or not

n=145
og=n 
sum=0

while n>0:
    x=n%10
    pr=1
    
    while x>1:
        pr*=x
        x-=1
        
    sum+=pr
    n=n//10

if sum==og:
    print("yes")
else:
    print("no")

