const assert = require("assert");
const solve = require("./solve").solve;

describe('* APP TEST *', function() {
    it('testcase1: solve("Hey fellow warriors") should be return "Hey wollef sroirraw"', function() {
        assert.equal(solve("Hey fellow warriors"), "Hey wollef sroirraw");
    });
    it('testcase2: solve("This is a test") should be return "This is a test"', function() {
        assert.equal(solve("This is a test"), "This is a test");
    });
    it('testcase3: solve("This is another test") should be return "This is rehtona test"', function() {
        assert.equal(solve("This is another test"), "This is rehtona test");
    });
});