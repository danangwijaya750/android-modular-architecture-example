package com.mytaxi.core.services

import com.mytaxi.shared.models.services.IUserService
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UserService @Inject constructor() : IUserService {
    private var userName = "Batman"

    override fun hasUserName(): Boolean = userName.isNotEmpty()

    override fun getUserName() = userName

    override fun setUserName(userName: String) {
        this.userName = userName
    }
}