str1 = "Hey fellow warriors"

print(' '.join([word[::-1] if len(word) > 5 else word for word in str1.split()]))