package com.example.mycoollib;





public class Point{


	private float mLatitude;


	private float mLongitude;

	public Point(float mLatitude, float mLongitude) {
		this.mLatitude = mLatitude;
		this.mLongitude = mLongitude;
	}

	public void setMLatitude(float mLatitude){
		this.mLatitude = mLatitude;
	}

	public float getMLatitude(){
		return mLatitude;
	}

	public void setMLongitude(float mLongitude){
		this.mLongitude = mLongitude;
	}

	public float getMLongitude(){
		return mLongitude;
	}

	@Override
 	public String toString(){
		return 
			"Point{" + 
			"mLatitude = '" + mLatitude + '\'' + 
			",mLongitude = '" + mLongitude + '\'' + 
			"}";
		}
}