package tn.esprit.gestionuser

import android.os.Bundle
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomsheet.BottomSheetDialog

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toggle = findViewById<RadioGroup>(R.id.toggle)
        val signUpRadioButton = findViewById<RadioButton>(R.id.signUpRadioButton)
        val signInRadioButton = findViewById<RadioButton>(R.id.signInRadioButton)

        // Navigation to SignUp
        signUpRadioButton.setOnClickListener {
            val view = layoutInflater.inflate(R.layout.signup, null)
            val dialog = BottomSheetDialog(this)
            dialog.setContentView(view)
            dialog.show()
        }

        // Navigation to SignIn
        signInRadioButton.setOnClickListener {
            val view = layoutInflater.inflate(R.layout.popup_login, null)
            val dialog = BottomSheetDialog(this)
            dialog.setContentView(view)
            dialog.show()
        }


    }
}
