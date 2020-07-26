package com.example.viewbinding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.viewbinding.databinding.Frgmt1Binding

class Frgmt1 : Fragment{

    var binding : Frgmt1Binding?    = null

    constructor():super()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = Frgmt1Binding.inflate(inflater,container,false)
        return binding?.root
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
    
}