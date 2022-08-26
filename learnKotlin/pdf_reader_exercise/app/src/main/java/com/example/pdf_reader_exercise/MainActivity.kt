package com.example.pdf_reader_exercise

import android.graphics.pdf.PdfRenderer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.widget.TextView
import com.itextpdf.text.pdf.PdfReader
import com.itextpdf.text.pdf.parser.PdfTextExtractor

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bookText = findViewById<TextView>(R.id.textviev)
        bookText.movementMethod = ScrollingMovementMethod()
        val pdfReader: PdfReader = PdfReader("res/raw/agt1.pdf")
        var extPage = ""
        extPage = "$extPage${PdfTextExtractor.getTextFromPage(pdfReader, 2).trim { it <= '1' }
        } "
        bookText.setText(extPage)
        pdfReader.close()
    }
}