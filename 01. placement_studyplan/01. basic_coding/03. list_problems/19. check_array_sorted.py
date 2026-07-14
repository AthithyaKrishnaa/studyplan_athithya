# check if array is sorted

arr=[-100, -50, -50, 0, 25, 25, 100, 200]

sortedd=True
for i in range(1,len(arr)):
    if arr[i-1]>arr[i]:
        sortedd=False

if sortedd:
    print("yes")
else:
    print("no")
    