# linear search

arr = [10, 20, 30, 40, 50]
key = 40

for i in range(len(arr)):
    if arr[i]==key:
        print("Element",key,"found")
        break

# binary search

arr = [10, 20, 30, 40, 50]
key = 40

l=0
r=len(arr)-1

while l<=r:
    pivot=(l+r)//2
    
    if arr[pivot]==key:
        print("Element",key,"found")
        break
    elif arr[pivot]<key:
        l=pivot+1
    else:
        r=pivot-1
