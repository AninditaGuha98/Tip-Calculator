package com.example.tipcalculator

import android.os.Build
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.SeekBar
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.text.NumberFormat
import java.util.*



class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var amount="0"
        var split_num="1"
//Initalizing the amount and split value to their default values.
        amountinput2.setText(amount)
        split_value.setText(split_num)


// Disabling android's keyboard on the edittexts.
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            amountinput2.setShowSoftInputOnFocus(false);
            split_value.setShowSoftInputOnFocus(false);
        } else { // API 11-20
            amountinput2.setTextIsSelectable(true);
        split_value.setTextIsSelectable(true);
        }

//Seekbar value getting reflected in the textview of tip percentage.
        seekBar1.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, i: Int, b: Boolean) {
                val sk="%"+i.toString()
                tipinput.setText("${i}"+"%")

            }
            override fun onStartTrackingTouch(seekBar: SeekBar) {
            }
            override fun onStopTrackingTouch(seekBar: SeekBar) {
            }
        })
//OnClickListener for the button calculate
        calculate.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View?) {
                calculate()
            }
        })
//onClickListener for the button reset
        reset.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View?) {
                amountinput2.setText("0")
                seekBar1.progress = 15
                split_value.setText("1")
                amount="0"
                split_num="1"
            }
        })

// OnClickListeners for the custom keyboard's buttons (0-9), decimal point and delete.
        key_0.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                if(amountinput2.hasFocus()){
                    amount=amount+ "0"
                    amountinput2.setText(amount)
                    amountinput2.setSelection(amountinput2.getText().length)
                }
                else if (split_value.hasFocus()){
                    split_num=split_num+"0"
                    split_value.setText(split_num)
                    split_value.setSelection(split_value.getText().length)
                }
            }
        })
        key_1.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                if(amountinput2.hasFocus()){
                    amount=amount+ "1"
                    amountinput2.setText(amount)
                    amountinput2.setSelection(amountinput2.getText().length)
                }
                else if (split_value.hasFocus()){
                    split_num=split_num+"1"
                    split_value.setText(split_num)
                    split_value.setSelection(split_value.getText().length)
                }
            }
        })

        key_2.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                if(amountinput2.hasFocus()){
                    amount=amount+ "2"
                    amountinput2.setText(amount)
                    amountinput2.setSelection(amountinput2.getText().length)
                }
                else if (split_value.hasFocus()){
                    split_num=split_num+"2"
                    split_value.setText(split_num)
                    split_value.setSelection(split_value.getText().length)
                }
            }
        })
        
        key_3.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                if(amountinput2.hasFocus()){
                    amount=amount+ "3"
                    amountinput2.setText(amount)
                    amountinput2.setSelection(amountinput2.getText().length)
                }
                else if (split_value.hasFocus()){
                    split_num=split_num+"3"
                    split_value.setText(split_num)
                    split_value.setSelection(split_value.getText().length)
                }
            }
        })
        key_4.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                if(amountinput2.hasFocus()){
                    amount=amount+ "4"
                    amountinput2.setText(amount)
                    amountinput2.setSelection(amountinput2.getText().length)
                }
                else if (split_value.hasFocus()){
                    split_num=split_num+"4"
                    split_value.setText(split_num)
                    split_value.setSelection(split_value.getText().length)
                }
            }
        })
        key_5.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                if(amountinput2.hasFocus()){
                    amount=amount+ "5"
                    amountinput2.setText(amount)
                    amountinput2.setSelection(amountinput2.getText().length)
                }
                else if (split_value.hasFocus()){
                    split_num=split_num+"5"
                    split_value.setText(split_num)
                    split_value.setSelection(split_value.getText().length)
                }
            }
        })
        key_6.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                if(amountinput2.hasFocus()){
                    amount=amount+ "6"
                    amountinput2.setText(amount)
                    amountinput2.setSelection(amountinput2.getText().length)
                }
                else if (split_value.hasFocus()){
                    split_num=split_num+"6"
                    split_value.setText(split_num)
                    split_value.setSelection(split_value.getText().length)
                }
            }
        })
        key_7.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                if(amountinput2.hasFocus()){
                    amount=amount+ "7"
                    amountinput2.setText(amount)
                    amountinput2.setSelection(amountinput2.getText().length)
                }
                else if (split_value.hasFocus()){
                    split_num=split_num+"7"
                    split_value.setText(split_num)
                    split_value.setSelection(split_value.getText().length)
                }
            }
        })
        key_8.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                if(amountinput2.hasFocus()){
                    amount=amount+ "8"
                    amountinput2.setText(amount)
                    amountinput2.setSelection(amountinput2.getText().length)
                }
                else if (split_value.hasFocus()){
                    split_num=split_num+"8"
                    split_value.setText(split_num)
                    split_value.setSelection(split_value.getText().length)
                }
            }
        })
        key_9.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                if(amountinput2.hasFocus()){
                    amount=amount+ "9"
                    amountinput2.setText(amount)
                    amountinput2.setSelection(amountinput2.getText().length)
                }
                else if (split_value.hasFocus()){
                    split_num=split_num+"9"
                    split_value.setText(split_num)
                    split_value.setSelection(split_value.getText().length)
                }
            }
        })
        key_dot.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                if(amountinput2.hasFocus()){
                    if(amount.contains(".")){
                        return
                    }
                    else {
                        amount = amount + "."
                        amountinput2.setText(amount)
                        amountinput2.setSelection(amountinput2.getText().length)
                    }
                }
            }
        })
        key_delete.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                if(amountinput2.hasFocus()){
                    if(amount.length==0){
                        return
                    }
                    else {
                        amount=amount.substring(0,amount.length-1)
                        amountinput2.setText(amount)
                        amountinput2.setSelection(amountinput2.getText().length)
                    }
                }
                else if (split_value.hasFocus()){
                    if(split_num.length==0){
                        return
                    }
                    else {
                        split_num=split_num.substring(0,split_num.length-1)
                        split_value.setText(split_num)
                        split_value.setSelection(split_value.getText().length)
                    }

                }
            }
        })

