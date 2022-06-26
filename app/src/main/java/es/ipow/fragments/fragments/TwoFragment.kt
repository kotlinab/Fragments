package es.ipow.fragments.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import es.ipow.fragments.R
import es.ipow.fragments.databinding.FragmentTwoBinding

class TwoFragment : Fragment() {
    private var _b : FragmentTwoBinding? = null
    private val b get() = _b!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _b = FragmentTwoBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return b.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        b.btnFragmentTwo.setOnClickListener {
            val of = OneFragment()
            parentFragmentManager.beginTransaction().
            setCustomAnimations(
                R.anim.slide_in, // enter
                R.anim.fade_out, // exit
                R.anim.fade_in,  // popEnter
                R.anim.slide_out // popExit
            ).
            replace(R.id.frmntContainerPass, of).
            addToBackStack(null).
            commit()
            // Equivale a onBackPressed() en Activity
            // parentFragmentManager.popBackStack()
        }
    }
}