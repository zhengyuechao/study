/**
 * @Title: Client.java
 * @Package com.adamjwh.gofex.mediator
 * @Description: 
 * @author adamjwh
 * @date 2018年7月28日
 * @version V1.0
 */
package com.adamjwh.gofex.mediator;

/**
 * @ClassName: Client
 * @Description: 中介者模式——联合国
 * @author adamjwh
 * @date 2018年7月28日
 *
 */
public class Client {

	public static void main(String[] args) {
		
		UnitedNationsSecurityCouncil UNSC = new UnitedNationsSecurityCouncil();
		
		USA usa = new USA(UNSC);
		Iraq iraq = new Iraq(UNSC);
		
		UNSC.setUsa(usa);
		UNSC.setIraq(iraq);
		
		usa.declare("不准研制核武器");
		iraq.declare("我们没有核武器");
	}

}
