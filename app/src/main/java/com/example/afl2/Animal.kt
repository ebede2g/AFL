package com.example.afl2

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Animal(val image:Int,val descr:String) : Parcelable
