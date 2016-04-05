/**
 *   File Name: IVehicle.java<br>
 *
 *   LastName, FirstName<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Apr 4, 2016
 *
 */

package com.sqa.MA.Interfaces;

/**
 * IVehicle //ADDD (description of class)
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
public interface IVehicle {

	public int calcSpeed();

	public String getName();

	public boolean moveVehicle();

	public void setName(String name);

	public double stopVehicle();

}
