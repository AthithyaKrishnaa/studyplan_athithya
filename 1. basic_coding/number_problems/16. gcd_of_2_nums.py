# GCD of two numbers

a=8
b=20

n=min(a,b)
gcd=0

for i in range(2,n):
    if a%i==0 and b%i==0:
        gcd=max(gcd,i)
        
print(gcd)
    
    