# sum, avg, median, mode

arr = [1, 2, 3, 4]
n=len(arr)
sum=0

for num in arr:
    sum+=num

avg=sum/n

arr_srt=sorted(arr)
if n%2!=0:
    median=arr_srt[n//2]
else:
    median=(arr_srt[n//2-1]+arr_srt[n//2])/2

hm={}
for num in arr:
    hm[num]=hm.get(num,0)+1

max_value=float('-inf')
for key,value in hm.items():
    if value>max_value:
        max_value=value
mode=[]
for key,value in hm.items():
    if value==max_value:
        mode.append(key)
    

print('Sum     :',sum)
print('Average :',avg)
print('Median  :',median)
print('Mode    :',mode)
