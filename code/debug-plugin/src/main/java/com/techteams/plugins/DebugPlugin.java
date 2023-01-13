package com.techteams.plugins;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

@Mojo(name = "debug")
public class DebugPlugin extends AbstractMojo {
	@Parameter(property = "msg", required = true, defaultValue = "none")
	private String msg;

	@Override
	public void execute() throws MojoExecutionException, MojoFailureException {
		super.getLog().info("DebugPlugin: "+ msg);
	}

}
