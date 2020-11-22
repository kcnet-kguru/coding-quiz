# 하나 이상의 단어 문자열을 받아 동일한 문자열을 반환하지만 5 개 이상의 글자 단어가 모두 반전되어 반환하는 함수를 작성합니다.
# 전달 된 문자열은 문자와 공백으로 만 구성됩니다. 공백은 둘 이상의 단어가있는 경우에만 포함됩니다.

def spinWords(str):
    words = str.split(" ")
    new_string=[]
    for word in words:
        if len(word)>=5:
            new_string.append(word[::-1])
        else:
            new_string.append(word)
    return ' '.join(new_string)

if __name__ == '__main__' :
    print(spinWords("Hey fellow warriors"))   #returns "Hey wollef sroirraw"
    print(spinWords("This is a test"))       # returns "This is a test"
    print(spinWords("This is another test"))  #returns "This is rehtona test"
