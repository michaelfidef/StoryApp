package com.dicoding.picodiploma.loginwithanimation.view.addStory

import androidx.lifecycle.ViewModel
import com.dicoding.picodiploma.loginwithanimation.data.UserRepository
import okhttp3.MultipartBody
import okhttp3.RequestBody

class AddStoryViewModel(private val repository: UserRepository) : ViewModel() {

    fun getAddStory(file: MultipartBody.Part, description: RequestBody) =
        repository.uploadStory(file, description)
}