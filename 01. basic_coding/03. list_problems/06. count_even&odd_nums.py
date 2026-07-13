# count even and odd numbers

arr=[0, -1, -2, 999999999, 1000000000, -999999998, 17, 24, -35, -48]

even_count=0
odd_count=0

for num in arr:
    if num%2==0:
        even_count+=1
    else:
        odd_count+=1

print("even number count :",even_count)
print("odd number count  :",odd_count)