n=5

# hollow triangle
print("hollow triangle")
for i in range(n):
    for j in range(n-i-1):
        print(' ',end=" ")
    for j in range(2*i+1):
        if j==0 or j==2*i+1-1 or i==n-1:
            print('*',end=" ")
        else:
            print(' ',end=" ")
    
    print()
print()

# number triangle
print("number triangle")
for i in range(n):
    for j in range(i+1):
        print(j+1,end=" ")
    print()
print()

# floyd's triangle
print("floyd's triangle")
c=1
for i in range(n):
    for j in range(i+1):
        print(c,end=" ")
        c+=1
    print()
print()

# pascal's triangle
print("pascal's triangle")
for i in range(n):
    for j in range(n-i-1):
        print('-',end=" ")
    for j in range(i+1):
        print(j+1,end=" ")
    print()
print()

# butteryfly pattern
print('butterfly pattern')
for i in range(n):
    for j in range(i+1):
        print('*',end=" ")
    for j in range(2*(n-i-1)):
        print(' ',end=" ")
    for j in range(i+1):
        print('*',end=" ")
    print()
for i in range(n):
    for j in range(n-i-1):
        print('*',end=" ")
    for j in range(2*(i+1)):
        print(' ',end=" ")
    for j in range(n-i-1):
        print('*',end=" ")
    print()