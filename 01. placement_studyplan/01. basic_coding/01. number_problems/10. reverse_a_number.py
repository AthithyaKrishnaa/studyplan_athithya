# reverse a number 

n=12345
rev=0

while n>0:
    x=n%10
    rev=(rev*10)+x
    n=n//10
    
print(rev)

# using str

n=str(n)
print(n[::-1])