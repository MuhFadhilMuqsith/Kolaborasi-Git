package org.d3ifcool.test


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import org.d3ifcool.test.databinding.FragmentMainFragment2Binding

/**
 * A simple [Fragment] subclass.
 */
class MainFragment2 : Fragment() {

    private lateinit var binding: FragmentMainFragment2Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_main_fragment2,container,false)

        return binding.root
    }


}
