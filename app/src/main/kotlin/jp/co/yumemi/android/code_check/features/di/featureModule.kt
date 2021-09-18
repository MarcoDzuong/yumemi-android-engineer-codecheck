package jp.co.yumemi.android.code_check.features.di

import jp.co.yumemi.android.code_check.features.domain.GithubUseCase
import jp.co.yumemi.android.code_check.features.screen.search.SearchViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val featureModule = module {
    viewModel { SearchViewModel(get()) }
    factory { GithubUseCase(get()) }
}