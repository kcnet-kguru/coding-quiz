/*
정수를 인수(파라미터)로 사용하고 짝수 인 경우 "Even"을 반환하고 홀수 인 경우 "Odd"를 반환하는 함수를 만드세요*/

function check(intVal){
    return intVal & 1 ?  "Odd" : "Even"
}

console.log( check(4))