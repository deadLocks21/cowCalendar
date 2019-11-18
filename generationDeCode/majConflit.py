for i in range(10):
    print("""if (chaleurPosterieur.size() > ((p-1)*10+%i)) {
    lignesConflit.add(chaleurPosterieur.get((p-1)*10+%i));
}""" % (i, i))
    print("""else {
    lignesConflit.add("");
}
""")
