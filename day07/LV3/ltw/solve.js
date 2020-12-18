module.exports = {
    solve: function(array, sum) {
        var result;
        var length = array.length;
        var interval = length;
        for (var i = 0; i < length-1; i++) {
            var firstValue = array[i];
            for (var j = i+1; j < length; j++) {
                var secondValue = array[j];
                var comparisonInterval = j-i;
                if (sum === firstValue+secondValue && interval > comparisonInterval) {
                    result = [firstValue, secondValue];
                    interval = comparisonInterval; 
                }
            }
        }
        return result;
    }
}