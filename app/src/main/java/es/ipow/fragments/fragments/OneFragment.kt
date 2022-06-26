package es.ipow.fragments.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import es.ipow.fragments.R
import es.ipow.fragments.databinding.FragmentOneBinding
import es.ipow.fragments.databinding.FragmentTwoBinding

class OneFragment : Fragment() {
    private var _b : FragmentOneBinding? = null
    private val b get() = _b!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _b = FragmentOneBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return b.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        b.btnFragmentOne.setOnClickListener {
            val tf = TwoFragment()
            parentFragmentManager.beginTransaction().
            setCustomAnimations(
                R.anim.slide_in, // enter
                R.anim.fade_out, // exit
                R.anim.fade_in,  // popEnter
                R.anim.slide_out // popExit
            ).
            replace(R.id.frmntContainerPass, tf).
            addToBackStack(null).
            commit()
        }
    }
}