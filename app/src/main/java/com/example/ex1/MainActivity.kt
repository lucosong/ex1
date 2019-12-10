package com.example.ex1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonCalculate.setOnClickListener()
        {
            val result: Double =
                editTextCarPrice.text.toString().toDouble() - editTextDownPayment.text.toString().toDouble()
            textViewLoan.text = "Car loan = RM %.2f".format(result)

            val interest: Double = result * editTextInterestRate.text.toString().toDouble() * editTextDownPayment.text.toString().toDouble()
            textViewInterest.text = "Interest = RM %.2f".format(interest)

            val monthly: Double =  (result + interest)/editTextLoanPeriod.text.toString().toDouble()/12
            textViewMonthlyRepayment.text = "Monthly repayment = RM %.2f".format(monthly)

        }
        buttonReset.setOnClickListener()
        {
            editTextCarPrice.text =null;
            editTextLoanPeriod.text=null;
            editTextDownPayment.text=null;
            editTextInterestRate.text=null;



        }
    }


}
