package com.ght.chromatech.feature.auth.registration

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.ght.chromatech.R
import com.ght.chromatech.data.DiseaseRegistration
import com.sevenlearn.nikestore.common.AppFragment
import kotlinx.android.synthetic.main.fragment_registration_two.*
import timber.log.Timber

class RegistrationTwoFragment : AppFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_registration_two, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val list = arrayListOf(
            DiseaseRegistration(
                getString(R.string.disease_diabet),
                getString(R.string.disease_diabet1),
                false
            ),
            DiseaseRegistration(
                getString(R.string.disease_heart),
                getString(R.string.disease_heart1),
                false
            ),
            DiseaseRegistration(
                getString(R.string.disease_renal),
                getString(R.string.disease_renal1),
                false
            )
        )
        val items = listOf("Material", "Design", "Components", "Android")
        val adapter1 = ArrayAdapter(requireContext(), R.layout.list_text, items)

        val adapter = DiseaseRegistrationAdapter(requireContext(),list, object : OnClickDiseaseItemListener {
            override fun OnClickItem(list: ArrayList<DiseaseRegistration>) {
                Timber.i(list.toString())
            }

        } )

        textFieldDisease.setAdapter(adapter1)
    }
}