package com.alex.applicationmvp.mvp

class TestModel(
    private val callback: TestContract.MyModel.TestModelCallback
): TestContract.MyModel {

    fun getData() {
        val list = mutableListOf<String>()

        for (i in 1..50) {
            list.add("i $i")
        }

        if (list.size > 10) {
            callback.success(list)
        } else {
            callback.failed("error")
        }
    }
}