//TextWatcher added for bill amount to hide and show the errors.
        amountinput2.addTextChangedListener(object: TextWatcher {
            override fun onTextChanged(cs:CharSequence, arg1:Int, arg2:Int, arg3:Int) {
            }
            override fun beforeTextChanged(arg0:CharSequence, arg1:Int, arg2:Int, arg3:Int) {
            }
           override fun afterTextChanged(arg0: Editable) {
               if(amount.isNotEmpty()){
                   error_display.setVisibility(View.INVISIBLE)
               }
               else{
                   error_display.setVisibility(View.VISIBLE)
               }
            }
        })
    }

//    Calculate function
    private fun calculate() {
//    Displaying error if the bill amount is null
        if (amountinput2.text.isEmpty()) {
            amountinput2.requestFocus()
            error_display.setText("Please fill this input field")
            return
        }

        val v1: Double = java.lang.Double.valueOf(amountinput2.getText().toString())
        val v2: Double = java.lang.Double.valueOf(seekBar1.progress.toString())
// if the split value is 0 or null then do not consider its value
        if (split_value.text.isEmpty()|| split_value.text.toString().toInt().equals(0) || split_value.text.toString().toInt().equals(1)) {
            val result = v1 + (v1 * (v2 / 100))
            val value=NumberFormat.getCurrencyInstance(Locale.CANADA).format(result)
            result_value.setText("Amount: "+"${value}")
            return
        } else {
            val v3: Double = java.lang.Double.valueOf(split_value.getText().toString())
            val result = (v1 + (v1 * (v2 / 100))) / v3
            val value=NumberFormat.getCurrencyInstance(Locale.CANADA).format(result)
            result_value.setText("Amount Per Person: "+"${value}")
            return
        }
    }


}



