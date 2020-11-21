"""
input   =  "Hello, World!"
result  =  "1112111121311"

input   =  "aaaaaaaaaaaa"
result  =  "123456789101112"

"11121111213112111131224132411122", "Hello, World! It's me, JomoPipi!"

"11121122342", "hello hello"
"""

def countWords(words):
    returnStr = ""
    checkMap = {}
    for word in words :
        if checkMap.get(word) == None:
            checkMap[word] = 1
        else:
            checkMap[word] += 1
        returnStr += str(checkMap[word])
    return returnStr

a= "Hello, World!"
b="aaaaaaaaaaaa"
c="Hello, World! It's me, JomoPipi!"
d="hello hello"
print(countWords(a))
print(countWords(b))
print(countWords(c))
print(countWords(d))