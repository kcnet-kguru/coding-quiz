"""
음이 아닌 정수 (초)를 입력으로 사용하고 사람이 읽을 수있는 형식 (HH : MM : SS)으로 시간을 반환하는 함수를 작성합니다.

HH = hours, padded to 2 digits, range: 00 - 99
MM = minutes, padded to 2 digits, range: 00 - 59
SS = seconds, padded to 2 digits, range: 00 - 59
최대 시간은 359999 (99:59:59) 를 초과하지 않습니다.

You can find some examples in the test fixtures.
humanReadable(seconds)

Test
humanReadable(0) => '00:00:00'
humanReadable(5) => '00:00:05'
humanReadable(60) => '00:01:00'
humanReadable(86399) => '23:59:59'
humanReadable(359999) => '99:59:59'
"""
def humanReadable(seconds):
    hours = int(seconds/3600)
    minutes = int(seconds%3600/60)
    second = seconds%3600%60
    hours = str(hours).rjust(2,'0')
    minutes = str(minutes).rjust(2,'0')
    second = str(second).rjust(2,'0')
    return f"{hours}:{minutes}:{second}"

print(humanReadable(0))  #=> '00:00:00'
print(humanReadable(5)) #=> '00:00:05'
print(humanReadable(60)) #=> '00:01:00'
print(humanReadable(86399)) #=> '23:59:59'
print(humanReadable(359999)) #=> '99:59:59'