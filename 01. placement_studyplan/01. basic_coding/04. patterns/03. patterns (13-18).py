n=5

# sandglass pattern
print("sandglass pattern")
for i in range(n):
    for j in range(i+1):
        print(' ',end=" ")
    for j in range(2*(n-i)-1):
        print('*',end=" ")
    print()
for i in range(1,n):
    for j in range(n-i):
        print(' ',end=" ")
    for j in range(2*i+1):
        print('*',end=" ")
    print()
print()

# x pattern
print("x pattern")
for i in range(n):
    for j in range(n):
        if i==j or j==n-i-1:
            print('*',end=" ")
        else:
            print(' ',end=" ")
    print()
print()

# alphabet triangle
print("alphabet triangle")
char='A'
for i in range(n):
    for j in range(i+1):
        print(chr(ord(char)+j),end=" ")
    print()
print()

# alphabet pyramid
print("alphabet pyramid")
char='A'
for i in range(n):
    for j in range(n-i-1):
        print(' ',end=" ")
    for j in range(i+1):
        print(chr(ord(char)+j),end=" ")
    for j in range(i-1,-1,-1):
        print(chr(ord(char)+j),end=" ")
    print()
print()

# number pyramid
print("number pyramid")
for i in range(n):
    for j in range(n-i-1):
        print(' ',end=" ")
    for j in range(i+1):
        print(j+1,end=" ")
    for j in range(i-1,-1,-1):
        print(j+1,end=" ")
    print()
print()

# hollow diamond
print("hollow diamond")
for i in range(n):
    for j in range(n-i-1):
        print(' ',end=" ")
    for j in range(2*i+1):
        if j==0 or j==2*i:
            print('*',end=" ")
        else:
            print(' ',end=" ")
    print()
for i in range(n):
    for j in range(i+1):
        print(' ',end=" ")
    for j in range(2*(n-i-1)):
        if j==0 or j==2*(n-i-1)-2:
            print('*',end=" ")
        else:
            print(' ',end=" ")
    print()


        