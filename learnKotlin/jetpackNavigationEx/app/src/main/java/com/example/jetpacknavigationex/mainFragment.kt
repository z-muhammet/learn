package com.example.jetpacknavigationex

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.navigation.Navigation

class mainFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            super.onViewCreated(view, savedInstanceState)
            val homeBtn = view.findViewById<Button>(R.id.mainHomeBtn)
            val searchBtn = view.findViewById<Button>(R.id.mainSearchBtn)
            val profileBtn = view.findViewById<Button>(R.id.mainProfileBtn)
            homeBtn!!.setOnClickListener {
                Toast.makeText(context, "here", Toast.LENGTH_SHORT).show()
            }

            searchBtn!!.setOnClickListener {
                val srchNavAct = mainFragmentDirections.actionMainFragmentToSearchFragment()
                Navigation.findNavController(it).navigate(srchNavAct)
            }

            profileBtn!!.setOnClickListener {
                val prflNavAct = mainFragmentDirections.actionMainFragmentToProfileFragment()
                Navigation.findNavController(it).navigate(prflNavAct)
            }
        }
    }
