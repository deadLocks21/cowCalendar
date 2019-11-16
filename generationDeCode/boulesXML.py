# for i in range(7):
#     print("""<ImageView
#     android:id="@+id/calendrier_c%s"
#     android:layout_width="70px"
#     android:layout_height="70px"
#     android:background="@drawable/calendrier_boule_av_evt">""" % ("%"+"s"))
c = 1

for i in range(6):
    print("""<LinearLayout
    android:id="@+id/calendrier_l%s"
    android:layout_width="720px"
    android:layout_height="70px"
    android:orientation="horizontal"
    android:gravity="center">
    """ % ( str(i+1)) )

    for e in range(7):
        print("""   <ImageView
        android:id="@+id/calendrier_c%s"
        android:layout_width="70px"
        android:layout_height="70px"
        android:background="@drawable/calendrier_boule_av_evt" />""" % ( str(c) ))
        c += 1

    print("""</LinearLayout>
    
""")
