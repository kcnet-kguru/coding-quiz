"""
Count the number of Duplicates
입력 문자열에서 두 번 이상 나타나는 고유 한 대소 문자를 구분하지 않는 알파벳 문자와 숫자의 개수를 반환하는 함수를 작성합니다.
입력 문자열은 알파벳 (대문자와 소문자 모두)과 숫자 만 포함한다고 가정 할 수 있습니다.

Example
"abcde" -> 0 # no characters repeats more than once
"aabbcde" -> 2 # 'a' and 'b'
"aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`)
"indivisibility" -> 1 # 'i' occurs six times
"Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice
"aA11" -> 2 # 'a' and '1'
"ABBA" -> 2 # 'A' and 'B' each occur twice

duplicateCount(text){
  //...
}
"""
a="abcde"
b="aabbcde"
c="aabBcde"
d="indivisibility"
e="Indivisibilities"
f="aA11"
g="ABBA"
def duplicateCount(text):
    tempText = text.upper()
    result = {x.upper():tempText.count(x) for x in tempText if tempText.count(x) != 1}
    return len(result)


print(duplicateCount(a))
print(duplicateCount(b))
print(duplicateCount(c))
print(duplicateCount(d))
print(duplicateCount(e))
print(duplicateCount(f))
print(duplicateCount(g))