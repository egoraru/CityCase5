package ru.egora.citycase

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun af1(view: View?) {
        val intent = Intent(this@MainActivity, AfActivity::class.java)
        startActivity(intent)
    }

    fun fo1(view: View?) {
        val intent = Intent(this@MainActivity, FoActivity::class.java)
        startActivity(intent)
    }

    fun is1(view: View?) {
        val intent = Intent(this@MainActivity, IsActivity::class.java)
        startActivity(intent)
    }

    fun ka1(view: View?) {
        val intent = Intent(this@MainActivity, KaActivity::class.java)
        startActivity(intent)
    }

    fun mu1(view: View?) {
        val intent = Intent(this@MainActivity, MuActivity::class.java)
        startActivity(intent)
    }

    fun ob1(view: View?) {
        val intent = Intent(this@MainActivity, ObActivity::class.java)
        startActivity(intent)
    }

    fun pe1(view: View?) {
        val intent = Intent(this@MainActivity, PeActivity::class.java)
        startActivity(intent)
    }

    fun pg1(view: View?) {
        val intent = Intent(this@MainActivity, PgActivity::class.java)
        startActivity(intent)
    }

    fun pi1(view: View?) {
        val intent = Intent(this@MainActivity, PiActivity::class.java)
        startActivity(intent)
    }

    fun po1(view: View?) {
        val intent = Intent(this@MainActivity, PoActivity::class.java)
        startActivity(intent)
    }

    fun ra1(view: View?) {
        val intent = Intent(this@MainActivity, RaActivity::class.java)
        startActivity(intent)
    }

    fun sl1(view: View?) {
        val intent = Intent(this@MainActivity, SlActivity::class.java)
        startActivity(intent)
    }

    fun to1(view: View?) {
        val intent = Intent(this@MainActivity, ToActivity::class.java)
        startActivity(intent)
    }

    fun us1(view: View?) {
        val intent = Intent(this@MainActivity, UsActivity::class.java)
        startActivity(intent)
    }

    fun vi1(view: View?) {
        val intent = Intent(this@MainActivity, ViActivity::class.java)
        startActivity(intent)
    }

}