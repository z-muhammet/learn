package com.example.jetpacknavigationex

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.navigation.Navigation

class profileFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_profile, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val homeBtn = getView()?.findViewById<Button>(R.id.prflHomeBtn)
        val searchBtn = getView()?.findViewById<Button>(R.id.prflSearchBtn)
        val profileBtn = getView()?.findViewById<Button>(R.id.prflProfileBtn)
        homeBtn!!.setOnClickListener {
            val homNavAct = profileFragmentDirections.actionProfileFragmentToMainFragment()
            Navigation.findNavController(it).navigate(homNavAct)
        }
        searchBtn!!.setOnClickListener {
            val srchNavAct = profileFragmentDirections.actionProfileFragmentToSearchFragment()
            Navigation.findNavController(it).navigate(srchNavAct)
        }
        profileBtn!!.setOnClickListener {
            Toast.makeText(context, "here", Toast.LENGTH_SHORT).show()
        }
    }
}