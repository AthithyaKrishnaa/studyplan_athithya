# find frequency of each characters
s='aabbbcccc'

hm={}

for ch in s:
    hm[ch]=hm.get(ch,0)+1

for key, value in hm.items():
    print(key,':',value)