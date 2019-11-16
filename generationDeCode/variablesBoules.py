for i in range(42):
    print("private ImageView calendrier_c%s = null;" % str(i+1))

for i in range(42):
    print("calendrier_c%s = (ImageView) findViewById(R.id.calendrier_c%s);" % (str(i+1), str(i+1)))

for i in range(42):
    print("setHW(calendrier_c%s, 70, 70);" % str(i+1))
    print("setMargins(calendrier_c%s, 8, 0, 8, 0);" % str(i+1))
