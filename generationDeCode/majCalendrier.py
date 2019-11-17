for i in range(42):
    print("""uneCase = cases.get(%i);
setText(calendrier_c%i, uneCase.get(0));
setBg(calendrier_c%i, uneCase.get(1));
uneCase.clear();""" % (i, i+1, i+1))
