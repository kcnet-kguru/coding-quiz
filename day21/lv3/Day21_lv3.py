import string

def pigIt(words):
    return ' '.join(list(map(lambda x: x[1:]+x[0]+'ay' if x not in string.punctuation else x,words.split())))
