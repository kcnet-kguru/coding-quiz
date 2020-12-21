module.exports = {
    solveQ1: function(count, string) {
        var result = "";
        for (var i = 0; i < count; i++) {
            result += string
        }
        return result; // string.repeat(count);
    },
    solveQ2: function(n, x, y) {
        return (n%x === 0 && n%y === 0) ? true : false;
    }
}