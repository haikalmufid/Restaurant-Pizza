package lat.pam.utspam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class UserLocation : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_location)

        val userId = intent.getStringExtra("NAME")
        val storeLocation = intent.getStringExtra("LOCATION")

        val userIdTextView = findViewById<TextView>(R.id.user_id)
        val locationTextView = findViewById<TextView>(R.id.storeLocation)

        if (userIdTextView != null) {
            userIdTextView.text = "Hello, $userId"
        }

        if (locationTextView != null) {
            locationTextView.text = storeLocation
        }

        val btnSeeMenus = findViewById<Button>(R.id.btn_menu)
        btnSeeMenus?.setOnClickListener {
            val intent = Intent(this, Menu::class.java)
            intent.putExtra("USER_ID", userId)
            intent.putExtra("LOCATION", storeLocation)
            startActivity(intent)
        }
    }
}