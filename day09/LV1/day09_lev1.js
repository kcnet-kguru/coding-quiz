/*

주어진 문자열 src를 정확히 카운트 횟수 반복하는 repeat_str이라는 함수를 작성하십시오.

repeatStr(6, "I") // "IIIIII"
repeatStr(5, "Hello") // "HelloHelloHelloHelloHello"*/


function repeatStr(cnt, str){
    let result = ''
    for(let i = 0 ; i < cnt ; i++){
        result += str
    }
    return result
}

console.log(repeatStr(5, "Hello")  )
console.log(repeatStr(6, "I") )