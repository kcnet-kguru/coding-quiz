// 입력 된 세 문자열의 모든 문자를 그룹으로 결합하는 문자열을 반환하는 함수를 만듭니다. 모든 입력의 첫 글자를 가져 와서 서로 그룹화합니다.
// 모든 편지에 대해이 작업을 수행하십시오.
// 아래 예를 참조하십시오!
//
// E.g. Input: "aa", "bb" , "cc" => Output: "abcabc"
//
// tripleTrouble(one, two, three)
//
// tripleTrouble("this","test","lock"), "ttlheoiscstk"
// tripleTrouble("aa","bb","cc"), "abcabc"
// tripleTrouble("Bm", "aa", "tn"), "Batman"
// tripleTrouble("LLh","euo","xtr"), "LexLuthor"

tripleTrouble("this","test","lock");
tripleTrouble("aa","bb","cc");
tripleTrouble("Bm", "aa", "tn");
tripleTrouble("LLh","euo","xtr");

function tripleTrouble(one, two, three){
    let oneArr = one.split('');
    let twoArr = two.split('');
    let threeArr = three.split('');
    let totalArr = [];
    for(let i=0;i<oneArr.length;i++){
        totalArr.push(oneArr[i] + twoArr[i] + threeArr[i]);
    }
    totalArr = totalArr.join('');
    console.log(totalArr);
}