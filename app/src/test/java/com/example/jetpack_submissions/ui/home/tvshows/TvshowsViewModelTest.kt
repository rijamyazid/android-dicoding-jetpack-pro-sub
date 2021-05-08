package com.example.jetpack_submissions.ui.home.tvshows

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.example.jetpack_submissions.data.source.Repository
import com.example.jetpack_submissions.data.source.remote.response.TVShowItem
import com.example.jetpack_submissions.utils.DataDummy
import com.nhaarman.mockitokotlin2.verify
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class TvshowsViewModelTest {

    private lateinit var viewModel: TvshowsViewModel

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @Mock
    private lateinit var repository: Repository

    @Mock
    private lateinit var observer1: Observer<ArrayList<TVShowItem>>

    @Before
    fun setUp() {
        viewModel = TvshowsViewModel(repository)
    }

    @Test
    fun getDataTvshows() {

        val dummyTVShows = DataDummy.generateRemoteDummyTVShows()
        val tvshows = MutableLiveData<ArrayList<TVShowItem>>()
        tvshows.value = dummyTVShows

        `when`(repository.getAllRemoteTVShows()).thenReturn(tvshows)
        val tvshowItems = viewModel.getDataTvshows().value
        verify(repository).getAllRemoteTVShows()

        assertNotNull(tvshowItems)
        assertEquals(dummyTVShows.size, tvshowItems?.size)

        viewModel.getDataTvshows().observeForever(observer1)
        verify(observer1).onChanged(dummyTVShows)
    }

}