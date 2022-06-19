package es.ipow.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import es.ipow.fragments.databinding.ActivityFragmentBinding

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
        setFragment(fragment3)

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
                R.anim.slide_in,
                R.anim.fade_out,
                R.anim.fade_in,
                R.anim.slide_out
            )
            .replace(R.id.fragmentContainerView,fragment)
            .commit()
    }
}