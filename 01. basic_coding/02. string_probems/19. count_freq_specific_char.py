# count occurances of a specific character

s="hello world"
target="l"

count=0
for ch in s:
    if ch==target:
        count+=1
        
print(count)