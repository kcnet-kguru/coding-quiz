"""
내 친구는 1에서 n까지 일련의 숫자를 취합니다 (여기서 n> 0).

그 순서 안에서 그는 두 개의 숫자 a와 b를 선택합니다.

그는 a와 b의 곱은 a와 b를 제외한 모든 숫자의 합과 같아야한다고 말합니다.

숫자 n이 주어지면 그가 시퀀스에서 제외시킨 숫자를 말해 줄 수 있습니까?

이 함수는 매개 변수 n (n은 항상 0보다 큽니다)을 취하고 다음 형식의 배열 또는 문자열 (언어에 따라 다름)을 리턴합니다.

[(a, b), ...] or [[a, b], ...] or {{a, b}, ...} or or [{a, b}, ...]

모든 (a, b)는 시퀀스 1에서 n까지 제거 가능한 숫자입니다.


[(a, b), ...] 또는 [[a, b], ...] 또는 {{a, b}, ...} 또는 ...는 "a"의 오름차순으로 정렬됩니다. .


 (a, b) 가능한 여러 가지가 있습니다. 내 친구가 진실을 말하지 않았 음을 증명하는 가능한 숫자가 없으면 함수는 빈 배열 (또는 빈 문자열)을 반환합니다! (Go :이 경우 nil 반환).

 Examples:
removNb(26) should return [(15, 21), (21, 15)]

or

removNb(26) should return { {15, 21}, {21, 15} }

or

removeNb(26) should return [[15, 21], [21, 15]]
"""
def removeNb(n):
    answer = []
    list_sum = sum([i for i in range(1, n + 1)])
    for a in range(1, n + 1):
        b = (list_sum - a) / (a + 1)
        if b == round(b) and b <= n:
            answer.append([a,int(b)])
    return answer