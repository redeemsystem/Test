<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    tools:context=".MainActivity">

    <TextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="EMAIL ID"
        android:gravity="left"
        android:textColorHint="#000"
        android:textSize="15dp"
        android:layout_marginTop="40dp"
        android:layout_marginLeft="20dp"
        android:id="@+id/email"/>

    <TextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text=""
        android:gravity="left"
        android:textColor="#000"
        android:textSize="20dp"
        android:layout_marginTop="20dp"
        android:layout_marginLeft="20dp"
        android:id="@+id/useremail"/>

    <TextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="PHONE NUMBER"
        android:gravity="left"
        android:textColorHint="#000"
        android:textSize="15dp"
        android:layout_marginTop="40dp"
        android:layout_marginLeft="20dp"
        android:id="@+id/phonenum"/>

    <TextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text=""
        android:gravity="left"
        android:textColor="#000"
        android:textSize="20dp"
        android:layout_marginTop="20dp"
        android:layout_marginLeft="20dp"
        android:id="@+id/userphone"/>

    <EditText
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="Old Password"
        android:id="@+id/oldpwd"
        android:imeOptions="actionNext"
        android:maxLines="1"
        android:inputType="text"
        android:layout_gravity="center"
        android:layout_marginTop="10dp"
        android:layout_marginLeft="20dp"
        android:layout_marginRight="20dp"/>


    <EditText
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="New Password"
        android:id="@+id/newpwd"
        android:imeOptions="actionNext"
        android:maxLines="1"
        android:inputType="text"
        android:layout_gravity="center"
        android:layout_marginTop="10dp"
        android:layout_marginLeft="20dp"
        android:layout_marginRight="20dp"/>

    <EditText
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="Confirm Password"
        android:id="@+id/confrmpwd"
        android:imeOptions="actionNext"
        android:maxLines="1"
        android:inputType="text"
        android:layout_gravity="center"
        android:layout_marginTop="10dp"
        android:layout_marginLeft="20dp"
        android:layout_marginRight="20dp"/>

    <Button
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:id="@+id/save"
        android:textAllCaps="false"
        android:background="@drawable/button"
        android:textColor="#fff"
        android:layout_marginLeft="50dp"
        android:layout_marginRight="50dp"
        android:layout_marginTop="50dp"
        android:layout_marginBottom="20dp"
        android:text="Save"
        android:textSize="20sp"/>

</LinearLayout>
