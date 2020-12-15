module.exports = {
    solve: function (array) {
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
    }
}