/*한 번만 나타나는 요소 (x라고합시다)와 두 번만 나타나는 요소 (y라고합시다)를 제외하고 모든 요소가 세 번 나타나는 양의 정수 배열이 제공됩니다.

    당신의 임무는 x * x * y를 찾는 것입니다.

    Example

For arr=[1, 1, 1, 2, 2, 3], the result should be 18

3 x 3 x 2 = 18

For arr=[6, 5, 4, 100, 6, 5, 4, 100, 6, 5, 4, 200], the result should be 4000000

200 x 200 x 100 = 4000000*/


function missingValues(arr) {
    let x,y
    let uniqValues = new Set(arr)

    for(let uniqValue of uniqValues){
        let cnt = arr.filter(value => value == uniqValue).length
        if(cnt === 1) x = uniqValue
        else if(cnt === 2) y = uniqValue
    }
    return x*x*y
}

console.log(missingValues([1, 1, 1, 2, 2, 3] ))
console.log(missingValues([6, 5, 4, 100, 6, 5, 4, 100, 6, 5, 4, 200] ))