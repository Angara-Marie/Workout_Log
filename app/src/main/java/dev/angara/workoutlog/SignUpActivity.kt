package dev.angara.workoutlog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class SignUpActivity : AppCompatActivity() {
    lateinit var  btnSignUp:Button
    lateinit var tilFistName:TextInputLayout
    lateinit var tilSecondName: TextInputLayout
    lateinit var tilEmail2:TextInputLayout
    lateinit var tilPassword2:TextInputLayout
    lateinit var tilConfirm:TextInputLayout
    lateinit var etFirstName:TextInputEditText
    lateinit var etSecondName:TextInputEditText
    lateinit var etEmail2:TextInputEditText
    lateinit var etPassword2:TextInputEditText
    lateinit var etConfirm:TextInputEditText
    lateinit var tvLogin: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        btnSignUp = findViewById(R.id.btnSignUp)
        tilFistName = findViewById(R.id.tilFirstName)
        tilSecondName = findViewById(R.id.tilSecondName)
        tilEmail2 = findViewById(R.id.tilEmail2)
        tilPassword2 = findViewById(R.id.tilPassword2)
        tilConfirm = findViewById(R.id.tilConfirm)
        etFirstName = findViewById(R.id.etFirstName)
        etSecondName = findViewById(R.id.etSecondName)
        etEmail2 = findViewById(R.id.etEmail2)
        etPassword2 = findViewById(R.id.etPassword2)
        etConfirm = findViewById(R.id.etConfirm)
        tvLogin = findViewById(R.id.tvLogin)


        btnSignUp.setOnClickListener {
            validateSignUp()
        }
        tvLogin.setOnClickListener {
            val intent = Intent(this,LoginActivity::class.java)
            startActivity(intent)
        }

    }
    fun validateSignUp(){
        var firstName = etFirstName.text.toString()
        var secondName = etSecondName.text.toString()
        var email = etEmail2.text.toString()
        var password = etPassword2.text.toString()
        var confirmPassword = etConfirm.text.toString()

        if (firstName.isBlank()){
            tilFistName.error = "First name required"
        }
        if (secondName.isBlank()){
            tilSecondName.error = "Second name required"
        }
        if (email.isBlank()){
            tilEmail2.error = "Email required"
        }
        if (password.isBlank()){
            tilPassword2.error = "Password is required"
        }
        if (confirmPassword.isBlank()){
            tilConfirm.error = "Confirm Password"
        }
    }

}