package solarSystem;

import java.util.*;

public class Main {
	
	private static Map<String, HeavenlyBody> solarSystem = new HashMap<>();
	private static Set<HeavenlyBody> planets = new HashSet<>();
	
	public static void main(String[] args){
		HeavenlyBody temp = new HeavenlyBody("Mercury", 88);
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);
		
		temp = new HeavenlyBody("Venus", 225);
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);
		
		temp = new HeavenlyBody("Earth", 365);
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);
		
		HeavenlyBody tempMoon = new HeavenlyBody("Moon", 27);
		solarSystem.put(tempMoon.getName(), tempMoon);
		temp.addMoon(tempMoon);
		
		temp = new HeavenlyBody("Jupiter", 4380);
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);
		
		tempMoon = new HeavenlyBody("Europa", 3.5);
		solarSystem.put(tempMoon.getName(), tempMoon);
		temp.addMoon(tempMoon);
	
		tempMoon = new HeavenlyBody("Ganymede", 7.1);
		solarSystem.put(tempMoon.getName(), tempMoon);
		temp.addMoon(tempMoon);
		
		tempMoon = new HeavenlyBody("Callisto", 16.7);
		solarSystem.put(tempMoon.getName(), tempMoon);
		temp.addMoon(tempMoon);
		
		System.out.println("Planets: ");
		for(HeavenlyBody planet : planets){
			System.out.println(planet.getName());
		}
		
		Set<HeavenlyBody> moons = new HashSet<>();
		for(HeavenlyBody planet : planets){
			moons.addAll(planet.getSatellites());
		}
		
		System.out.println("All moons in the system");
		for(HeavenlyBody moon : moons){
			System.out.println("\t" + moon.getName());
		}
		
		HeavenlyBody jupiter = new HeavenlyBody("Jupiter",842);
		planets.add(jupiter);
		
		for(HeavenlyBody planet : planets){
			System.out.println(planet.getName() + ": " + planet.getOrbitalPeriod() );
		}
	}

}
