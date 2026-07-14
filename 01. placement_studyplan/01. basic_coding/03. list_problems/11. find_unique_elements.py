# find unique elements

arr=[-5, 2, 2, 0, 7, 10, 10, -5, 15, 20, 20, 30]

hm={}

for num in arr:
    hm[num]=hm.get(num,0)+1

for key,value in hm.items():
    if  value==1:
        print(key, end=" ")
print()

# brute force

for num in arr:
    if arr.count(num)==1:
        print(num,end=" ")