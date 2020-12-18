module.exports = {
    solveQ1: function(integer) {
        return (integer % 2 === 1) ? "Odd" : "Even";
    },
    solveQ2: function(string) {
        var index = Math.round(string.length / 2) - 1;
        var length = (string.length % 2 === 1) ? 1 : 2;
        return string.substr(index, length);
    }
}