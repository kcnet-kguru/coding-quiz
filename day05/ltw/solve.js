module.exports = {
    solveV1: function(array) {
        for (var center = 0, length = array.length; center < length; center++) {
            var left = 0;
            var right = 0;
            for (var i = 0; i < center; i++) {
                left += array[i];
            }
            for (var i = center+1; i < length; i++) {
                right += array[i];
            }
            if (left === right) return center; 
        }
        return -1;
    },
    solveV2: function(array) {
        var left = 0;
        var right = array.reduce(function(a, b) { return a + b; }, 0);
        for (var i = 0; i < array.length; i++) {
            var center = array[i];
            right -= center;
            if (left === right) return i;
            left += center;
        }
        return -1;
    }
    
}