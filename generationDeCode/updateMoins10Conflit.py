for i in range(10):
    print("""if (chaleurPosterieur.size() > %i) {
    if (!chaleurPosterieur.get(%i).equals("")) {
        lignesConflit.set(%i, chaleurPosterieur.get(%i));
    }
    else {
        lignesConflit.set(%i, "");
    }
}""" % (i, i, i, i, i))
