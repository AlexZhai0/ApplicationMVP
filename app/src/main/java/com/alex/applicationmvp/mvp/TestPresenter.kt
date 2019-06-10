package com.financial.virtualcard.app.virtualmodel.elevatequota.mvp

import com.alex.applicationmvp.mvp.TestContract
import com.alex.applicationmvp.mvp.TestModel

class TestPresenter(
        val view: TestContract.MyView
) : TestContract.MyPresenter, TestContract.MyModel.TestModelCallback {

    private val elevateQuotaModel = TestModel(this)

    override fun <T> success(t: T) {
        view.showData(t)
    }

    override fun failed(s: String) {
        view.failData(s)
    }

    override fun getData() {
        elevateQuotaModel.getData()
    }
}