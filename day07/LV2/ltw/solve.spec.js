const assert = require("assert");
const solve = require("./solve").solve;

describe('* APP TEST *', function() {
    it('testcase1: solve("abcde") should be return 0', function() {
        assert.equal(solve("abcde"), 0);
    });
    it('testcase2: solve("aabbcde") should be return 2', function() {
        assert.equal(solve("aabBcde"), 2);
    });
    it('testcase3: solve("aabBcde") should be return 2', function() {
        assert.equal(solve("aabBcde"), 2);
    });
    it('testcase4: solve("indivisibility") should be return 1', function() {
        assert.equal(solve("indivisibility"), 0);
    });
    it('testcase5: solve("indivisibilities") should be return 2', function() {
        assert.equal(solve("indivisibilities"), 2);
    });
    it('testcase6: solve("aA11") should be return 2', function() {
        assert.equal(solve("aA11"), 2);
    });
    it('testcase7: solve("ABBA") should be return 2', function() {
        assert.equal(solve("ABBA"), );
    });
});