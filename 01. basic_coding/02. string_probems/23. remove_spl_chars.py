# remove special characters
s="he@llo#123"

for ch in s:
    if ch.isalnum():
        print(ch,end="")