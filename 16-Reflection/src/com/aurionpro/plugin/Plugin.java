package com.aurionpro.plugin;

public class Plugin {
	
	private double version;
    
	
	
	public Plugin() {
	}

	private Plugin(double version) {
		super();
		this.version = version;
	}
	
	public void execute() {
		System.out.println("Plugin Executed");
	}

	

}
