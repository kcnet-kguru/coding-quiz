module.exports = {
    solve: function(array) {       
        var max = array.reduce(function(a, b) { return a>b ? a : b; });
        var count = [];
        for (var i = 0; i <= max; i++) {
            count.push(0);
        }
        array.forEach(function(element) {
            count[element]++;
        });
        return Math.pow(count.indexOf(1), 2) * count.indexOf(2);
    }
}