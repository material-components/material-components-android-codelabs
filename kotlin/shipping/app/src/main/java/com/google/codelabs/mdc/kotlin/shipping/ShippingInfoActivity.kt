package com.google.codelabs.mdc.kotlin.shipping

import android.os.Bundle
import android.support.design.widget.TextInputLayout
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.shipping_info_activity.*

class ShippingInfoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.shipping_info_activity)

        val rootView = findViewById<View>(android.R.id.content)

        val textInputLayouts = Utils.findViewsWithType(
                rootView, TextInputLayout::class.java)

        save_button.setOnClickListener {
            var noErrors = true
            for (textInputLayout in textInputLayouts) {
                val editTextString = textInputLayout.editText!!.text.toString()
                if (editTextString.isEmpty()) {
                    textInputLayout.error = resources.getString(R.string.error_string)
                    noErrors = false
                } else {
                    textInputLayout.error = null
                }
            }

            if (noErrors) {
                // All fields are valid!
            }
        }
    }
}
