package com.example.myapplication


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.FrameLayout
import androidx.fragment.app.FragmentManager
import com.example.myapplication.databinding.ActivityMainBinding


class MainActivity4 : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var fragmentButton: Button
    private lateinit var fragmentManager: FragmentManager



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main4)

        fragmentManager = supportFragmentManager
        val frame2: FrameLayout = findViewById(R.id.frame2)
        val bt4 : Button = findViewById(R.id.fragmentButton)
        val bt10 : Button = findViewById(R.id.button10)
        val bt9 : Button = findViewById(R.id.button9)
        val frame1: FrameLayout = findViewById(R.id.frame1)




        if (dragon != null) {
            fragmentManager.beginTransaction().remove(dragon()).commit()
        }
        if (brewno != null) {
            fragmentManager.beginTransaction().remove(brewno()).commit()
        }
        if (bombezhka != null) {
            fragmentManager.beginTransaction().remove(bombezhka()).commit()
        }
        if (menuVoins != null) {
            fragmentManager.beginTransaction().remove(menuVoins()).commit()
        }
        if (menuZdaniya != null) {
            fragmentManager.beginTransaction().remove(menuZdaniya()).commit()
        }
        if (menuZaklinaniya != null) {
            fragmentManager.beginTransaction().remove(menuZaklinaniya()).commit()
        }
        if (adskaya != null) {
            fragmentManager.beginTransaction().remove(adskaya()).commit()
        }
        if (king!= null) {
            fragmentManager.beginTransaction().remove(king()).commit()
        }
        if (hogrider!= null) {
            fragmentManager.beginTransaction().remove(hogrider()).commit()
        }
        bt4.setOnClickListener {

                frame2.visibility = android.view.View.VISIBLE
                val fragment = menuVoins()
                val fragmentTransaction = fragmentManager.beginTransaction()
                fragmentTransaction.replace(R.id.frame2, fragment)
                fragmentTransaction.commit()



        }
        bt10.setOnClickListener {

                frame2.visibility = android.view.View.VISIBLE
                val fragment = menuZdaniya()
                val fragmentTransaction = fragmentManager.beginTransaction()
                fragmentTransaction.replace(R.id.frame2, fragment)
                fragmentTransaction.commit()



        }
        bt9.setOnClickListener {

                frame2.visibility = android.view.View.VISIBLE
                val fragment = menuZaklinaniya()
                val fragmentTransaction = fragmentManager.beginTransaction()
                fragmentTransaction.replace(R.id.frame2, fragment)
                fragmentTransaction.commit()



        }


    }

    fun im1(view: View) {

            val frame2: FrameLayout = findViewById(R.id.frame2)
            val bt4 : Button = findViewById(R.id.fragmentButton)
            val bt10 : Button = findViewById(R.id.button10)
            val bt9 : Button = findViewById(R.id.button9)
            frame2.visibility = android.view.View.GONE
            bt4.visibility = android.view.View.GONE
            bt9.visibility = android.view.View.GONE
            bt10.visibility = android.view.View.GONE
            val fragmentB = dragon()
            fragmentManager.beginTransaction()
                .replace(R.id.frame1, fragmentB)
                .addToBackStack(null)
                .commit()



    }
    fun im2(view: View) {

            val frame2: FrameLayout = findViewById(R.id.frame2)
            val bt4 : Button = findViewById(R.id.fragmentButton)
            val bt10 : Button = findViewById(R.id.button10)
            val bt9 : Button = findViewById(R.id.button9)
            frame2.visibility = android.view.View.GONE
            bt4.visibility = android.view.View.GONE
            bt9.visibility = android.view.View.GONE
            bt10.visibility = android.view.View.GONE
            frame2.visibility = android.view.View.GONE
            val fragmentB =brewno()
            fragmentManager.beginTransaction()
                .replace(R.id.frame1, fragmentB)
                .addToBackStack(null)
                .commit()



    }
    fun im4(view: View) {

            val frame2: FrameLayout = findViewById(R.id.frame2)
            val bt4 : Button = findViewById(R.id.fragmentButton)
            val bt10 : Button = findViewById(R.id.button10)
            val bt9 : Button = findViewById(R.id.button9)
            frame2.visibility = android.view.View.GONE
            bt4.visibility = android.view.View.GONE
            bt9.visibility = android.view.View.GONE
            bt10.visibility = android.view.View.GONE
            frame2.visibility = android.view.View.GONE
            val fragmentB =bombezhka()
            fragmentManager.beginTransaction()
                .replace(R.id.frame1, fragmentB)
                .addToBackStack(null)
                .commit()


    }
    fun im3(view: View) {

            val frame2: FrameLayout = findViewById(R.id.frame2)
            frame2.visibility = android.view.View.GONE
            val bt4 : Button = findViewById(R.id.fragmentButton)
            val bt10 : Button = findViewById(R.id.button10)
            val bt9 : Button = findViewById(R.id.button9)
            frame2.visibility = android.view.View.GONE
            bt4.visibility = android.view.View.GONE
            bt9.visibility = android.view.View.GONE
            bt10.visibility = android.view.View.GONE
            val fragmentB =megaking()
            fragmentManager.beginTransaction()
                .replace(R.id.frame1, fragmentB)
                .addToBackStack(null)
                .commit()



    }
    fun im5(view: View) {

            val frame2: FrameLayout = findViewById(R.id.frame2)
            val bt4 : Button = findViewById(R.id.fragmentButton)
            val bt10 : Button = findViewById(R.id.button10)
            val bt9 : Button = findViewById(R.id.button9)
            frame2.visibility = android.view.View.GONE
            bt4.visibility = android.view.View.GONE
            bt9.visibility = android.view.View.GONE
            bt10.visibility = android.view.View.GONE
            frame2.visibility = android.view.View.GONE
            val fragmentB =adskaya()
            fragmentManager.beginTransaction()
                .replace(R.id.frame1, fragmentB)
                .addToBackStack(null)
                .commit()

    }
    fun im6(view: View) {
            val frame2: FrameLayout = findViewById(R.id.frame2)
            val bt4 : Button = findViewById(R.id.fragmentButton)
            val bt10 : Button = findViewById(R.id.button10)
            val bt9 : Button = findViewById(R.id.button9)
            frame2.visibility = android.view.View.GONE
            bt4.visibility = android.view.View.GONE
            bt9.visibility = android.view.View.GONE
            bt10.visibility = android.view.View.GONE
            frame2.visibility = android.view.View.GONE
            val fragmentB =firebow()
            fragmentManager.beginTransaction()
                .replace(R.id.frame1, fragmentB)
                .addToBackStack(null)
                .commit()


    }
    fun im7(view: View) {
            val frame2: FrameLayout = findViewById(R.id.frame2)
            val bt4 : Button = findViewById(R.id.fragmentButton)
            val bt10 : Button = findViewById(R.id.button10)
            val bt9 : Button = findViewById(R.id.button9)
            frame2.visibility = android.view.View.GONE
            bt4.visibility = android.view.View.GONE
            bt9.visibility = android.view.View.GONE
            bt10.visibility = android.view.View.GONE
            frame2.visibility = android.view.View.GONE
            val fragmentB =king()
            fragmentManager.beginTransaction()
                .replace(R.id.frame1, fragmentB)
                .addToBackStack(null)
                .commit()
    }
    fun im8(view: View) {
        val frame2: FrameLayout = findViewById(R.id.frame2)
        val bt4 : Button = findViewById(R.id.fragmentButton)
        val bt10 : Button = findViewById(R.id.button10)
        val bt9 : Button = findViewById(R.id.button9)
        frame2.visibility = android.view.View.GONE
        bt4.visibility = android.view.View.GONE
        bt9.visibility = android.view.View.GONE
        bt10.visibility = android.view.View.GONE
        frame2.visibility = android.view.View.GONE
        val fragmentB =hogrider()
        fragmentManager.beginTransaction()
            .replace(R.id.frame1, fragmentB)
            .addToBackStack(null)
            .commit()
    }
    fun back1(view: View){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.remove(dragon())
        fragmentTransaction.commit()
    }

    fun btn5 (View: View) {
        //назад
        val intent = Intent(this@MainActivity4,
            MainActivity2::class.java)
        startActivity(intent)
    }
    fun backfrag1 (View: View) {
        val intent = Intent(this,MainActivity4::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK
        startActivity(intent)
        finish()
        val frame2: FrameLayout = findViewById(R.id.frame2)
        val frameLayout = findViewById<FrameLayout>(R.id.frame1)
        val bt4 : Button = findViewById(R.id.fragmentButton)
        val bt10 : Button = findViewById(R.id.button10)
        val bt9 : Button = findViewById(R.id.button9)
        frame2.visibility = android.view.View.GONE
        bt4.visibility = android.view.View.VISIBLE
        bt9.visibility = android.view.View.VISIBLE
        bt10.visibility = android.view.View.VISIBLE
        frameLayout.visibility = android.view.View.GONE

    }
}