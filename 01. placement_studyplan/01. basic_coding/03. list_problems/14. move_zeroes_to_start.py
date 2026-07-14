# move all zeroes to the beginning

arr=[0, -5, 0, 2, 7, 0, 10, 0, 15, 20, 0, 30]

n=len(arr)

j=n-1
for i in range(n-1,-1,-1):
    if arr[i]!=0:
        arr[j]=arr[i]
        j-=1
        
while j>=0:
    arr[j]=0
    j-=1
    
print(arr)
        