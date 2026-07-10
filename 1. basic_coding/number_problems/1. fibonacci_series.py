# fibonacci series

# tuple 
f=0
s=1

for i in range(11):
    print(f, end=" ")
    (f,s)=(s,f+s)
    
# temp variable

f=0
s=1

for i in range(11):
    print(f, end=" ")
    temp=f
    f=s
    s=temp+s
    

