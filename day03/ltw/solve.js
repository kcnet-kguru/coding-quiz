module.exports = {
    solve: function (outerArray) {
        var count = 1;
        outerArray.forEach(function(innerArray) {
            count *= innerArray.filter(function(element, index, array) {
                return array.indexOf(element) === index;
            }).length;
        });
        return count;
    }
}