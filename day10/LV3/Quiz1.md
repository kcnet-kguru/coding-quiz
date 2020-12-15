## 📚 Day 10
### 🚀 Level 3

#### 🤔 문제 설명

- 두 문자열 `s1`과 `s2`가 주어지면 두 문자열이 얼마나 다른지 시각화하려고 합니다. 
소문자 (`a ~ z`) 만 고려합니다. 먼저 `s1`과 `s2`에있는 각 소문자의 빈도를 세어 보겠습니다.

```
s1 = "A aaaa bb c"

s2 = "& aaa bbb c d"

s1 has 4 'a', 2 'b', 1 'c'

s2 has 3 'a', 3 'b', 1 'c', 1 'd'
```

- 따라서 `s1`과 `s2`의 `'a'`에 대한 최대 값은 `s1`의 4입니다. 
`'b'`의 최대 값은 `s2`에서 3입니다. 
다음에서는 최대 발생 횟수가 1보다 작거나 같은 경우 문자를 고려하지 않습니다.

- 다음 문자열에서 `s1`과 `s2`의 차이를 다시 시작할 수 있습니다. 
`"1 : aaaa / 2 : bbb"` 여기서 `1 : aaaa`의 1은 `a`의 최대 값이 4이므로 문자열 `s1` 및 `aaaa`를 나타냅니다. 
같은 방식으로 `2 : bbb`는 `b`의 최대 값이 3이므로 문자열 `s2` 및 `bbb`를 나타냅니다.

- 작업은 이 최대 값이 1보다 크면 `s1` 또는 `s2`의 각 소문자가 최대 값만큼 여러 번 나타나는 문자열을 생성하는 것입니다. 
이 문자는 최대 값 및 `:`와 함께 나타나는 문자열 번호가 접두사로 붙습니다. 최대 값이 `s1`과 `s2`에있는 경우 접두사는 `= :`입니다.

- 결과적으로 하위 문자열 (ex. `2 : nnnnn` 또는 `1 : hhh` `,` 접두사 포함)은 길이의 내림차순이되고 사전 사전 순서 (문자 및 숫자-더보기)로 정렬 된 길이가 같을 때 코드 포인트별로 정확하게 정렬 됨. 다른 그룹은 `'/'`로 구분됩니다. 


#### 🎯 TestCase

- 예제 및 "예제 테스트"를 참조하십시오.
바라건대 다른 예가 이것을 더 명확하게 할 수 있습니다.

```
s1 = "my&friend&Paul has heavy hats! &"
s2 = "my friend John has many many friends &"
mix(s1, s2) --> "2:nnnnn/1:aaaa/1:hhh/2:mmm/2:yyy/2:dd/2:ff/2:ii/2:rr/=:ee/=:ss"

s1 = "mmmmm m nnnnn y&friend&Paul has heavy hats! &"
s2 = "my frie n d Joh n has ma n y ma n y frie n ds n&"
mix(s1, s2) --> "1:mmmmmm/=:nnnnnn/1:aaaa/1:hhh/2:yyy/2:dd/2:ff/2:ii/2:rr/=:ee/=:ss"

s1="Are the kids at home? aaaaa fffff"
s2="Yes they are here! aaaaa fffff"
mix(s1, s2) --> "=:aaaaaa/2:eeeee/=:fffff/1:tt/2:rr/=:hh"

s1 = "Are they here"
s2 = "yes, they are here"
mix(s1, s2) ---> "2:eeeee/2:yy/=:hh/=:rr"

s1 = "looping is fun but dangerous"
s2 = "less dangerous than coding"
mix(s1, s2) = "1:ooo/1:uuu/2:sss/=:nnn/1:ii/2:aa/2:dd/2:ee/=:gg"

s1 = " In many languages"
s2 = " there's a pair of functions"
mix(s1, s2) = "1:aaa/1:nnn/1:gg/2:ee/2:ff/2:ii/2:oo/2:rr/2:ss/2:tt"
```