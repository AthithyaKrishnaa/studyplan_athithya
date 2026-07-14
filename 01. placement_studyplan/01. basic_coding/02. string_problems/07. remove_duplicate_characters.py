# remove duplicate characters

s='aambrish'
sett=set()

for ch in s:
    if ch not in sett:
        print(ch, end="")
        sett.add(ch)
print()
