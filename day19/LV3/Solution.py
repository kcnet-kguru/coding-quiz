"""
Dictionary fruits = new Dictionary(new String[]{"cherry", "pineapple", "melon", "strawberry", "raspberry"});

fruits.findMostSimilar("strawbery"); // must return "strawberry"
fruits.findMostSimilar("berry"); // must return "cherry"


Dictionary languages = new Dictionary(new String[]{"javascript", "java", "ruby", "php", "python", "coffeescript"});
languages.findMostSimilar("heaven"); // must return "java"
languages.findMostSimilar("javascript"); // must return "javascript" (same words are obviously the most similar ones)

"""

fruits = ["cherry", "pineapple", "melon", "strawberry", "raspberry"]

from collections import Counter
word = "strawbery"

fruits_dict = dict()
for i in fruits:
    fruits_dict[i] = sum(list(map(ord,i)))

print(fruits_dict)

print(sum(list(map(ord,word))))