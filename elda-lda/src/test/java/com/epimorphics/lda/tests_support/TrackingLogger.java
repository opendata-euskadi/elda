/*
    See lda-top/LICENCE (or https://raw.github.com/epimorphics/elda/master/LICENCE)
    for the licence for this software.
    
    (c) Copyright 2015 Epimorphics Limited
*/

package com.epimorphics.lda.tests_support;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.Marker;

/**
	Utility logger for use when testing classes that do logging -- their
	log object can be temporarily replaced with a TrackingLogger that
	records their results and makes them available to test assertions.
	
	NOTE that only as much of this is implemented as required; testing
	additional log methods will require them to be implemented in this
	class.
*/
public class TrackingLogger implements Logger {
	
	public List<String> messages = new ArrayList<String>();
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isTraceEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void trace(String msg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void trace(String format, Object arg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void trace(String format, Object arg1, Object arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void trace(String format, Object... arguments) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void trace(String msg, Throwable t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isTraceEnabled(Marker marker) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void trace(Marker marker, String msg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void trace(Marker marker, String format, Object arg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void trace(Marker marker, String format, Object arg1, Object arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void trace(Marker marker, String format, Object... argArray) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void trace(Marker marker, String msg, Throwable t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isDebugEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void debug(String msg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void debug(String format, Object arg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void debug(String format, Object arg1, Object arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void debug(String format, Object... arguments) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void debug(String msg, Throwable t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isDebugEnabled(Marker marker) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void debug(Marker marker, String msg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void debug(Marker marker, String format, Object arg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void debug(Marker marker, String format, Object arg1, Object arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void debug(Marker marker, String format, Object... arguments) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void debug(Marker marker, String msg, Throwable t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isInfoEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void info(String msg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void info(String format, Object arg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void info(String format, Object arg1, Object arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void info(String format, Object... arguments) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void info(String msg, Throwable t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isInfoEnabled(Marker marker) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void info(Marker marker, String msg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void info(Marker marker, String format, Object arg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void info(Marker marker, String format, Object arg1, Object arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void info(Marker marker, String format, Object... arguments) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void info(Marker marker, String msg, Throwable t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isWarnEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void warn(String msg) {
		messages.add("WARN: " + msg);
	}

	@Override
	public void warn(String format, Object arg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void warn(String format, Object... arguments) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void warn(String format, Object arg1, Object arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void warn(String msg, Throwable t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isWarnEnabled(Marker marker) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void warn(Marker marker, String msg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void warn(Marker marker, String format, Object arg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void warn(Marker marker, String format, Object arg1, Object arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void warn(Marker marker, String format, Object... arguments) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void warn(Marker marker, String msg, Throwable t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isErrorEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void error(String msg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void error(String format, Object arg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void error(String format, Object arg1, Object arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void error(String format, Object... arguments) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void error(String msg, Throwable t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isErrorEnabled(Marker marker) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void error(Marker marker, String msg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void error(Marker marker, String format, Object arg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void error(Marker marker, String format, Object arg1, Object arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void error(Marker marker, String format, Object... arguments) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void error(Marker marker, String msg, Throwable t) {
		// TODO Auto-generated method stub
		
	}
}