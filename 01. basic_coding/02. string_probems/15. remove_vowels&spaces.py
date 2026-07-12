# remove vowels and spaces

s="hello world"

vow="aeiouAEIOE"

for ch in s:
    if ch not in vow:
        if ch!=" ":
            print(ch, end="")
        