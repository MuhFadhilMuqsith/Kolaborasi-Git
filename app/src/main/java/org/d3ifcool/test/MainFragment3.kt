package org.d3ifcool.test


import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import kotlinx.android.synthetic.main.fragment_main_fragment3.*
import org.d3ifcool.test.databinding.FragmentMainFragment3Binding
import java.lang.Exception

/**
 * A simple [Fragment] subclass.
 */
class MainFragment3 : Fragment() {

    private lateinit var binding: FragmentMainFragment3Binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_main_fragment3,container,false)

        binding.btnShare.setOnClickListener { v:View ->
            val mIntent = Intent(Intent.ACTION_SEND)

            mIntent.data = Uri.parse("mailto:")
            mIntent.type = "text/plain"
            
            mIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("Lukmannurwahidin26@gmail.com"))
            mIntent.putExtra(Intent.EXTRA_SUBJECT,"Jawaban")
            mIntent.putExtra(Intent.EXTRA_TEXT,"I Love you")

            try {
                startActivity(Intent.createChooser(mIntent, "Choose Email client"))
            }catch (e: Exception){

            }
        }
        return binding.root
    }
}
