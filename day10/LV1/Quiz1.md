## 📚 Day 10
### 🚀 Level 1

#### 🤔 문제 설명

- ATM 기계는 4 자리 또는 6 자리 PIN 코드를 허용하며 PIN 코드는 정확히 4 자리 또는 정확히 6 자리를 포함 할 수 없습니다.
- 함수에 유효한 PIN 문자열이 전달되면 `true`를 반환하고 그렇지 않으면 `false`를 반환합니다.


#### 🎯 TestCase

```javascript
"1234"  // true
"12345" // false
"a234"  // false
```
- Test

```javascript
"0000"    // true
"1111"    // true
"123456"  // true
"098765"  // true
"000000"  // true
"090909"  // true
```