package com.uilover.project239.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.uilover.project239.Domain.BannerModel
import com.uilover.project239.Domain.CategoryModel
import com.uilover.project239.Domain.ItemsModel
import com.uilover.project239.Repository.MainRepository

class MainViewModel : ViewModel() {
    private val repository = MainRepository()

    fun loadBanner(): LiveData<MutableList<BannerModel>> {
        return repository.loadBanner()
    }

    fun loadCategory(): LiveData<MutableList<CategoryModel>> {
        return repository.loadCategory()
    }

    fun loadPopular(): LiveData<MutableList<ItemsModel>> {
        return repository.loadPopular()
    }

    fun loadItems(categoryId: String): LiveData<MutableList<ItemsModel>> {
        return repository.loadItemCategory(categoryId)
    }
}