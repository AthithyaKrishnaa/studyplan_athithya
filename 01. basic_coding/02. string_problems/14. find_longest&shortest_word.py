# find longest and shortest word

s="I love programming in Python"
p=s.split()

long_word=p[0]

for word in p:
    if len(word)>len(long_word):
        long_word=word

print("longest word  :",long_word)


short_word=p[0]

for word in p:
    if len(word)<len(short_word):
        short_word=word

print("shortest word  :",short_word)