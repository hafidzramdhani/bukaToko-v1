package com.splash.sc;


import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SwitchCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;


public class AplikasiFragment extends Fragment {

	FragmentActivity listener;
	
	public static AplikasiFragment newInstance(){
		return new AplikasiFragment();
	}
	
	@Nullable
	@Override
	public View onCreateView(@NonNull LayoutInflater inflater,@Nullable ViewGroup container,@Nullable Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_aplikasi, container, false);
		return view;
	}
	
	@Override
	public void onViewCreated(View view, Bundle savedInstanceState){
		}
		
	// Method ini dipanggil saat fragment sudah tidak terhubung dengan Activity.
	// Semua reference yang dipasang di onAttach harus dilepas disini untuk
	// menghindari memory leak.
	@Override
	public void onDetach(){
		super.onDetach();
		this.listener = null;
	}
	
	// method ini dipanggil saat method onCreate() milik activity memanggil
	// sudah sempurna dijalankan
	// di method ini kita bisa membaca object milik activity berdasarkan Viewnya.
	@Override
	public void onActivityCreated(Bundle savedInstanceState){
		super.onActivityCreated(savedInstanceState);
	}
	
}
 


	