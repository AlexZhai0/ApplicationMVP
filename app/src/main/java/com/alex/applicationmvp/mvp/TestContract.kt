package com.alex.applicationmvp.mvp

import android.support.v4.app.Fragment
import com.financial.virtualcard.app.virtualmodel.elevatequota.mvp.base.IModel
import com.financial.virtualcard.app.virtualmodel.elevatequota.mvp.base.IPresenter
import com.financial.virtualcard.app.virtualmodel.elevatequota.mvp.base.IView

interface TestContract {

    interface MyPresenter: IPresenter{
        fun getData()
    }

    interface MyView: IView{
        fun getCurrentContext(): Fragment
        fun <T> showData(data: T)
        fun failData(s: String)
    }

    interface MyModel: IModel{
        interface TestModelCallback{
            fun <T> success(t: T)
            fun failed(s: String)
        }
    }
}