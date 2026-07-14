# rotate array left

arr=[1, 2, 3, 4, 5, 6, 7]
rotate=10

k=rotate%len(arr)
rotated_left=arr[k:]+arr[:k]

print("number of turns :",k)
print("roatate left    :",rotated_left)


# rotate array right

rotated_right=arr[-k:]+arr[:-k]
print("roatate right   :",rotated_right)