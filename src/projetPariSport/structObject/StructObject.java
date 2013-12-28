package projetPariSport.structObject;

import java.lang.reflect.InvocationTargetException;

import org.apache.commons.beanutils.BeanUtils;
import org.xml.sax.Attributes;

import com.google.common.base.CaseFormat;

/**
 * StructObject - Definition of the object Standings
 * Contains all the data and all the common treatments to all objects
 * 
 * @version 1.0
 *
 * @author Rodier Madiande
 * @date 26/12/2013
 *
 */
public class StructObject {

	public StructObject() {
	
	}
		
	/** 
	 * setAttributesValues
	 * Set values matching all sax attributes to the instances variables automatically
	 * 
	 * @param       attributes an argument of type Attributes 
	 * @param       base identifies the basis of assigning a variabe
	 * <p>
	 * Example:
	 * <home name="Indiana Pacers" alias="IND" id="583ec7cd-fb46-11e1-82cb-f4ce4684ea4c">
     *   </home>
     *   <away name="Orlando Magic" alias="ORL" id="583ed157-fb46-11e1-82cb-f4ce4684ea4c">
     *   </away>
     * Since there are homonyms in the name fields to recovered, we can define a base.
     * In the object we will have, homeName and awayName 
     * </p>
	 * @exception   NumberFormatException 
	 * @exception 	ExceptiIllegalAccessException
	 * @exception	InvocationTargetException
	 * 
	 * @author   Rodier Madiande 
	 * @date     26/12/2013 
	 */
	public void setAttributesValues(Attributes attributes, String base){
		
		int len = attributes.getLength();
		for(int i = 0; i < len; i++)
		{
			String sAttrName = ("".equals(base))
					?CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, attributes.getLocalName(i))
					:CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, base)
					+CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, attributes.getLocalName(i));
					
			String sVal = attributes.getValue(i);

			try {
				BeanUtils.setProperty(this,sAttrName,sVal);
			} catch (NumberFormatException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			}
		}
	}
}
