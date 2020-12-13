module.exports = {
    solve: function (firstNumber, lastNumber) {
        if (firstNumber >= lastNumber) return;

        var count = 0;
        var pattern = /5/g;
        for (var i = firstNumber; i <= lastNumber; i++) {
            if (pattern.test(i.toString())) count++;
        }
        return count;        
    }
}