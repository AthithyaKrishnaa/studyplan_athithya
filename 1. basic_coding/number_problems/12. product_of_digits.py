# product of digits

n=1234
pr=1

while n>0:
    x=n%10
    pr*=x
    n//=10
print(pr)