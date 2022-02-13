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

class RegistrationOneFragment : AppFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_registration_one, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}