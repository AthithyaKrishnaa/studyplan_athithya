# count positive and negative numbers

arr=[0, -5, 12, -8, 7, -3, 20, 0, -15, 4]

pos_count=0
neg_count=0

for num in arr:
    if num>0:
        pos_count+=1
    elif num<0:
        neg_count+=1
    
print("positive count :",pos_count)
print("negative count :",neg_count)