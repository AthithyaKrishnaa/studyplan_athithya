# find first and second largest element

arr=[10, 25, 8, 42, 17]
first=second=float('-inf')

for num in arr:
    if num>first:
        second=first
        first=num
    elif first>num>second:
        second=num
print("first largest  :",first)
print("second largest :",second)

# find first and second smallest number 

first=second=float('inf')

for num in arr:
    if num<first:
        second=first
        first=num
    elif first<num<second:
        second=num
print()

print("first smallest   :",first)
print("second smallest  :",second)
