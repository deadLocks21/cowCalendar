for i in range(9):
    print("private LinearLayout conflit_l%s = null;" % str(i+1))
    print("private TextView conflit_evt%s = null;" % str(i + 1))
    print("private ImageView conflit_ok%s = null;" % str(i + 1))
    print("private ImageView conflit_croix%s = null;" % str(i + 1))
    print("private ImageView conflit_bin%s = null;" % str(i + 1))

for i in range(9):
    print("conflit_l%s = (LinearLayout) findViewById(R.id.conflit_l%s);" % (str(i+1), str(i+1)))
    print("conflit_evt%s = (TextView) findViewById(R.id.conflit_evt%s);" % (str(i + 1), str(i + 1)))
    print("conflit_ok%s = (ImageView) findViewById(R.id.conflit_ok%s);" % (str(i + 1), str(i + 1)))
    print("conflit_croix%s = (ImageView) findViewById(R.id.conflit_croix%s);" % (str(i + 1), str(i + 1)))
    print("conflit_bin%s = (ImageView) findViewById(R.id.conflit_bin%s);" % (str(i + 1), str(i + 1)))

for i in range(9):
    print("""setHW(conflit_l%s, 720, 65);
setMargins(conflit_l%s, 0, 0, 0, 40);
setHW(conflit_evt%s, ViewGroup.LayoutParams.WRAP_CONTENT, 65);
setMargins(conflit_evt%s, 0, 0, 10, 0);
setTextSize(conflit_evt%s, 20);
conflit_evt%s.setMaxWidth(440*width/720);
setHW(conflit_ok%s, 65, 65);
setMargins(conflit_ok%s, 10, 0, 10, 0);
setHW(conflit_croix%s, 65, 65);
setMargins(conflit_croix%s, 10, 0, 10, 0);
setHW(conflit_bin%s, 65, 65);
setMargins(conflit_bin%s, 10, 0, 0, 0);""" % (str(i+1), str(i+1), str(i+1), str(i+1), str(i+1), str(i+1), str(i+1), str(i+1), str(i+1), str(i+1), str(i+1), str(i+1)))
