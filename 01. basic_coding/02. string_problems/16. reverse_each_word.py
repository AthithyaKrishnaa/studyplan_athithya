# reverse each word in a sentence

s="I love programming in Python"

p=s.split()

for word in p:
    word=word[::-1]
    print(word, end=" ")
