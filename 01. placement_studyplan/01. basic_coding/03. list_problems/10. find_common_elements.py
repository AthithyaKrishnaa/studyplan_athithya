# find common elements

a1=[-5, 0, 2, 2, 7, 10, 15]
a2=[-5, 2, 2, 8, 10, 20]

a1=set(a1)
a2=set(a2)


for num in a2:
    if num in a1:
        print(num, end=" ")

