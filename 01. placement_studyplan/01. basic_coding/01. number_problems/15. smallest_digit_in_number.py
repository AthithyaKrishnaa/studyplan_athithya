# smallest digit in a number

n=1782630
minn=float('inf')

while n>0:
    x=n%10
    minn=min(minn,x)
    n//=10
print(minn)