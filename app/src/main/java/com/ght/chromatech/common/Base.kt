package com.sevenlearn.nikestore.common

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.core.view.children
import androidx.fragment.app.Fragment
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ght.chromatech.R
import com.google.android.material.snackbar.Snackbar
import io.reactivex.disposables.CompositeDisposable

abstract class AppFragment : Fragment(), AppView {
    override val rootView: CoordinatorLayout?
        get() = view as CoordinatorLayout
    override val viewContext: Context?
        get() = context

}

abstract class AppActivity : AppCompatActivity(), AppView {
    override val rootView: CoordinatorLayout?
        get() {
            val viewGroup = window.decorView.findViewById(android.R.id.content) as ViewGroup
            if (viewGroup !is CoordinatorLayout) {
                viewGroup.children.forEach {
                    if (it is CoordinatorLayout)
                        return it
                }
                throw IllegalStateException("RootView must be instance of CoordinatorLayout")
            } else
                return viewGroup
        }
    override val viewContext: Context?
        get() = this


}

interface AppView {
    val rootView: CoordinatorLayout?
    val viewContext: Context?
    fun setProgressIndicator(mustShow: Boolean) {
        rootView?.let {
            viewContext?.let { context ->
                var loadingView = it.findViewById<View>(R.id.loadingView)
                if (loadingView == null && mustShow) {
                    loadingView =
                        LayoutInflater.from(context).inflate(R.layout.view_loading, it, false)
                    it.addView(loadingView)
                }

                loadingView?.visibility = if (mustShow) View.VISIBLE else View.GONE


            }

        }
    }



}

abstract class AppViewModel : ViewModel() {
    val compositeDisposable = CompositeDisposable()
    val progressBarLiveData = MutableLiveData<Boolean>()

    override fun onCleared() {
        compositeDisposable.clear()
        super.onCleared()
    }

}
