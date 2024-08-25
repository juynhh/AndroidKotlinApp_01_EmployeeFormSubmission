package com.juynhh.android.myfirstkotlin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText
import com.juynhh.android.myfirstkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonPreview.setOnClickListener{
            onPreviewClicked()
        }
        /* findViewById method
        setContentView(R.layout.activity_main)
        val previewButton : Button = findViewById(R.id.button_preview)
        previewButton.setOnClickListener {
            onPreviewClicked()
        }*/
    }

    private fun onPreviewClicked() {
//        val contactNameEditText : TextInputEditText = findViewById(R.id.edit_text_contact_name)
//        val contactNumberEditText : TextInputEditText = findViewById(R.id.edit_text_contact_number)
//        val testString = contactNameEditText.text.toString() + ", " + contactNumberEditText.text.toString()
        //hello just test git meow moew meowww
        val contactName = binding.editTextContactName.text.toString()
        val contactNumber = binding.editTextContactNumber.text.toString()
        val myDisplayName = binding.editTextMyDisplayName.text.toString()
        val includeJunior = binding.checkBoxJunior.isChecked
        val jobTitle = binding.spinnerJobTitle.selectedItem?.toString()
        val immediateStart = binding.checkBoxImmediateStart.isChecked
        val startDate = binding.editTextStartDate.text.toString()
        val testString = "Contact Name: $contactName, Contact Number: $contactNumber, My Display Name: $myDisplayName, " +
                "Include Junior : $includeJunior, Job Title: $jobTitle"
//        Toast.makeText(this, testString, Toast.LENGTH_LONG).show()
        val previewActivityIntent = Intent(this, PreviewActivity::class.java)
        previewActivityIntent.putExtra("Content msg", testString)
        startActivity(previewActivityIntent)
    }
}