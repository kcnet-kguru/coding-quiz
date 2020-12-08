"""
pigIt('Pig latin is cool'); // igPay atinlay siay oolcay
pigIt('Hello world !');     // elloHay orldway !
"""

def changeWord(word):
    if not word[0] in '!.':
        if len(word) > 1:
            return word[1:] + word[0] + 'ay'
        else:
            return word + 'ay'
    return word

def pigIt(orgin_setence):
    return ' '.join(list(map(lambda x: changeWord(x),orgin_setence.split())))