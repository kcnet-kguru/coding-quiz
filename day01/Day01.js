function nbDig(n , d){
    var result = 0 ;
    var count = 0
    var s = '';
    for(var i = 0 ; i <= n ; i++) {
        result = i * i
        reg = new RegExp( d ,'gi')
        s = result.toString().match(reg )
        count += (s == null ? 0 : s.length)
    }
    return count
}

console.log(nbDig(25, 1)) //=> 11
console.log(nbDig(5750, 0)) //=> 4700
console.log(nbDig(11011, 2))// => 9481
console.log(nbDig(12224, 8)) //=> 7733
console.log(nbDig(11549, 1)) //=> 11905