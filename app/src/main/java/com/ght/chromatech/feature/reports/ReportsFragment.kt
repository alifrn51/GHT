package com.ght.chromatech.feature.reports

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ght.chromatech.R
import com.sevenlearn.nikestore.common.AppFragment

class ReportsFragment : AppFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_reports,container,false)
    }
}