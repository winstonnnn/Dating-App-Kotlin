package com.winston.memeetandeat

import android.graphics.Paint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class LoginActivity : AppCompatActivity() {

    var btnLoginFacebook    : Button?   = null
    var btnLoginNumber      : TextView? = null
    var txtTermsService     : TextView? = null
    var txtPrivacyPolicy    : TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        initViews()
    }

    private fun initViews(){
        btnLoginFacebook    = findViewById(R.id.btn_login_facebook)
        btnLoginNumber      = findViewById(R.id.btn_login_number)
        txtTermsService     = findViewById(R.id.txt_terms_service)
        txtPrivacyPolicy    = findViewById(R.id.txt_privacy_policy)

        txtTermsService?.paintFlags     = Paint.UNDERLINE_TEXT_FLAG
        txtPrivacyPolicy?.paintFlags    = Paint.UNDERLINE_TEXT_FLAG
    }
}
