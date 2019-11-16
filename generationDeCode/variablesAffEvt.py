for i in range(7):
    print("private LinearLayout calendrier_l%s = null;" % str(i+1))

for i in range(7):
    print("calendrier_l%s = (LinearLayout) findViewById(R.id.calendrier_l%s);" % (str(i+1), str(i+1)))

for i in range(7):
    print("setHW(calendrier_l%s, 720, 70);" % str(i+1))
    print("setMargins(calendrier_l%s, 0, 0, 0, 15);" % str(i+1))
