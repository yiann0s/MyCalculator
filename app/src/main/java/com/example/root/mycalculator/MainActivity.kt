package com.example.root.mycalculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun buttonNumberEvent(view: View){
        val buttonSelected = view as Button
        var buttonClickValue:String=resultText.text.toString()
        when(buttonSelected.id){
            buttonZero.id->{
                buttonClickValue+="0"
            }
            buttonOne.id->{
                buttonClickValue+="1"
            }
            buttonTwo.id->{
                buttonClickValue+="2"
            }
            buttonThree.id->{
                buttonClickValue+="3"
            }
            buttonFour.id->{
                buttonClickValue+="4"
            }
            buttonFive.id->{
                buttonClickValue+="5"
            }
            buttonSix.id->{
                buttonClickValue+="6"
            }
            buttonSeven.id->{
                buttonClickValue+="7"
            }
            buttonEight.id->{
                buttonClickValue+="8"
            }
            buttonNine.id->{
                buttonClickValue+="9"
            }
            buttonDecimal.id->{
                buttonClickValue+="."
            }
            buttonPlusMinus.id->{
                buttonClickValue="-"+buttonClickValue
            }
        }
        resultText.setText(buttonClickValue)
    }
}
