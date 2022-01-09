package com.yongjincompany.eathub

import android.app.AlertDialog
import android.content.Intent
import android.graphics.Bitmap
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.core.content.FileProvider
import java.io.File
import java.io.FileOutputStream
import java.io.IOException

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_Eathub)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var sharebutton = findViewById<Button>(R.id.share)

        val spinner1 = findViewById<Spinner>(R.id.spinner1)
        val spinner2 = findViewById<Spinner>(R.id.spinner2)
        val spinner3 = findViewById<Spinner>(R.id.spinner3)
        val spinner4 = findViewById<Spinner>(R.id.spinner4)

        var text = findViewById<TextView>(R.id.result1)
        var text2 = findViewById<TextView>(R.id.result2)
        var text3 = findViewById<TextView>(R.id.result3)
        var text4 = findViewById<TextView>(R.id.result4)

        spinner1.adapter = ArrayAdapter.createFromResource(
            this,
            R.array.gucksunamu,
            android.R.layout.simple_dropdown_item_1line
        )
        spinner2.adapter = ArrayAdapter.createFromResource(
            this,
            R.array.junghwan,
            android.R.layout.simple_dropdown_item_1line
        )
        spinner3.adapter = ArrayAdapter.createFromResource(
            this,
            R.array.lotteria,
            android.R.layout.simple_dropdown_item_1line
        )
        spinner4.adapter = ArrayAdapter.createFromResource(
            this,
            R.array.sidemenu,
            android.R.layout.simple_dropdown_item_1line
        )

        sharebutton.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                sharebutton.visibility = View.INVISIBLE
                ScreenShot()
                sharebutton.visibility = View.VISIBLE
            }
        })

        spinner1.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                when (position) {
                    //선택안함
                    0 -> {
                        text.setText("선택사항 없음")
                    }
                    1 -> {
                        text.setText(spinner1.selectedItem.toString())
                    }
                    2 -> {
                        text.setText(spinner1.selectedItem.toString())
                    }
                    3 -> {
                        text.setText(spinner1.selectedItem.toString())
                    }
                    4 -> {
                        text.setText(spinner1.selectedItem.toString())
                    }
                    5 -> {
                        text.setText(spinner1.selectedItem.toString())
                    }
                    6 -> {
                        text.setText(spinner1.selectedItem.toString())
                    }
                    7 -> {
                        text.setText(spinner1.selectedItem.toString())
                    }
                    8 -> {
                        text.setText(spinner1.selectedItem.toString())
                    }
                    9 -> {
                        text.setText(spinner1.selectedItem.toString())
                    }
                    10 -> {
                        text.setText(spinner1.selectedItem.toString())
                    }
                    11 -> {
                        text.setText(spinner1.selectedItem.toString())
                    }
                    12 -> {
                        text.setText(spinner1.selectedItem.toString())
                    }
                    13 -> {
                        text.setText(spinner1.selectedItem.toString())
                    }
                    14 -> {
                        text.setText(spinner1.selectedItem.toString())
                    }
                    15 -> {
                        text.setText(spinner1.selectedItem.toString())
                    }
                    16 -> {
                        text.setText(spinner1.selectedItem.toString())
                    }
                    17 -> {
                        text.setText(spinner1.selectedItem.toString())
                    }
                    18 -> {
                        text.setText(spinner1.selectedItem.toString())
                    }
                    19 -> {
                        text.setText(spinner1.selectedItem.toString())
                    }
                    20 -> {
                        text.setText(spinner1.selectedItem.toString())
                    }
                    21 -> {
                        text.setText(spinner1.selectedItem.toString())
                    }
                    22 -> {
                        text.setText(spinner1.selectedItem.toString())
                    }
                    23 -> {
                        text.setText(spinner1.selectedItem.toString())
                    }
                    24 -> {
                        text.setText(spinner1.selectedItem.toString())
                    }
                    25 -> {
                        text.setText(spinner1.selectedItem.toString())
                    }
                    26 -> {
                        text.setText(spinner1.selectedItem.toString())
                    }
                    27 -> {
                        text.setText(spinner1.selectedItem.toString())
                    }
                    28 -> {
                        text.setText(spinner1.selectedItem.toString())
                    }
                    29 -> {
                        text.setText(spinner1.selectedItem.toString())
                    }
                    30 -> {
                        text.setText(spinner1.selectedItem.toString())
                    }
                    31 -> {
                        text.setText(spinner1.selectedItem.toString())
                    }
                    32 -> {
                        text.setText(spinner1.selectedItem.toString())
                    }
                    33 -> {
                        text.setText(spinner1.selectedItem.toString())
                    }
                    34 -> {
                        text.setText(spinner1.selectedItem.toString())
                    }
                    35 -> {
                        text.setText(spinner1.selectedItem.toString())
                    }
                    36 -> {
                        text.setText(spinner1.selectedItem.toString())
                    }
                    37 -> {
                        text.setText(spinner1.selectedItem.toString())
                    }
                    38 -> {
                        text.setText(spinner1.selectedItem.toString())
                    }
                    39 -> {
                        text.setText(spinner1.selectedItem.toString())
                    }
                    40 -> {
                        text.setText(spinner1.selectedItem.toString())
                    }
                    41 -> {
                        text.setText(spinner1.selectedItem.toString())
                    }
                    42 -> {
                        text.setText(spinner1.selectedItem.toString())
                    }
                    43 -> {
                        text.setText(spinner1.selectedItem.toString())
                    }
                    44 -> {
                        text.setText(spinner1.selectedItem.toString())
                    }
                    45 -> {
                        text.setText(spinner1.selectedItem.toString())
                    }
                    //일치하는게 없는 경우
                    else -> {
                        text.setText("메뉴")
                    }
                }
            }
        }

        spinner2.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                when (position) {
                    //선택안함
                    0 -> {
                        text2.setText("선택사항 없음")
                    }
                    1 -> {
                        text2.setText(spinner2.selectedItem.toString())
                    }
                    2 -> {
                        text2.setText(spinner2.selectedItem.toString())
                    }
                    3 -> {
                        text2.setText(spinner2.selectedItem.toString())
                    }
                    4 -> {
                        text2.setText(spinner2.selectedItem.toString())
                    }
                    5 -> {
                        text2.setText(spinner2.selectedItem.toString())
                    }
                    6 -> {
                        text2.setText(spinner2.selectedItem.toString())
                    }
                    7 -> {
                        text2.setText(spinner2.selectedItem.toString())
                    }
                    8 -> {
                        text2.setText(spinner2.selectedItem.toString())
                    }
                    9 -> {
                        text2.setText(spinner2.selectedItem.toString())
                    }
                    10 -> {
                        text2.setText(spinner2.selectedItem.toString())
                    }
                    11 -> {
                        text2.setText(spinner2.selectedItem.toString())
                    }
                    12 -> {
                        text2.setText(spinner2.selectedItem.toString())
                    }
                    13 -> {
                        text2.setText(spinner2.selectedItem.toString())
                    }
                    14 -> {
                        text2.setText(spinner2.selectedItem.toString())
                    }
                    15 -> {
                        text2.setText(spinner2.selectedItem.toString())
                    }
                    16 -> {
                        text2.setText(spinner2.selectedItem.toString())
                    }
                    17 -> {
                        text2.setText(spinner2.selectedItem.toString())
                    }
                    18 -> {
                        text2.setText(spinner2.selectedItem.toString())
                    }
                    19 -> {
                        text2.setText(spinner2.selectedItem.toString())
                    }
                    20 -> {
                        text2.setText(spinner2.selectedItem.toString())
                    }
                    21 -> {
                        text2.setText(spinner2.selectedItem.toString())
                    }
                    22 -> {
                        text2.setText(spinner2.selectedItem.toString())
                    }
                    23 -> {
                        text2.setText(spinner2.selectedItem.toString())
                    }
                    24 -> {
                        text2.setText(spinner2.selectedItem.toString())
                    }
                    25 -> {
                        text2.setText(spinner2.selectedItem.toString())
                    }
                    26 -> {
                        text2.setText(spinner2.selectedItem.toString())
                    }
                    27 -> {
                        text2.setText(spinner2.selectedItem.toString())
                    }
                    28 -> {
                        text2.setText(spinner2.selectedItem.toString())
                    }
                    29 -> {
                        text2.setText(spinner2.selectedItem.toString())
                    }
                    30 -> {
                        text2.setText(spinner2.selectedItem.toString())
                    }
                    31 -> {
                        text2.setText(spinner2.selectedItem.toString())
                    }
                    32 -> {
                        text2.setText(spinner2.selectedItem.toString())
                    }
                    33 -> {
                        text2.setText(spinner2.selectedItem.toString())
                    }
                    34 -> {
                        text2.setText(spinner2.selectedItem.toString())
                    }
                    35 -> {
                        text2.setText(spinner2.selectedItem.toString())
                    }
                    36 -> {
                        text2.setText(spinner2.selectedItem.toString())
                    }
                    37 -> {
                        text2.setText(spinner2.selectedItem.toString())
                    }
                    38 -> {
                        text2.setText(spinner2.selectedItem.toString())
                    }
                    39 -> {
                        text2.setText(spinner2.selectedItem.toString())
                    }
                    40 -> {
                        text2.setText(spinner2.selectedItem.toString())
                    }
                    41 -> {
                        text2.setText(spinner2.selectedItem.toString())
                    }
                    42 -> {
                        text2.setText(spinner2.selectedItem.toString())
                    }
                    43 -> {
                        text2.setText(spinner2.selectedItem.toString())
                    }
                    44 -> {
                        text2.setText(spinner2.selectedItem.toString())
                    }
                    45 -> {
                        text2.setText(spinner2.selectedItem.toString())
                    }
                    46 -> {
                        text2.setText(spinner2.selectedItem.toString())
                    }
                    47 -> {
                        text2.setText(spinner2.selectedItem.toString())
                    }
                    48 -> {
                        text2.setText(spinner2.selectedItem.toString())
                    }
                    49 -> {
                        text2.setText(spinner2.selectedItem.toString())
                    }
                    50 -> {
                        text2.setText(spinner2.selectedItem.toString())
                    }
                    51 -> {
                        text2.setText(spinner2.selectedItem.toString())
                    }
                    52 -> {
                        text2.setText(spinner2.selectedItem.toString())
                    }
                    53 -> {
                        text2.setText(spinner2.selectedItem.toString())
                    }
                    54 -> {
                        text2.setText(spinner2.selectedItem.toString())
                    }

                    55 -> {
                        text2.setText(spinner2.selectedItem.toString())
                    }
                    56 -> {
                        text2.setText(spinner2.selectedItem.toString())
                    }
                    57 -> {
                        text2.setText(spinner2.selectedItem.toString())
                    }
                    58 -> {
                        text2.setText(spinner2.selectedItem.toString())
                    }
                    59 -> {
                        text2.setText(spinner2.selectedItem.toString())
                    }
                    60 -> {
                        text2.setText(spinner2.selectedItem.toString())
                    }
                    61 -> {
                        text2.setText(spinner2.selectedItem.toString())
                    }
                    62 -> {
                        text2.setText(spinner2.selectedItem.toString())
                    }
                    63 -> {
                        text2.setText(spinner2.selectedItem.toString())
                    }
                    64 -> {
                        text2.setText(spinner2.selectedItem.toString())
                    }
                    65 -> {
                        text2.setText(spinner2.selectedItem.toString())
                    }
                    66 -> {
                        text2.setText(spinner2.selectedItem.toString())
                    }
                    67 -> {
                        text2.setText(spinner2.selectedItem.toString())
                    }
                    68 -> {
                        text2.setText(spinner2.selectedItem.toString())
                    }
                    69 -> {
                        text2.setText(spinner2.selectedItem.toString())
                    }
                    70 -> {
                        text2.setText(spinner2.selectedItem.toString())
                    }
                    71 -> {
                        text2.setText(spinner2.selectedItem.toString())
                    }
                    72 -> {
                        text2.setText(spinner2.selectedItem.toString())
                    }
                    73 -> {
                        text2.setText(spinner2.selectedItem.toString())
                    }
                    74 -> {
                        text2.setText(spinner2.selectedItem.toString())
                    }
                    75 -> {
                        text2.setText(spinner2.selectedItem.toString())
                    }
                    76 -> {
                        text2.setText(spinner2.selectedItem.toString())
                    }
                    77 -> {
                        text2.setText(spinner2.selectedItem.toString())
                    }
                    78 -> {
                        text2.setText(spinner2.selectedItem.toString())
                    }
                    79 -> {
                        text2.setText(spinner2.selectedItem.toString())
                    }
                    //일치하는게 없는 경우
                    else -> {
                        text2.setText("메뉴")
                    }
                }
            }
        }
        spinner3.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                when (position) {
                    //선택안함
                    0 -> {
                        text3.setText("선택사항 없음")
                    }
                    1 -> {
                        text3.setText(spinner3.selectedItem.toString())
                    }
                    2 -> {
                        text3.setText(spinner3.selectedItem.toString())
                    }
                    3 -> {
                        text3.setText(spinner3.selectedItem.toString())
                    }
                    4 -> {
                        text3.setText(spinner3.selectedItem.toString())
                    }
                    5 -> {
                        text3.setText(spinner3.selectedItem.toString())
                    }
                    6 -> {
                        text3.setText(spinner3.selectedItem.toString())
                    }
                    7 -> {
                        text3.setText(spinner3.selectedItem.toString())
                    }
                    8 -> {
                        text3.setText(spinner3.selectedItem.toString())
                    }
                    9 -> {
                        text3.setText(spinner3.selectedItem.toString())
                    }
                    10 -> {
                        text3.setText(spinner3.selectedItem.toString())
                    }
                    11 -> {
                        text3.setText(spinner3.selectedItem.toString())
                    }
                    12 -> {
                        text3.setText(spinner3.selectedItem.toString())
                    }
                    13 -> {
                        text3.setText(spinner3.selectedItem.toString())
                    }
                    14 -> {
                        text3.setText(spinner3.selectedItem.toString())
                    }
                    15 -> {
                        text3.setText(spinner3.selectedItem.toString())
                    }
                    16 -> {
                        text3.setText(spinner3.selectedItem.toString())
                    }
                    17 -> {
                        text3.setText(spinner3.selectedItem.toString())
                    }
                    18 -> {
                        text3.setText(spinner3.selectedItem.toString())
                    }
                    19 -> {
                        text3.setText(spinner3.selectedItem.toString())
                    }
                    20 -> {
                        text3.setText(spinner3.selectedItem.toString())
                    }
                    21 -> {
                        text3.setText(spinner3.selectedItem.toString())
                    }
                    22 -> {
                        text3.setText(spinner3.selectedItem.toString())
                    }
                    23 -> {
                        text3.setText(spinner3.selectedItem.toString())
                    }
                    24 -> {
                        text3.setText(spinner3.selectedItem.toString())
                    }
                    25 -> {
                        text3.setText(spinner3.selectedItem.toString())
                    }
                    26 -> {
                        text3.setText(spinner3.selectedItem.toString())
                    }
                    27 -> {
                        text3.setText(spinner3.selectedItem.toString())
                    }
                    28 -> {
                        text3.setText(spinner3.selectedItem.toString())
                    }
                    29 -> {
                        text3.setText(spinner3.selectedItem.toString())
                    }
                    30 -> {
                        text3.setText(spinner3.selectedItem.toString())
                    }
                    31 -> {
                        text3.setText(spinner3.selectedItem.toString())
                    }
                    32 -> {
                        text3.setText(spinner3.selectedItem.toString())
                    }
                    33 -> {
                        text3.setText(spinner3.selectedItem.toString())
                    }
                    34 -> {
                        text3.setText(spinner3.selectedItem.toString())
                    }
                    35 -> {
                        text3.setText(spinner3.selectedItem.toString())
                    }
                    36 -> {
                        text3.setText(spinner3.selectedItem.toString())
                    }
                    37 -> {
                        text3.setText(spinner3.selectedItem.toString())
                    }
                    38 -> {
                        text3.setText(spinner3.selectedItem.toString())
                    }
                    39 -> {
                        text3.setText(spinner3.selectedItem.toString())
                    }
                    40 -> {
                        text3.setText(spinner3.selectedItem.toString())
                    }
                    41 -> {
                        text3.setText(spinner3.selectedItem.toString())
                    }
                    42 -> {
                        text3.setText(spinner3.selectedItem.toString())
                    }
                    43 -> {
                        text3.setText(spinner3.selectedItem.toString())
                    }
                    44 -> {
                        text3.setText(spinner3.selectedItem.toString())
                    }
                    45 -> {
                        text3.setText(spinner3.selectedItem.toString())
                    }
                    46 -> {
                        text3.setText(spinner3.selectedItem.toString())
                    }
                    47 -> {
                        text3.setText(spinner3.selectedItem.toString())
                    }
                    48 -> {
                        text3.setText(spinner3.selectedItem.toString())
                    }
                    49 -> {
                        text3.setText(spinner3.selectedItem.toString())
                    }
                    50 -> {
                        text3.setText(spinner3.selectedItem.toString())
                    }
                    51 -> {
                        text3.setText(spinner3.selectedItem.toString())
                    }
                    52 -> {
                        text3.setText(spinner3.selectedItem.toString())
                    }
                    53 -> {
                        text3.setText(spinner3.selectedItem.toString())
                    }
                    54 -> {
                        text3.setText(spinner3.selectedItem.toString())
                    }
                    55 -> {
                        text3.setText(spinner3.selectedItem.toString())
                    }
                    56 -> {
                        text3.setText(spinner3.selectedItem.toString())
                    }
                    57 -> {
                        text3.setText(spinner3.selectedItem.toString())
                    }
                    58 -> {
                        text3.setText(spinner3.selectedItem.toString())
                    }
                    59 -> {
                        text3.setText(spinner3.selectedItem.toString())
                    }
                    //일치하는게 없는 경우
                    else -> {
                        text3.setText("메뉴")
                    }
                }
            }
        }
        spinner4.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                when (position) {
                    //선택안함
                    0 -> {
                        text4.setText("선택사항 없음")
                    }
                    1 -> {
                        text4.setText(spinner4.selectedItem.toString())
                    }
                    2 -> {
                        text4.setText(spinner4.selectedItem.toString())
                    }
                    3 -> {
                        text4.setText(spinner4.selectedItem.toString())
                    }
                    4 -> {
                        text4.setText(spinner4.selectedItem.toString())
                    }
                    5 -> {
                        text4.setText(spinner4.selectedItem.toString())
                    }
                    6 -> {
                        text4.setText(spinner4.selectedItem.toString())
                    }
                    7 -> {
                        text4.setText(spinner4.selectedItem.toString())
                    }
                    8 -> {
                        text4.setText(spinner4.selectedItem.toString())
                    }
                    9 -> {
                        text4.setText(spinner4.selectedItem.toString())
                    }
                    10 -> {
                        text4.setText(spinner4.selectedItem.toString())
                    }
                    11 -> {
                        text4.setText(spinner4.selectedItem.toString())
                    }
                    12 -> {
                        text4.setText(spinner4.selectedItem.toString())
                    }
                    13 -> {
                        text4.setText(spinner4.selectedItem.toString())
                    }
                    14 -> {
                        text4.setText(spinner4.selectedItem.toString())
                    }
                    15 -> {
                        text4.setText(spinner4.selectedItem.toString())
                    }
                    16 -> {
                        text4.setText(spinner4.selectedItem.toString())
                    }
                    17 -> {
                        text4.setText(spinner4.selectedItem.toString())
                    }
                    18 -> {
                        text4.setText(spinner4.selectedItem.toString())
                    }
                    19 -> {
                        text4.setText(spinner4.selectedItem.toString())
                    }
                    20 -> {
                        text4.setText(spinner4.selectedItem.toString())
                    }
                    21 -> {
                        text4.setText(spinner4.selectedItem.toString())
                    }
                    22 -> {
                        text4.setText(spinner4.selectedItem.toString())
                    }
                    23 -> {
                        text4.setText(spinner4.selectedItem.toString())
                    }
                    24 -> {
                        text4.setText(spinner4.selectedItem.toString())
                    }
                    25 -> {
                        text4.setText(spinner4.selectedItem.toString())
                    }
                    26 -> {
                        text4.setText(spinner4.selectedItem.toString())
                    }
                    //일치하는게 없는 경우
                    else ->
                        text4.setText("메뉴")
                }
            }
        }
    }

    var Time = 0L
    override fun onBackPressed() {
        if (System.currentTimeMillis() - Time >= 1500) {
            Time = System.currentTimeMillis()
            Toast.makeText(this, "뒤로가기 버튼을 한번 더 누르면 종료됩니다.", Toast.LENGTH_SHORT).show()
        } else {
            finish()
        }
    }

    //화면 캡쳐하기
    fun ScreenShot() {
        val view: View = window.decorView.rootView
        view.setDrawingCacheEnabled(true) //화면에 뿌릴때 캐시 사용

        //캐시 -> 비트맵 변환
        val screenBitmap: Bitmap = Bitmap.createBitmap(view.getDrawingCache())
        try {
            val cachePath = File(applicationContext.cacheDir, "images")
            cachePath.mkdirs() // don't forget to make the directory
            val stream =
                FileOutputStream(cachePath.toString() + "/image.png") // overwrites this image every time
            screenBitmap.compress(Bitmap.CompressFormat.PNG, 100, stream)
            stream.close()
            val newFile = File(cachePath, "image.png")
            val contentUri: Uri = FileProvider.getUriForFile(
                applicationContext,
                "com.yongjincompany.eathub", newFile
            )
            val Sharing_intent = Intent(Intent.ACTION_SEND)
            Sharing_intent.setType("image/png")
            Sharing_intent.putExtra(Intent.EXTRA_STREAM, contentUri)
            startActivity(Intent.createChooser(Sharing_intent, "Share image"))
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }
}
