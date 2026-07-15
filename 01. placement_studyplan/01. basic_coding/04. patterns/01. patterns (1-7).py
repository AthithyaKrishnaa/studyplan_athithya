n=5

# right triangle
print("right triangle")
for i in range(n):
    for j in range(i+1):
        print('*',end=" ")
    print()
print()

# inverted triangle
print("inverted triangle")
for i in range(n):
    for j in range(n-i):
        print('*',end=" ")
    print()
print()

# pyramid pattern
print("pyramid pattern")
for i in range(n):
    for j in range(n-i-1):
        print(' ',end=" ")
    for j in range(2*i+1):
        print('*',end=" ")
    print()
print()

# inverted pyramid
print("inverted pyramid")
for i in range(n):
    for j in range(i+1):
        print(' ', end=" ")
    for j in range(2*(n-i)-1):
        print('*',end=" ")
    print()
print()

# diamond pattern
print("diamond pattern")
for i in range(n):
    for j in range(n-i-1):
        print(' ',end=" ")
    for j in range(2*i+1):
        print('*',end=" ")
    print()
    
for i in range(1,n):
    for j in range(i):
        print(' ',end=" ")
    for j in range(2*(n-i)-1):
        print('*',end=" ")
    print()
print()

# hollow square
print("hollow square")
for i in range(n):
    for j in range(n):
        if i==0 or i==n-1 or j==0 or j==n-1:
            print('*',end=" ")
        else: 
            print(' ',end=" ")
    print()
print()

# hollow rectangle
print("hollow rectangle")
row=4
col=6
for i in range(row):
    for j in range(col):
        if i==0 or i==row-1 or j==0 or j==col-1:
            print('*',end=" ")
        else:
            print(' ',end=" ")
    print()
print()

