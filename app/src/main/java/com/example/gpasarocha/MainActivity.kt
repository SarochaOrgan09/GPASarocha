package com.example.gpasarocha

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Context
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ok.setOnClickListener{
            var sub1 = sub1.text.toString()
            var cre1 = ce1.text.toString()
            var poi1 = p1.text.toString()

            var sub2 = sub2.text.toString()
            var cre2 = ce2.text.toString()
            var poi2 = p2.text.toString()

            var sub3 = sub3.text.toString()
            var cre3 = ce3.text.toString()
            var poi3 = p3.text.toString()

            var sub4 = sub4.text.toString()
            var cre4 = ce4.text.toString()
            var poi4 = p4.text.toString()

            var sub5 = sub5.text.toString()
            var cre5 = ce5.text.toString()
            var poi5 = p5.text.toString()

            if (sub1 == "" || cre1 == ""|| poi1 == ""|| sub2 == "" || cre2 == ""|| poi2 == ""|| sub3 == "" || cre3 == ""|| poi3 == ""
                || sub4 == "" || cre4 == ""|| poi4 == ""|| sub5 == "" || cre5 == ""|| poi5 == "") {
                toast {
                    "Please Input All Text Box Before Press OK !!!"
                }
            } else if (cre1.toInt() > 3 || cre2.toInt() > 3 || cre3.toInt() > 3 || cre4.toInt() >3 || cre5.toInt() > 3){
                toast {
                    "Please Input Credit < 3 !!!"
                }
            } else{
                var sumcredit = cre1.toInt() + cre2.toInt() + cre3.toInt() + cre4.toInt() + cre5.toInt()
                total1.setText("$sumcredit")
                var cxd1 = cre1.toDouble() * poi1.toDouble()
                var cxd2 = cre2.toDouble() * poi2.toDouble()
                var cxd3 = cre3.toDouble() * poi3.toDouble()
                var cxd4 = cre4.toDouble() * poi4.toDouble()
                var cxd5 = cre5.toDouble() * poi5.toDouble()
                var sumcxd = cxd1 + cxd2 + cxd3 + cxd4 + cxd5
                var grade = sumcxd / sumcredit
                val dou = "%.2f".format(grade)
                gpa1.setText("$dou")

            }
        }

        clear.setOnClickListener{
            ce1.setText("")
            p1.setText("")
            sub1.setText("")
            ce2.setText("")
            p2.setText("")
            sub2.setText("")
            ce3.setText("")
            p3.setText("")
            sub3.setText("")
            ce4.setText("")
            p4.setText("")
            sub4.setText("")
            ce5.setText("")
            p5.setText("")
            sub5.setText("")
            total1.setText("")
            gpa1.setText("")
        }
    }
}
inline fun Context.toast(message:()->String){
    Toast.makeText(this, message() , Toast.LENGTH_LONG).show()
}