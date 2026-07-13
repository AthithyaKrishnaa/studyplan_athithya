# remove a specific element
arr=[-5, 0, 2, 7, 10, 2, 15, 20]
tar=2
arr=[x for x in arr if x!=tar]
print("removed",tar,"   :",arr)

# insert a number at a position
element=100
pos=3
arr.insert(pos,element)
print("inserted",element,":",arr)

# delete an element
val=7
arr.remove(val)
print("deleted",val,"   :",arr)