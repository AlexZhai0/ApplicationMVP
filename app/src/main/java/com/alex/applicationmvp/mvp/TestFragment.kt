package com.alex.applicationmvp.mvp

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.alex.applicationmvp.R
import com.financial.virtualcard.app.virtualmodel.elevatequota.mvp.TestPresenter

/**
 * 提额详情页面
 */
class TestFragment() : Fragment(), TestContract.MyView {

    private val presenter = TestPresenter(this)

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? =
        inflater.inflate(R.layout.fragment_test, container, false)

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        presenter.getData()
    }

    override fun failData(s: String) {
        Toast.makeText(activity, s, Toast.LENGTH_SHORT).show()
    }

    override fun <T> showData(data: T) {
        Toast.makeText(activity, (data as List<*>).size.toString(), Toast.LENGTH_SHORT).show()
    }

    override fun getCurrentContext(): Fragment {
        return this
    }

}
