package com.ght.chromatech.feature.auth.registration

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.CheckBox
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.ght.chromatech.R
import com.ght.chromatech.data.DiseaseRegistration

class DiseaseRegistrationAdapter(
    context: Context,
    objects: ArrayList<DiseaseRegistration>,
    private val listener: OnClickDiseaseItemListener
) : ArrayAdapter<DiseaseRegistration>(context, 0, objects) {

    private var listDisease = objects


    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        return createViewFromResource(position, convertView, parent)
    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup): View {
        return createViewFromResource(position, convertView, parent)
    }



    private fun createViewFromResource(position: Int, convertView: View?, parent: ViewGroup?): View{
        val view  = LayoutInflater.from(context).inflate(R.layout.item_disease, parent, false)

        val parent = view.findViewById<ConstraintLayout>(R.id.parent)
        val title = view.findViewById<TextView>(R.id.txtTitle)
        val desc = view.findViewById<TextView>(R.id.txtDesc)
        val isCheck = view.findViewById<CheckBox>(R.id.checkBoxDisease)

        title.text = listDisease[position].txtTitle
        desc.text = listDisease[position].txtDesc
        isCheck.isChecked = listDisease[position].isChecked
/*
        parent.setOnClickListener{

            isCheck.isChecked = !isCheck.isChecked
            listDisease[position] = DiseaseRegistration(title.text.toString() , desc.text.toString() ,isCheck.isChecked)
            listener.OnClickItem(listDisease)

        }*/

        return view
    }



    override fun getCount(): Int {
        return 1
    }
}

interface OnClickDiseaseItemListener{
    fun OnClickItem(list: ArrayList<DiseaseRegistration>)
}