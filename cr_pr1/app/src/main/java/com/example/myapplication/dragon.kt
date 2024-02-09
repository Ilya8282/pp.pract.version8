package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.FragmentManager
import com.example.myapplication.databinding.ActivityMainBinding
import androidx.fragment.app.FragmentTransaction



class dragon : Fragment() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var fragmentButton: Button
    private lateinit var fragmentManager: FragmentManager
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {



        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dragon, container, false)

    }


    companion object {

        fun newInstance() = dragon()
    }
}