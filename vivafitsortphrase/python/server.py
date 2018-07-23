import hug, json

phrases = [ {'phrase':'Quando foi a última vez que você fez algo pela primeira vez?','author':	'Cesar Curti'},
{'phrase':'EAT clean. DRINK water. STAY active. BE healthy.', 'author':	'Unknow'},
{'phrase':'Nunca sacrifique essas três coisas: Sua família. Sua saúde. E sua dignidade.', 'author':	'Unknow'},
{'phrase':'Buda não era Budista. Cristo não era Cristão. Maomé não era mulçumano. Eles eram Mestres que ensinavam amor. Amor era sua religião.', 'author':	'Unknow'},
{'phrase':'Você atrai o que transmite.','author':	'Unknow'},
{'phrase':'A única coisa fixa é que tudo está em constante transforação. Aproveite o agora!', 'author': 'Thalita Froes'},
{'phrase':'Regra básica da vida: na volta a descida vira subida.', 'author':	'Unknow' },
{'phrase':'Não importa como, mas mexa-se.', 'author': 'Unknow'},
{'phrase':'Opte por aquilo que faz seu coração vibrar... Apesar de todas consequencias.', 'author': 'Osho'},
{'phrase':'O primeiro passo para se ter um bom dia: Dê bom dia a alguém!', 'author':	'Unknow'}]

@hug.get("/vivaphrases")
def get_data():
   return {"data": phrases}
