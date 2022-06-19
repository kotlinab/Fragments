package es.ipow.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
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

        b.btnFrg3.setOnClickListener { setFragment(fragment3) }
        b.btnFrg4.setOnClickListener { setFragment(fragment4) }
        b.btnFrg5.setOnClickListener { setFragment(fragment5) }
    }
    fun setFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragmentContainerView,fragment)
            //Añade añade el fragmento a la pila de actividad
            addToBackStack(null)
            commit()
        }
    }
}