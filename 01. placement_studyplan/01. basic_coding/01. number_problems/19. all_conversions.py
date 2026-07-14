n=25
b=bin(n)[2:]
o=oct(n)[2:]
h=hex(n)[2:]

print("decimal                :",n)
print()

print("decimal to binary      :",b)
print("decimal to octal       :",o)
print("decimal to hexadecimal :",h)
print()

print("binary to decimal      :", int(b,2))
print("octal to decimal       :", int(o,8))
print("hexadecimal to decimal :", int(h,16))
print()

print("binary to octal       :", oct(int(b,2))[2:])
print("binary to hexadecimal :", hex(int(o,8))[2:])
print()
print("octal to binary       :", bin(int(o,8))[2:])
print("octal to hexadecimal  :", hex(int(o,8))[2:])
print()
print("hexadecimal to octal  :", oct(int(h,16))[2:])
print("hexadecimal to binary :", bin(int(h,16))[2:])



