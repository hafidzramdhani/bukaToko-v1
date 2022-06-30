package com.splash.sc;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;


public class HomeFragment extends Fragment {
	
	MainActivity activity;
	FragmentActivity listener;
	
	public static HomeFragment newInstance(){
		return new HomeFragment();
	}
	
	// Event ini dipanggil pertam akali sebelum pembuatan fragment atau pembacaan
    // layout lain. Method onAttach dipanggil saat sebuah instance Fragment 
    // terhuubng dengan sebuah Activity.
    // Method ini tidak berarti Activity sudah dimuat sempurna
	@Override
	public void onAttach(Context context){
		super.onAttach(context);
		
		if(context instanceof MainActivity){
			this.listener = (FragmentActivity) context;
			activity=(MainActivity) context;
	}
		else {
			throw new RuntimeException(context.toString() + "must implement MainActivity");
		}
}
	
	@Nullable
	@Override
	public View onCreateView(@NonNull LayoutInflater inflater,@Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_home, container, false);
		setHasOptionsMenu(true);
		return view;
	}
	
	@Override
	public void onCreateOptionsMenu(Menu menu, MenuInflater inflater){
		inflater.inflate(R.menu.notifications_bar,menu);
		super.onCreateOptionsMenu(menu,inflater);
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
	
	public interface activity{
		
	}

}
