# find largest and smallest difference

arr= [-100, 50, 0, 200, -50, 150, 75]

# find largest difference
print("largest difference :", max(arr)-min(arr))

# find smallest difference

smallest=float('inf')
arr=sorted(arr)
for i in range(len(arr)-1):
    smallest=min(smallest,arr[i+1]-arr[i])

print("smallest difference :", smallest)