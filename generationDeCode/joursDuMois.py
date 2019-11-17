number = 0

day = ("2","3","4","5","6","7","1")
combien = (1,2,3,4,5,6,7)

for e in range(7):
    print("""        if (pJourDuMois == %s)
            {"""%day[e])

    for i in range(28):
        if i < 9:
            print("""            uneCase = cases.get(%s);
            uneCase.set(0, "0%s");
            cases.set(%s, uneCase);"""%(str(i+combien[e]-1), str(i+1), str(i+combien[e]-1)))
        else:
            print("""            uneCase = cases.get(%s);
            uneCase.set(0, "%s");
            cases.set(%s, uneCase);""" % (str(i + combien[e]-1), str(i + 1), str(i + combien[e]-1)))
        number = i+combien[e]

    print("""            
                if (numberOfDaysInThisMonth > 28)
                {
                    uneCase = cases.get(%s);
                    uneCase.set(0, "29");
                    cases.set(%s, uneCase);
                }

                if (numberOfDaysInThisMonth > 29)
                {
                    uneCase = cases.get(%s);
                    uneCase.set(0, "30");
                    cases.set(%s, uneCase);
                }
                if (numberOfDaysInThisMonth > 30)
                {
                    uneCase = cases.get(%s);
                    uneCase.set(0, "31");
                    cases.set(%s, uneCase);
                }
            }


    """%(str(number), str(number), str(number+1), str(number+1), str(number+2), str(number+2)))

for i in range(42):
    print("""setText(calendrier_c%s, "");""" % str(i+1))
