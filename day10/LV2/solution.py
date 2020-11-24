input = "Hello, World!"
expected = "1112111121311"
input2 = "Hello, World! It's me, JomoPipi!"
expected2 = "11121111213112111131224132411122"

_dict = dict()
answer = ""
for char in input2:
    if char not in _dict: _dict[char] = 1
    else: _dict[char] += 1
    answer += str(_dict[char])

print(answer)