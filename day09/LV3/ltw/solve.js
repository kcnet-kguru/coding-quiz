module.exports = {
    solve: function(index) {
        var u = [0];
        var i = 0;
        while (u.length <= index) {
            var y = 2 * u[i] + 1;
            var z = 3 * u[i] + 1;
            if (u.indexOf(y) === -1) u.push(y);
            if (u.indexOf(z) === -1) u.push(z);
            i++
        }
        return u[index-1];
    }
}