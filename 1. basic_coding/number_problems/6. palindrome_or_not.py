# palindrome number

n=132311
s=str(n)

l=0
r=len(str(n))-1

palindrome=True

while l<r:
    if s[l]!=s[r]:
        palindrome=False
        break
    l+=1
    r-=1

if palindrome:
    print("palindrome")
else:
    print("not palindrome")