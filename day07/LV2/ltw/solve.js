module.exports = {
    solve: function(string) {
        var count = {};
        var keys = [];
        string.toLowerCase().split('').forEach(function(element, index, array) {
            if (array.indexOf(element) === index) {
                count[element] = 1;
                keys.push(element);
            } else {
                count[element]++;
            }            
        });

        var result = 0;
        for (var i = 0; i < keys.length; i++) {
            var key = keys[i];
            if (count[key] >= 2) result++;
        }        
        return result;
    }
}