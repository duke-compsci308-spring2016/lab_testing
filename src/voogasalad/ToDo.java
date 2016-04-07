package voogasalad;

import java.util.ResourceBundle;

public class ToDo {
	private static final String DEFAULT_BASE = "invalidbasegiven";
	private ResourceBundle myAttributesResources;
	private String bundleBase;

	public ToDo(String bundleBase) {
		this.bundleBase = bundleBase;
		setResources();
	}

	private void setResources(){
		try{
			this.myAttributesResources = ResourceBundle.getBundle(bundleBase);
		}catch(Exception e){
			this.myAttributesResources = ResourceBundle.getBundle(DEFAULT_BASE);
		}
	}
	
	public String getResourcesBundleBaseName(){
		return myAttributesResources.getBaseBundleName();
	}

}
