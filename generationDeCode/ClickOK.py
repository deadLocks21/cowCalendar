for i in range(10):
    print("""if (i == %i) {
    dataManager.autoUpdateGestation(String.valueOf(conflit_evt%i.getText()));
    majConflit();
}""" % (i+1, i+1))
