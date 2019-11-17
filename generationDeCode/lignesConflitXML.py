for i in range(9):
    print("""<!--Ligne %s-->
<LinearLayout
    android:id="@+id/conflit_l%s"
    android:layout_width="720px"
    android:layout_height="65px"
    android:gravity="center"
    android:orientation="horizontal"
    android:layout_marginBottom="20px">

    <TextView
        android:id="@+id/conflit_evt%s"
        android:layout_width="wrap_content"
        android:layout_height="65px"
        android:maxWidth="450px"
        android:text="aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
        android:maxLines="1"
        android:singleLine="true"
        android:gravity="center" />

    <ImageView
        android:id="@+id/conflit_ok%s"
        android:layout_width="65px"
        android:layout_height="65px"
        android:background="@drawable/conflit_ok"/>

    <ImageView
        android:id="@+id/conflit_croix%s"
        android:layout_width="65px"
        android:layout_height="65px"
        android:background="@drawable/conflit_croix" />

    <ImageView
        android:id="@+id/conflit_bin%s"
        android:layout_width="65px"
        android:layout_height="65px"
        android:background="@drawable/conflit_corbeille" />

</LinearLayout>

""" % (str(i+1), str(i+1), str(i+1), str(i+1), str(i+1), str(i+1)))
