package com.dog.di

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import com.dog.util.common.userStore
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class DataStoreModule {

    @Provides
    @UserDataStore
    fun providesUserDataStore(@ApplicationContext context: Context): DataStore<Preferences> {
        return context.userStore
    }
}
