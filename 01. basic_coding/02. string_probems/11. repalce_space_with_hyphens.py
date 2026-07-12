# replace space with hyphens

s="python is easy"
res=""

for ch in s:
    if ch==" ":
        res+='-'
    else:
        res+=ch
print(res)
    