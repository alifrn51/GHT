package com.ght.chromatech.feature.auth.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.ght.chromatech.R
import com.ght.chromatech.data.DiseaseRegistration
import com.ght.chromatech.feature.auth.registration.DiseaseRegistrationAdapter
import com.ght.chromatech.feature.auth.registration.OnClickDiseaseItemListener
import com.sevenlearn.nikestore.common.AppFragment
import kotlinx.android.synthetic.main.fragment_registration_two.*
import timber.log.Timber

class LoginFragment : AppFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_login,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

}