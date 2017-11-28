package com.azharudhen.smack_kotlin.Controllers.Controller.Controller.Service

import android.app.VoiceInteractor
import android.content.Context
import android.util.Log
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.azharudhen.smack_kotlin.Controllers.Controller.Controller.Utilities.URL_REGISTER
import org.json.JSONObject

/**
 * Created by mac on 11/28/17.
 */
object AuthService {

    fun registerUser(context: Context, email: String, password: String, complete: (Boolean) -> Unit) {
        val url = URL_REGISTER

        val jsonBody = JSONObject()
        jsonBody.put("email", email)
        jsonBody.put("password", password)
        val requestBody = jsonBody.toString()

        val registerRequest = object : StringRequest(Request.Method.POST,url, Response.Listener { _ ->
            Log.d("Error", "Could not register the user")
            complete(true)
        },Response.ErrorListener { error ->
            complete(false)
        } ) {
            override fun getBodyContentType(): String {
                return "application/json; charset=utf-8"
            }

            override fun getBody(): ByteArray {
                return requestBody.toByteArray()
            }

        }
        Volley.newRequestQueue(context).add(registerRequest)

    }


}