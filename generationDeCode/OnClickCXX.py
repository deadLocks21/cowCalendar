#for i in range(42):
#    print("""calendrier_c%i.setOnClickListener(new View.OnClickListener() {
#    @Override
#    public void onClick(View v) {
#        OnClickC%i();
#    }
#});""" % (i+1, i+1))

for i in range(42):
    print("""void OnClickC%i() {
    razEvt();
    mettreCalendrierAJour((String) calendrier_c%i.getText());
    caseSelectionnee("%i");

    List<EvtV> evts = new ArrayList<EvtV>();

    if (cOUg.equals("c")) {
        evts = dataManager.selectEvtChaleurJour(dateSQL.format(dateCalendrier.getTime()));
    }

    if (cOUg.equals("g")) {
        evts = dataManager.selectEvtGestationJour(dateSQL.format(dateCalendrier.getTime()));
    }

    if (evts.size() != 0) {
        for ( EvtV evt : evts ) {
            evtAjh.add(evt.getNomEvt());
        }

        numEvt = "1";
        nomEvt = evtAjh.get(0);

        majEvt();
    }
}""" % (i+1, i+1, i+1))
