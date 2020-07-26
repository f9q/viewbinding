package com.example.viewbinding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.viewbinding.databinding.FragmentMainBinding

class MainFrgmt () : Fragment(){
    var binding : FragmentMainBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v = inflater.inflate(R.layout.fragment_main,container,false)
        binding = FragmentMainBinding.bind(v)
        binding?.btnFrgmt1?.setOnClickListener(::onFrgmt1Clicked)
        binding?.btnFrgmt2?.setOnClickListener(::onFrgmt2Clicked)
        binding?.btnIgnore?.setOnClickListener(::onIgnoreClicked)
        return v
    }
    fun onFrgmt1Clicked(v : View){
        val ft = requireFragmentManager().beginTransaction()
        ft.add(R.id.root,Frgmt1(),"Frgmt1Tag").addToBackStack("Frgmt1").commit()
    }
    fun onFrgmt2Clicked(v : View){
        val ft = requireFragmentManager().beginTransaction()
        ft.add(R.id.root,Frgmt2(),"Frgmt2Tag").addToBackStack("Frgmt2").commit()
    }
    fun onIgnoreClicked(v: View){
        val ft = requireFragmentManager().beginTransaction()
        ft.add(R.id.root,IgnoreFrgmt(),"IgnoreTag").addToBackStack("IgnoreFrgmt").commit()
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}