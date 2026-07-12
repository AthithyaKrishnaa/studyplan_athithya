# count uppercase and lowercase characters

s="AmbrisH"

upp_count=0
lwr_count=0

for ch in s:
    if ch.isupper():
        upp_count+=1
    else:
        lwr_count+=1
    
print("uppercase count :", upp_count)
print("lowercase count :", lwr_count)