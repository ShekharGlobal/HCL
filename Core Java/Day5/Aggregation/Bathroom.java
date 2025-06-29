package com.cts;
//HAS-A
//Composition/Aggregation
public class Bathroom {
	private Tub tub;

	// Constructor to initialize the Tub
	public Bathroom() {
		tub = new Tub();
	}
	
	 // Constructor accepting an existing Tub
    public Bathroom(Tub tub) {
        this.tub = tub;
    }

	public void fillTub() {
		tub.fillTub();

	}
}