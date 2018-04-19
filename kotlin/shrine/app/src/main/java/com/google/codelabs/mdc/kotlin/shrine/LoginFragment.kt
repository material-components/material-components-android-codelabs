package com.google.codelabs.mdc.kotlin.shrine

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Fragment representing the login screen for Shrine.
 */
class LoginFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment

        // Snippet from "Navigate to the next Fragment" section goes here.

        return inflater.inflate(R.layout.shr_login_fragment, container, false)
    }

    // "isPasswordValid" from "Navigate to the next Fragment" section method goes here
}
