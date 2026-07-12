# find sum, average, median, mode of array elements

arr=[12, 7, 5, 7, 18, 20, 12, 7, 25, 30, 18, 18, 5]
sum=0
i=0
n=len(arr)

# sum
while i<n:
    sum+=arr[i]
    i+=1

# average
avg=sum//n

# median
arr_sort=sorted(arr)
if n%2!=0:
    median=arr_sort[n//2]
else:
    median=(arr_sort[(n//2)-1]+arr_sort[n//2])//2
    
# mode

hm={}
for num in arr:
    hm[num]=hm.get(num,0)+1
max_count=0
mode=arr[0]

for key, value in hm.items():
    if value>max_count:
        max_count=value
        mode=key
        
print("sum       :",sum)
print("average   :",avg)
print("median    :",median)
print("mode      :",mode)


