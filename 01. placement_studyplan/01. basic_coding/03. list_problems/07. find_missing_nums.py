# find missing number

arr=[1, 2, 3, 4, 5, 6, 8, 9, 10]
arr=sorted(arr)
n=len(arr)+1
actl_tot=(n*(n+1))//2
arr_tot=sum(arr)

print(actl_tot-arr_tot)