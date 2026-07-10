# LCM of 2 numbers

a=12
b=18

lcm=max(a,b)

while True:
    if lcm%a==0 and lcm%b==0:
        print(lcm)
        break
    lcm+=1