# find frequency of each element

arr=[-5, 2, 2, 0, 7, 10, 10, -5, 15, 20, 20, 30]

hm={}

for num in arr:
    hm[num]=hm.get(num,0)+1

for key,value in hm.items():
    print(key,":",value)
    