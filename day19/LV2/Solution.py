import re

def songDecoder(song):
    wub_compiler = re.compile('WUB')
    return ' '.join(re.sub(wub_compiler,' ',song).split())