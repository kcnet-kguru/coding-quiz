/*

ATM 기계는 4 자리 또는 6 자리 PIN 코드를 허용하며 PIN 코드는 정확히 4 자리 또는 정확히 6 자리를 포함 할 수 없습니다.
    함수에 유효한 PIN 문자열이 전달되면 true를 반환하고 그렇지 않으면 false를 반환합니다.

"1234"   -->  true
"12345"  -->  false
"a234"   -->  false

Test
"0000" --> true
"1111" --> true
"123456" --> true
"098765" --> true
"000000" --> true
"090909" --> true*/


function checkAtmPinCode(pinCode){
    const reg = /^[0-9]{4,6}/g
    return reg.exec(pinCode) ? true : false

}

console.log(checkAtmPinCode("1111"))
console.log(checkAtmPinCode("0000"))
console.log(checkAtmPinCode("123456"))
console.log(checkAtmPinCode("a234"))
console.log(checkAtmPinCode("000000"))
console.log(checkAtmPinCode("24a23"))
