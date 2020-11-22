/*
인수로 단어를 받아 홀수의 경우 단어의 중간 글자를 반환하고, 짝수의 경우 중간의 2글자를 반환하는 함수를 작성하세요


Test

getMiddle("test") should return "es"
getMiddle("testing") should return "t"
getMiddle("middle") should return "dd"
getMiddle("A") should return "A"

*/

function getMiddle(word){
    const medianIndex = parseInt(word.length/2 )
    return word.length & 1 ?  word[medianIndex] : word[medianIndex-1]+word[medianIndex]
}

console.log(getMiddle("test"))
console.log(getMiddle("testing"))
console.log(getMiddle("middle"))
console.log(getMiddle("A"))