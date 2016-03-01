# EditTextWithPrefix
Adding Prefix In Edittext Android. You can add prefix easily without writing the lengthy code and also no need to handle the cases like do not copy, paste, select, delete etc to prefix.

-
![alt tag]( https://github.com/AndroidHitchhiking/EditTextWithPrefix/blob/master/Screenshots/outputgif.gif)

######Integrate in your application by doing the following steps (No Library required).
•	Copy the EditTextWithPrefix.java file in your package as it is.

•	Paste xml with your package name where you want to add Edittext.
```
<shadik.com.edittextwithprefix.EditTextWithPrefix
        android:id="@+id/etPrefix"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:gravity="bottom"
        android:tag="+61 "
        android:text=""
        android:textSize="24sp"/>
```

•	You can edit/update the prefix from your class.
```
EditTextWithPrefix etPrefix = (EditTextWithPrefix) findViewById(R.id.etPrefix);
etPrefix.setTag("+11 ");
```
