# move all zeroes to the end

arr=[0, -5, 0, 2, 7, 0, 10, 0, 15, 20, 0, 30]

n=len(arr)

j=0
for num in arr:
    if num!=0:
        arr[j]=num
        j+=1
        
while j<n:
    arr[j]=0
    j+=1
    
print(arr)
        