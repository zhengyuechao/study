/**
 * @Title: UnitedNationsSecurityCouncil.java
 * @Package com.adamjwh.gofex.mediator
 * @Description: 
 * @author adamjwh
 * @date 2018年7月28日
 * @version V1.0
 */
package com.adamjwh.gofex.mediator;

/**
 * @ClassName: UnitedNationsSecurityCouncil
 * @Description: 联合国安全理事会
 * @author adamjwh
 * @date 2018年7月28日
 *
 */
public class UnitedNationsSecurityCouncil extends UnitedNations {

	private USA usa;
	private Iraq iraq;
	
	public void setUsa(USA usa) {
		this.usa = usa;
	}

	public void setIraq(Iraq iraq) {
		this.iraq = iraq;
	}

	@Override
	public void declare(String message, Country country) {
		if(country == usa) {
			iraq.getMessage(message);
		} else {
			usa.getMessage(message);
		}
	}

}
