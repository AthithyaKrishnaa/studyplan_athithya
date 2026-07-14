# reverse a string

s="ambrish"
print("reverse through negative indexing :",s[::-1])

n=len(s)-1
rev=""
while n>=0:
    rev+=s[n]
    n-=1
print("reverse through logic: ",rev)
    
 

