package com.example.mybunnytamagotchiapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity2 : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        // Initialize the hunger, cleanliness, and happiness variables
        var hunger = 7
        var cleanliness = 5
        var happiness = 6

        // Find the TextViews and ImageView in the layout
        val hungerTextView = findViewById<EditText>(R.id.editTextNumber)
        val cleanlinessTextView = findViewById<EditText>(R.id.editTextNumber2)
        val happinessTextView = findViewById<EditText>(R.id.editTextNumber3)
        val imageView = findViewById<ImageView>(R.id.imageView2)

        // Find the buttons in the layout
        val feedButton = findViewById<Button>(R.id.button2)
        val cleanButton = findViewById<Button>(R.id.button3)
        val playButton = findViewById<Button>(R.id.button4)


        imageView.setImageResource(R.drawable.welcome_bunny_removebg_preview) // replace with the ID of your idle image

        // Set up the feed button click listener
        feedButton.setOnClickListener {
            if (hunger < 10) {
                hunger++
                cleanliness--
                happiness--


                // Update the image
                imageView.setImageResource(R.drawable.rabbit_eating_carrot_removebg_preview) // replace with the ID of your feed image

                // Check if the hunger level reached 0
                if (hunger == 0) {
                    Toast.makeText(this, "Your bunny is starving!", Toast.LENGTH_SHORT).show()


                    // Check if the pet is full
                if (hunger == 10) {
                    Toast.makeText(this, "Your bunny is full!", Toast.LENGTH_SHORT).show()
                    feedButton.isEnabled = false
                }
            } else {
                Toast.makeText(this, "Your bunny is already full!", Toast.LENGTH_SHORT).show()
            }
        }

        // Set up the clean button click listener
        cleanButton.setOnClickListener {
            if (cleanliness < 10) {
                cleanliness++


                // Update the image
                imageView.setImageResource(R.drawable.cartoon_baby_rabbit_in_the_bathroom_vector_44749952_removebg_preview) // replace with the ID of your clean image


                // Check if the cleanliness reached 0
                if (cleanliness <= 0) {
                    Toast.makeText(this, "Your bunny is dirty!", Toast.LENGTH_SHORT).show()

                    // Check if the pet is clean
                    if (cleanliness >= 10) {
                        Toast.makeText(this, "Your bunny is clean!", Toast.LENGTH_SHORT).show()
                        cleanButton.isEnabled = false
                    }
                } else {
                    Toast.makeText(this, "Your bunny is already clean!", Toast.LENGTH_SHORT).show()
                }
            }

            // Set up the play button click listener
            playButton.setOnClickListener {
                if (happiness < 10) {
                    happiness++


                    // Update the image
                    imageView.setImageResource(R.drawable.__bunnys_happy_removebg_preview) // replace with the ID of your play image

                    // Check if the happiness reached 0
                    if (happiness == 0) {
                        Toast.makeText(
                            this,
                            "Your bunny is unhappy let your bunny go play!",
                            Toast.LENGTH_SHORT
                        ).show()


                        // Check if the pet is happy
                        if (happiness == 10) {
                            Toast.makeText(this, "Your bunny is happy!", Toast.LENGTH_SHORT).show()
                            playButton.isEnabled = false
                        }
                    } else {
                        Toast.makeText(this, "Your bunny is already happy!", Toast.LENGTH_SHORT)
                            .show()
                    }
                }
            }}}}}
