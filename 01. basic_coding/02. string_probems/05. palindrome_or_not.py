# check palindrome or not

s="race#car%"

l=0
r=len(s)-1
palindrome=True

while l<r:
    if not s[l].isalpha():
        l+=1
    elif not s[r].isalpha():
        r-=1
    else:
        if s[l]!=s[r]:
            palindrome=False
            break
        l+=1
        r-=1

if palindrome:
    print("yes")
else:
    print("no")