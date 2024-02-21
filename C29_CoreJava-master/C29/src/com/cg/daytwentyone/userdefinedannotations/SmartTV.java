//define user defined annotation- @SmartTV
package com.cg.daytwentyone.userdefinedannotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface SmartTV {
	
	String os();
	
	int width();
	
	int height();

}
