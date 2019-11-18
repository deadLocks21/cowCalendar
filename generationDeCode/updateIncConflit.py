for i in range(10):
    print("""if (chaleurPosterieur.size() > ((numP-1)*10)+%i) {
    lignesConflit.set(%i, chaleurPosterieur.get(((numP-1)*10))+1+%i);
}""" % (i, i, i))
