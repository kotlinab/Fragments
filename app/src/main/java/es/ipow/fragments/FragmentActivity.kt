package es.ipow.fragments

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import es.ipow.fragments.databinding.ActivityFragmentBinding
import es.ipow.fragments.fragments.DialogFragment
import es.ipow.fragments.fragments.FithFragment
import es.ipow.fragments.fragments.FourthFragment
import es.ipow.fragments.fragments.ThirdFragment

class FragmentActivity : AppCompatActivity() {
    private lateinit var b:ActivityFragmentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityFragmentBinding.inflate(layoutInflater)
        setContentView(b.root)

        val fragment3 = ThirdFragment()
        val fragment4 = FourthFragment()
        val fragment5 = FithFragment()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragmentContainerView,fragment3)
            //Añade añade el fragmento a la pila de actividad
            addToBackStack(null)
            commit()
        }
        // setFragment(fragment3)

        b.btnFrg3.setOnClickListener { setFragmentAnim(fragment3) }
        b.btnFrg4.setOnClickListener { setFragmentAnim(fragment4) }
        b.btnFrg5.setOnClickListener { setFragmentAnim(fragment5) }
    }
    fun setFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragmentContainerView,fragment)
            //Añade añade el fragmento a la pila de actividad
            addToBackStack(null)
            commit()
        }
    }

    fun setFragmentAnim(fragment: Fragment){
        supportFragmentManager
            .beginTransaction()
            .addToBackStack(null)
            .setCustomAnimations(
                R.anim.slide_in, // enter
                R.anim.fade_out, // exit
                R.anim.fade_in,  // popEnter
                R.anim.slide_out // popExit
            )
            .replace(R.id.fragmentContainerView,fragment)
            .commit()
    }

    fun onClickDialog(view: View){
        DialogFragment().show(supportFragmentManager, DialogFragment.TAG)
    }
    fun clickNext(view: View){
        val intent = Intent(this, PassActivity::class.java)
        startActivity(intent)
    }
}