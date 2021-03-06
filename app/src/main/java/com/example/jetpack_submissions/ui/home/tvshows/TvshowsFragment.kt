package com.example.jetpack_submissions.ui.home.tvshows

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.jetpack_submissions.data.source.remote.response.TVShowItem
import com.example.jetpack_submissions.databinding.FragmentTvshowsBinding
import com.example.jetpack_submissions.ui.home.HomeFragmentDirections
import com.example.jetpack_submissions.viewmodel.ViewModelFactory
import com.google.android.material.snackbar.Snackbar

class TvshowsFragment : Fragment(), TvshowsAdapter.TVShowListener {

    lateinit var binding: FragmentTvshowsBinding
    lateinit var viewModel: TvshowsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTvshowsBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (activity != null) {
            val factory = ViewModelFactory.getInstance()
            viewModel = ViewModelProvider(this, factory)[TvshowsViewModel::class.java]

            val tvShowsAdapter = TvshowsAdapter(context, this)
            viewModel.getDataTvshows().observe(viewLifecycleOwner, {
                tvShowsAdapter.setTvshows(it)
                tvShowsAdapter.notifyDataSetChanged()
            })

            with(binding.rvTvshows) {
                layoutManager = LinearLayoutManager(context)
                setHasFixedSize(true)
                adapter = tvShowsAdapter
            }

            viewModel.getLoadingStates().observe(viewLifecycleOwner, {
                binding.progressBar2.visibility = if (it) View.VISIBLE else View.GONE
            })

            viewModel.getConnectionStates().observe(viewLifecycleOwner, {
                if (!it) {
                    Snackbar.make(
                        requireView(),
                        "Koneksi bermaslah, menggunakan data cache untuk sementara jika tersedia",
                        Snackbar.LENGTH_LONG
                    ).show()
                }
            })

        }
    }

    override fun tvshowOnClick(tvshow: TVShowItem) {
        val action = HomeFragmentDirections.actionHomeFragmentToTVShowDetailActivity(tvshow)
        findNavController().navigate(action)
    }

}