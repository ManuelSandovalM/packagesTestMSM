package com.msm.mylibrarytest

import android.app.Activity
import android.widget.Toast

class SendGreetings(activity: Activity) {

    private var myActivity: Activity = activity

    fun sayHello(msg: String) : String {
        return "Hello $msg"
    }

    fun sayHelloToast(msg: String) {
        myActivity.runOnUiThread {
            Toast.makeText(myActivity, "Hello $msg", Toast.LENGTH_SHORT).show()
        }
    }

}