module.exports = {
    solve: function(string) {
        return string.split(" ").map(function(word) {
            if (word.length < 5) {
                return word;
            } else {
                return word.split("").reverse().join("");
            }
        }).join(" ");
    }
}