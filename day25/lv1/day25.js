/*두 개의 문자열 a, b를 인자로 받아 두 문자에 중복되지 않은 문자를 합친 문자열을 리턴하는 함수를 작성하라.

    For example:

    solve("xyab","xzca") = "ybzc"
--The first string has 'yb' which is not in the second string.
--The second string has 'zc' which is not in the first string.

solve("xyabb","xzca"),"ybbzc"
solve("abcd","xyz"),"abcdxyz"
solve("xxx","xzca"),"zca"*/

solve = (a, b)=>{
    let tmp = a
    let result = ''
    for (let value of b) {
        const regx = new RegExp(value, 'gi')
        tmp = tmp.replace(regx, '');
    }
    result = tmp
    tmp = b
    for(let value of a){
        const regx = new RegExp(value, 'gi')
        tmp = tmp.replace(regx, '')
    }
    result += tmp
    console.log(result)
    return result
}

solve("xyabb","xxzca");
solve("abcd","xyz");
solve("xxx","xzca");