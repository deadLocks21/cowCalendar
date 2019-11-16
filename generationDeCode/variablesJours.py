j = ("lundi", "mardi", "mercredi", "jeudi", "vendredi", "samedi", "dimanche")

for i in range(7):
    print("private ImageView calendrier_%s = null;" % j[i])

for i in range(7):
    print("calendrier_%s = (ImageView) findViewById(R.id.calendrier_%s);" % (j[i], j[i]))

for i in range(7):
    print("setHW(calendrier_%s, 70, 75);" % j[i])
