/**
 *   File Name: VehicleTests.java<br>
 *
 *   LastName, FirstName<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Apr 4, 2016
 *
 */

package com.sqa.MA.interfaces;

import org.junit.Test;

import com.sqa.MA.Interfaces.Boat;
import com.sqa.MA.Interfaces.Car;
import com.sqa.MA.Interfaces.IVehicle;
import com.sqa.MA.Interfaces.Plane;
import com.sqa.MA.Interfaces.Train;

/**
 * VehicleTests //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author LastName, FirstName
 * @version 1.0.0
 * @since 1.0
 *
 */
public class VehicleTests {

	@Test
	public void test() {
		IVehicle[] vehicles = { new Boat(), new Car(), new Train(), new Plane(), new Boat("Master Cruiser", .75),
				new Car("Spiky Car"), new Train("Thomas"), new Plane("JetX-45G"), new Boat("Slow Rower", .2),
				new Car("ZoomDoom"), new Train("Diesel"), new Plane("MiniNav-50X") };
		System.out.println("My Vehicles:");
		for (int i = 0; i < vehicles.length; i++) {
			System.out.println("Vehicle " + (i + 1) + ": " + vehicles[i]);
			vehicles[i].moveVehicle();
		}
	}

}