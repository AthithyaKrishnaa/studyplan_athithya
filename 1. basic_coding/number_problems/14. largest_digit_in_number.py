# largest digit in a number

n=178263
maxx=0

while n>0:
    x=n%10
    maxx=max(maxx,x)
    n//=10
print(maxx)