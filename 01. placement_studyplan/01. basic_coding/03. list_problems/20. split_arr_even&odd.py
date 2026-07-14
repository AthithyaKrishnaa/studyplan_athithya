# split array into even and odd

arr=[0, -5, 12, 7, -8, 15, 20, -3, 4, 9]

even=[]
odd=[]

for num in arr:
    if num%2==0:
        even.append(num)
    else:
        odd.append(num)

print("even :",even)
print("odd  :",odd)