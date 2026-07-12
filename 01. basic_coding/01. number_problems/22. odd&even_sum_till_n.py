# sum of even numbers till n

n=10
i=1

odd_sum=0
even_sum=0

while i<=n:
    if i%2==0:
        even_sum+=i
    else:
        odd_sum+=i
    i+=1

print("odd sum  :",odd_sum)
print("even sum :",even_sum)