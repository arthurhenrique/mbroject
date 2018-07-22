import requests
from random import choices
ph = requests.get('http://localhost:8000/vivaphrases').json()
rnd_phrase = choices(ph['data'])[0]
print(rnd_phrase['phrase'], rnd_phrase['author'] )