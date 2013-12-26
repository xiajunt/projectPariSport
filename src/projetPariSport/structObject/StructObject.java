package projetPariSport.structObject;

import java.beans.Introspector;
import java.lang.reflect.InvocationTargetException;

import org.apache.commons.beanutils.BeanUtils;
import org.xml.sax.Attributes;

import projetPariSport.utils.Utils;

/* Contains all the data and all the common treatments to all objects
 * 
 */
public class StructObject {

	public StructObject() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Set values matching all Sax attributes to the Intances variables
	 * @param attributes
	 * @param base
	 */
	public void setAttributesValues(Attributes attributes, String base){
		
		int len = attributes.getLength();
		for(int i = 0; i < len; i++)
		{
			String sAttrName = ("".equals(base))?Introspector.decapitalize(Utils.toCamelCase(attributes.getLocalName(i))):base+Utils.toCamelCase(attributes.getLocalName(i));
			String sVal = attributes.getValue(i);
			try {
				BeanUtils.setProperty(this,sAttrName,sVal);
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
