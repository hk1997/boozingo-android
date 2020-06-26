package com.jerry.boozingo.view.activites.ui.citybars

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.jerry.boozingo.model.ApiResponse
import com.jerry.boozingo.model.ApiService
import com.jerry.boozingo.model.BoozePlace
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.observers.DisposableSingleObserver
import io.reactivex.schedulers.Schedulers

class CityBarsViewModel : ViewModel() {

    private val apiService = ApiService()
    private val disposable = CompositeDisposable()

    private val _boozePlaces = MutableLiveData<List<BoozePlace>>()
    val boozePlaces: LiveData<List<BoozePlace>>
        get() = _boozePlaces

    fun refresh() { //fragment came here
        fetchFromRemote()  //called this
    }

    private fun fetchFromRemote() {
        Log.e("Label 1:", "Calling Server Begins")
        disposable.add(
            apiService.getApi().getBoozePlaces(
                11,
                12,
                120000
            )  //important line ...... getApi from ApiService, getBoozePlaces from JSONPlaceHolderApi and the data is what we need to send
                .subscribeOn(Schedulers.newThread()) //ignore (just copy paste)
                .observeOn(AndroidSchedulers.mainThread()) //ignore (just copy paste)
                .subscribeWith(object :
                    DisposableSingleObserver<ApiResponse>() { // notice that API Response class me receive hoga sab
                    override fun onSuccess(apiResponse: ApiResponse) {// notice that API Response ka object bananya

                        Log.e("Label 2:", "success tak chala")
                        _boozePlaces.value =
                            apiResponse.data // object ka 'data' which is of type List<boozeplaces>...........WE READ THIS VARIABLE FROM OUR FRAGMENT

                    }

                    override fun onError(e: Throwable) {
                        Log.e("Label 2:", "error tak chala")
                        e.printStackTrace()
                    }

                })
        )
    }

    override fun onCleared() {
        super.onCleared()
        disposable.clear()
    }


}