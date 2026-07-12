# count vowels and consonants

s="ambrish"
vow="aeiouAEIOU"

vow_count=0
const_count=0

for ch in s:
    if ch in vow:
        vow_count+=1
    else:
        const_count+=1
        
print("vowels count    :",vow_count)
print("consonant count :",const_count)