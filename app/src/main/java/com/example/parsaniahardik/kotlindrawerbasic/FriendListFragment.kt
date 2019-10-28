package com.example.parsaniahardik.kotlindrawerbasic

/**
 * Created by Parsania Hardik on 16-Feb-18.
 */
import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.AppCompatButton
import android.text.TextUtils
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.parsaniahardik.kotlindrawerbasic.utils.NetInfo
import com.example.parsaniahardik.kotlindrawerbasic.utils.PersistData
import kotlinx.android.synthetic.main.lv_item.*


class FriendListFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }


    private var etName: EditText? = null
    private var etPass: EditText? = null
    private var btnSubmit: AppCompatButton? = null
    private var tvNamePas: TextView? = null
    private var nameList: ArrayList<NameModel> = ArrayList();

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater!!.inflate(R.layout.fragment_friend_list, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        initUi()


        for (i in 1..10) {
            var nameModel: NameModel = NameModel("Kutub"+i,20+i)
            nameList.add(nameModel)

        }

        Log.e("nameList",""+nameList.size)

        for (i in nameList){
            Log.e("nameList","name: "+i.name+" , "+"age: "+i.age)
        }


        this!!.context?.let { PersistData.setStringData(it,"name","sadi") }

      Log.e("saveNAme",""+context?.let { PersistData.getStringData(it,"name") })


        if(!this!!.context?.let { NetInfo.isOnline(it) }!!){
            Log.e("Internet","No Internet")
        }else{
            Log.e("Internet","Yes Internet")
        }

    }

    private fun initUi() {
        etName = view!!.findViewById(R.id.etName)as EditText
        etPass = view!!.findViewById(R.id.etPass)as EditText
        btnSubmit = view!!.findViewById(R.id.btnSubmit)as AppCompatButton
        tvNamePas = view!!.findViewById(R.id.tvNamePas)as TextView

        btnSubmit!!.setOnClickListener(View.OnClickListener {

            val name = etName!!.text
            val pass = etPass!!.text

            if(TextUtils.isEmpty(name)){
                Toast.makeText(context, "Input name!", Toast.LENGTH_SHORT).show()
            }else if(TextUtils.isEmpty(pass)){
                Toast.makeText(context, "Input pass!", Toast.LENGTH_SHORT).show()
            }else{
                tvNamePas!!.text=("$name $name")
            }

        })

    }


}// Required empty public constructor






