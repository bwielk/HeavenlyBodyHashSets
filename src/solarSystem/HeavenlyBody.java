package solarSystem;

import java.util.*;

public final class HeavenlyBody {

	private final String name;
	private final double orbitalPeriod;
	private final Set<HeavenlyBody> satellites;
	
	public HeavenlyBody(String name, double orbitalPeriod){
		this.name = name;
		this.orbitalPeriod = orbitalPeriod;
		this.satellites = new HashSet<HeavenlyBody>();
	}

	public double getOrbitalPeriod() {
		return orbitalPeriod;
	}

	public String getName(){
		return name;
	}
	
	public boolean addMoon(HeavenlyBody moon){
		return this.satellites.add(moon);
	}
	
	public Set<HeavenlyBody> getSatellites(){
		return new HashSet<HeavenlyBody>(this.satellites);
	}
	
	@Override
	public boolean equals(Object object){
		if(this == object){
			return true;
		}
		if(object == null || this.getClass() != object.getClass()){
			return false;
		}
		String objectName = ((HeavenlyBody)object).getName();
		return this.name.equals(objectName);
	}
}
