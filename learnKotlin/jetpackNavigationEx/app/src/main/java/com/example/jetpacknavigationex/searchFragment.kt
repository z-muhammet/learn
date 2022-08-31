package com.example.jetpacknavigationex

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.navigation.Navigation


class searchFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_search, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val homeBtn = getView()?.findViewById<Button>(R.id.srchHomeBtn)
        val searchBtn = getView()?.findViewById<Button>(R.id.srchSearchBtn)
        val profileBtn = getView()?.findViewById<Button>(R.id.srchProfileBtn)
        homeBtn!!.setOnClickListener {
            val homNavAct = searchFragmentDirections.actionSearchFragmentToMainFragment()
            Navigation.findNavController(it).navigate(homNavAct)
        }
        searchBtn!!.setOnClickListener {
            Toast.makeText(context, "here", Toast.LENGTH_SHORT).show()
        }
        profileBtn!!.setOnClickListener {
            val prflNavAct = searchFragmentDirections.actionSearchFragmentToProfileFragment()
            Navigation.findNavController(it).navigate(prflNavAct)
        }
    }
}