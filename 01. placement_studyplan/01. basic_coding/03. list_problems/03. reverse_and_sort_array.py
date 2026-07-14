# reverse and sort an array

# reverse
arr=[45, -12, 0, 78, 45, -5, 23, 99, -12, 56]
n=len(arr)-1
res=[]

while n>=0:
    res.append(arr[n])
    n-=1
print(*res,sep=", ")

# sort
print()
sortedd=sorted(arr)

print(*sortedd, sep=", ")

    
