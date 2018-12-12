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
        if (isNewOp){
            resultText.setText("")
        }
        isNewOp=false
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

    var op="*"
    var oldNumber=""
    var isNewOp=true
    fun butOpEvent(view:View){
        val buttonSelected = view as Button
        when(buttonSelected.id){
            butMulti.id->{
                op="*"
            }
            butDiv.id->{
                op="/"
            }
            butSub.id->{
                op="-"
            }
            butSum.id->{
                op="+"
            }
        }
        oldNumber=resultText.text.toString()
        isNewOp=true
    }

    fun butEqualEvent(view: View){
        val newNumber=resultText.text.toString()
        var finalNumber:Double?=null
        when (op){
            "*"->{
                finalNumber=oldNumber.toDouble()*newNumber.toDouble()
            }
            "/"->{
                finalNumber=oldNumber.toDouble()/newNumber.toDouble()
            }
            "+"->{
                finalNumber=oldNumber.toDouble()+newNumber.toDouble()
            }
            "-"->{
                finalNumber=oldNumber.toDouble()-newNumber.toDouble()
            }
        }
        resultText.setText(finalNumber.toString())
        isNewOp=true
    }

    fun butPercentEvent(view:View){
        val number:Double=resultText.text.toString().toDouble()/100
        resultText.setText(number.toString())
        isNewOp=true

    }

    fun butCleanEvent(view:View){
        resultText.setText("0")
        isNewOp=true
    }
}
