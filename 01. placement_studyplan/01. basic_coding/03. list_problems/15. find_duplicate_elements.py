# find duplicate elements

arr=[-5, 2, 2, 0, 7, 10, 10, -5, 15, 20, 20, 30]

sett=set()

for num in arr:
    if num in sett:
        print(num,end=" ")
    sett.add(num)